package com.example.jiaqi.filesmanagement.Manager;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.jiaqi.filesmanagement.R;

import java.util.ArrayList;
import java.util.List;

public class Inquier_son extends Activity{
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
        bt2.setText("下一个");
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
