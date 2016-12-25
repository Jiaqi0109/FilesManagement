package com.example.jiaqi.filesmanagement;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Administrator2 extends Activity implements AdapterView.OnItemSelectedListener{

    private TextView textView;
    private Spinner spinner;
    private List<String> list;
    private EditText editText1;
    private EditText editText2;
    private ArrayAdapter<String> arrayAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator2);

        Bundle bundle = this.getIntent().getExtras();

        int name = bundle.getInt("name");
        Toast.makeText(this, "获取到的name值为 " + name,
                Toast.LENGTH_SHORT).show();

        editText1=(EditText)findViewById(R.id.main2_text1);
        editText2=(EditText)findViewById(R.id.main2_text4);
        editText1.setFocusable(false);
        editText1.setFocusableInTouchMode(false);
        editText2.setFocusable(false);
        editText2.setFocusableInTouchMode(false);

        Button button1=(Button)findViewById(R.id.main2_button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setFocusableInTouchMode(true);
                editText1.setFocusable(true);
                editText1.requestFocus();
                editText2.setFocusableInTouchMode(true);
                editText2.setFocusable(true);
                editText2.requestFocus();
            }
        });

        Button button2=(Button)findViewById(R.id.main2_button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setFocusable(false);
                editText1.setFocusableInTouchMode(false);
                editText2.setFocusable(false);
                editText2.setFocusableInTouchMode(false);
            }
        });


        textView=(TextView)findViewById(R.id.main2_text2);
        spinner=(Spinner)findViewById(R.id.spinner);
        textView.setText("默认为男");
        list=new ArrayList<String>();
        list.add("男");
        list.add("女");

        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String sex=arrayAdapter.getItem(position);
        textView.setText("性别");

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
