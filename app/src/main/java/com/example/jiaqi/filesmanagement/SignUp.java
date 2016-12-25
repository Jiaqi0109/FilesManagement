package com.example.jiaqi.filesmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    private Button btsg;
    private TextView textuser;
    private TextView textpw1;
    private TextView textpw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        textuser = (TextView) findViewById(R.id.editText1);
        textpw1 = (TextView) findViewById(R.id.editText2);
        textpw2 = (TextView) findViewById(R.id.editText3);
        /*
         *  按钮click操作
         */
        btsg = (Button) findViewById(R.id.return1);
        btsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textuser.getText().length() == 0 || textpw1.getText().length() == 0 || textpw2.getText().length() == 0){
                    Toast.makeText(getApplicationContext(), "ERROR!", Toast.LENGTH_LONG).show();
                    textuser.setText("");
                    textpw1.setText("");
                    textpw2.setText("");
                }
                else if (textpw2.getText().toString().trim().equals(textpw1.getText().toString().trim())) {
                    Intent data = new Intent();
                    data.putExtra("data", textuser.getText().toString());
                    setResult(2, data);
                    finish();               //结束此页面
                }
                else{
                    Toast.makeText(getApplicationContext(), "Sign-up Fault!", Toast.LENGTH_LONG).show();
                    textpw1.setText("");
                    textpw2.setText("");
                }
            }
        });

    }
}