package com.example.jiaqi.filesmanagement;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Administrator2 extends Activity implements AdapterView.OnItemSelectedListener {

    private List<String> list;
    private TextView textView;
    private Spinner spinner1;
    private Spinner spinner2;
    private ArrayAdapter<String> arrayAdapter;
    private ImageView imageView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator2);

        Bundle bundle = this.getIntent().getExtras();


        /*
         * Spinner选择政治面貌
         */
        spinner2 = (Spinner)findViewById(R.id.Spface);
        list = new ArrayList<String>();
        list.add("共青团员");
        list.add("群众");
        list.add("党员");
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter);
        spinner2.setOnItemSelectedListener(this);

        /*
         * Spinner选择性别
         */
        spinner1 = (Spinner)findViewById(R.id.Spsex);
        list = new ArrayList<String>();
        list.add("男");
        list.add("女");
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter);
        spinner1.setOnItemSelectedListener(this);

        /*
         * 设置图片
         */
        TypedArray ar = this.getResources().obtainTypedArray(R.array.action_images);
        int len = ar.length();
        int[] resIds = new int[len];
        for (int i = 0; i < len; i++)
            resIds[i] = ar.getResourceId(i, 0);
        ar.recycle();

        int j = (int)Math.round(Math.random()*100)%23;
        imageView = (ImageView) findViewById(R.id.Spic);
        imageView.setImageResource(resIds[j]);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    /*
     * Spinner结束
     */
}
