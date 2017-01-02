package com.example.jiaqi.filesmanagement.NormalUser;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jiaqi.filesmanagement.MainLogin;
import com.example.jiaqi.filesmanagement.R;

public class NormalUser1 extends AppCompatActivity {
    static Activity activity_NU1;
    private Button Bt_exit, Bt_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fileview_cannot_change);

        activity_NU1 = this;

        Bt_setting = (Button)findViewById(R.id.button2);
        Bt_setting.setText("设置");
        Bt_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NormalUser1.this, NormalUser2.class);
                startActivity(intent);
            }
        });

        Bt_exit = (Button)findViewById(R.id.button1);
        Bt_exit.setText("退出");
        Bt_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
