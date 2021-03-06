package com.example.jiaqi.filesmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jiaqi.filesmanagement.Manager.Administrator;
import com.example.jiaqi.filesmanagement.NormalUser.NormalUser1;
import com.example.jiaqi.filesmanagement.Others.OtherUser;

public class MainLogin extends Activity {

    private Button btup, btin, btch;
    private TextView textuser;
    private TextView textpw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        textuser = (TextView) findViewById(R.id.username);
        textpw = (TextView) findViewById(R.id.pwname);
        /*
         *  登录按钮跳转
         */
        btin = (Button) findViewById(R.id.sign_in);
        btin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textuser.getText().toString().trim().equals("1")) {
                    Intent intent = new Intent(MainLogin.this, Administrator.class);
                    startActivity(intent);
                }else if(textuser.getText().toString().trim().equals("2")){
                    Intent intent = new Intent(MainLogin.this, NormalUser1.class);
                    startActivity(intent);
                }else if(textuser.getText().toString().trim().equals("3")){
                    Intent intent = new Intent(MainLogin.this, OtherUser.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(MainLogin.this, Administrator.class);
                    startActivity(intent);
                }

                finish();
            }
        });

        /*
         *  注册按钮跳转
         */
        btup = (Button) findViewById(R.id.sign_up);
        btup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLogin.this, SignUp.class);
                startActivityForResult(intent, 1);
            }
        });

        /*
         * 修改密码跳转
         */
        btch = (Button) findViewById(R.id.change);
        btch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLogin.this, ChangePassword.class);
                startActivityForResult(intent, 1);
            }
        });
    }
    /*
     *  接收注册页面回传数据
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1&& resultCode == 2){
            String content = data.getStringExtra("data");
            textuser.setText(content);
            Toast.makeText(getApplicationContext(), "Sign-up Success!", Toast.LENGTH_LONG).show();

        }

    }



}

