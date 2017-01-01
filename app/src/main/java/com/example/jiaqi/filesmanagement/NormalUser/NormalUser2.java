package com.example.jiaqi.filesmanagement.NormalUser;

import android.app.Activity;
import android.content.Intent;
import android.icu.text.Normalizer2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jiaqi.filesmanagement.MainLogin;
import com.example.jiaqi.filesmanagement.Manager.Management;
import com.example.jiaqi.filesmanagement.R;

import static android.R.attr.button;
import static com.example.jiaqi.filesmanagement.NormalUser.NormalUser1.activity_NU1;

public class NormalUser2 extends AppCompatActivity {

    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_user2);

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
                Intent intent = new Intent(NormalUser2.this, NormalChangepw.class);
                startActivity(intent);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NormalUser2.this, MainLogin.class);
                startActivity(intent);
                activity_NU1.finish();
                finish();
            }
        });
    }
}
