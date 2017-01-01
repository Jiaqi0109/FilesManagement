package com.example.jiaqi.filesmanagement.Manager;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.jiaqi.filesmanagement.R;

import java.util.ArrayList;
import java.util.List;

public class Inquier_son extends Activity implements AdapterView.OnItemSelectedListener{
    private List<String> list;
    private Spinner spinner1;
    private Spinner spinner2, spinner3;
    private ArrayAdapter<String> arrayAdapter;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquier_son);

        Bundle bundle = this.getIntent().getExtras();

        /*
         * Spinner2选择政治面貌
         */
        spinner2 = (Spinner) findViewById(R.id.Spface);
        list = new ArrayList<String>();
        list.add("共青团员");
        list.add("群众");
        list.add("党员");
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter);
        spinner2.setOnItemSelectedListener(this);

        /*
         * Spinner1选择性别
         */
        spinner1 = (Spinner) findViewById(R.id.Spsex);
        list = new ArrayList<String>();
        list.add("男");
        list.add("女");
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter);
        spinner1.setOnItemSelectedListener(this);
        spinner3 = (Spinner) findViewById(R.id.Spnation);
        list = new ArrayList<String>();
        list.add("汉族");
        list.add("阿昌族");
        list.add("白族");
        list.add("保安族");
        list.add("布朗族");
        list.add("布依族");
        list.add("朝鲜族");
        list.add("达斡尔族");
        list.add("傣族");
        list.add("德昂族");
        list.add("东乡族");
        list.add("侗族");
        list.add("独龙族");
        list.add("俄罗斯族");
        list.add("鄂伦春族");
        list.add("鄂温克族");
        list.add("高山族");
        list.add("仡佬族");
        list.add("哈尼族");
        list.add("哈萨克族");
        list.add("赫哲族");
        list.add("回族");
        list.add("基诺族");
        list.add("京族");
        list.add("景颇族");
        list.add("柯尔克孜族");
        list.add("拉祜族");
        list.add("黎族");
        list.add("傈僳族");
        list.add("珞巴族");
        list.add("满族");
        list.add("毛南族");
        list.add("门巴族1");
        list.add("蒙古族");
        list.add("苗族");
        list.add("仫佬族");
        list.add("纳西族");
        list.add("怒族");
        list.add("普米族");
        list.add("羌族");
        list.add("撒拉族");
        list.add("畲族");
        list.add("水族");
        list.add("塔吉克族");
        list.add("塔塔尔族");
        list.add("土家族");
        list.add("土族");
        list.add("佤族");
        list.add("维吾尔族");
        list.add("乌孜别克族");
        list.add("锡伯族");
        list.add("瑶族");
        list.add("彝族");
        list.add("裕固族");
        list.add("藏族");
        list.add("壮族");
        list.add("其他");
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(arrayAdapter);
        spinner3.setOnItemSelectedListener(this);
        /*
         * Spinner3选择民族
         */

        /*
         * 设置图片
         */
        TypedArray ar = this.getResources().obtainTypedArray(R.array.action_images);
        int len = ar.length();
        int[] resIds = new int[len];
        for (int i = 0; i < len; i++)
            resIds[i] = ar.getResourceId(i, 0);
        ar.recycle();

        int j = (int) Math.round(Math.random() * 100) % 23 + 1;
        imageView = (ImageView) findViewById(R.id.Spic);
        imageView.setImageResource(resIds[j]);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
