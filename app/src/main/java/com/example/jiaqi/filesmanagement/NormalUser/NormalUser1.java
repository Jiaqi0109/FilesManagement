package com.example.jiaqi.filesmanagement.NormalUser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jiaqi.filesmanagement.MainLogin;
import com.example.jiaqi.filesmanagement.R;

public class NormalUser1 extends AppCompatActivity {
    private Button Bt_exit, Bt_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_user1);

        Bt_setting = (Button)findViewById(R.id.Ssetting);
        Bt_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NormalUser1.this, NormalUser2.class);
                startActivity(intent);
            }
        });

        Bt_exit = (Button)findViewById(R.id.Sexit);
        Bt_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
