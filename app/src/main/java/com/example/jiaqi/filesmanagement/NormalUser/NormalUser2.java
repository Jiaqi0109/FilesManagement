package com.example.jiaqi.filesmanagement.NormalUser;

import android.app.Activity;
import android.content.Intent;
import android.icu.text.Normalizer2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jiaqi.filesmanagement.Manager.Management;
import com.example.jiaqi.filesmanagement.R;

import static android.R.attr.button;

public class NormalUser2 extends AppCompatActivity {

    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_user2);

        bt1 = (Button) findViewById(R.id.button2);
        bt2 = (Button) findViewById(R.id.button3);
        bt3 = (Button) findViewById(R.id.button4);
        bt4 = (Button) findViewById(R.id.button5);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NormalUser2.this, UserSetting.class);
                Bundle bundle = new Bundle();
                bundle.putInt("i", 1);
                intent.putExtras(bundle);
                startActivity(intent);
            }

        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NormalUser2.this, UserSetting.class);
                Bundle bundle = new Bundle();
                bundle.putInt("i", 2);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
