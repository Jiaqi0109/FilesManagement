package com.example.jiaqi.filesmanagement.Others;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jiaqi.filesmanagement.ChangePassword;
import com.example.jiaqi.filesmanagement.MainLogin;
import com.example.jiaqi.filesmanagement.R;

public class OtherUser extends AppCompatActivity {
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_user);

        bt1 = (Button) findViewById(R.id.NborrowSearch);
        bt2 = (Button) findViewById(R.id.NborrowList);
        bt3 = (Button) findViewById(R.id.Nchangepw);
        bt4 = (Button) findViewById(R.id.Nlogout);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OtherUser.this, ChangePassword.class);
                startActivity(intent);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OtherUser.this, MainLogin.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
