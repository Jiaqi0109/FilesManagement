package com.example.jiaqi.filesmanagement.Others;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.jiaqi.filesmanagement.R;


public class OthersBorrow extends Activity {
    private Button bt1, bt2;
    private ImageView imageView;


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

                OthersBorrowManage.activity_OB.finish();
                Intent intent = new Intent(OthersBorrow.this, OthersBorrowManage.class);
                startActivity(intent);
                finish();
            }
        });

        /*
         * 设置图片
         */
        TypedArray ar = this.getResources().obtainTypedArray(R.array.action_images);
        int len = ar.length();
        int[] resIds = new int[len];
        for (int i = 0; i < len; i++)
            resIds[i] = ar.getResourceId(i, 0);
        ar.recycle();

        int j = (int)Math.round(Math.random()*100)%23+1;
        imageView = (ImageView) findViewById(R.id.Spic);
        imageView.setImageResource(resIds[j]);
    }
}
