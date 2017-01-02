package com.example.jiaqi.filesmanagement.Others;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jiaqi.filesmanagement.R;

public class OthersBorrow extends AppCompatActivity {
    private Button bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fileview_cannot_change);

        bt1 = (Button)findViewById(R.id.button1);
        bt1.setText("返回");
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        bt2 = (Button)findViewById(R.id.button2);
        bt2.setText("归还");
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
