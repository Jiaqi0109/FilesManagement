package com.example.jiaqi.filesmanagement.Manager;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.jiaqi.filesmanagement.R;

import java.util.ArrayList;
import java.util.List;

public class Administrator2 extends Activity implements AdapterView.OnItemSelectedListener {

    private List<String> list;
    private Spinner spinner1, spinner2, spinner3, spinner4;
    private ArrayAdapter<String> arrayAdapter;
    private ImageView imageView;
    private EditText editText1,editText2,editText3,editText5,editText6,editText7,editText8,editText9;
    private Button bt1, bt2, bt3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fileview_can_change);

        Bundle bundle = this.getIntent().getExtras();


        spinner4 = (Spinner)findViewById(R.id.Ssgrade);
        list = new ArrayList<String>();
        list.add("大一");
        list.add("大二");
        list.add("大三");
        list.add("大四");
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(arrayAdapter);
        spinner4.setOnItemSelectedListener(this);

        /*
         * Spinner2选择政治面貌
         */
        spinner2 = (Spinner)findViewById(R.id.Spface);
        list = new ArrayList<String>();
        list.add("共青团员");
        list.add("群众");
        list.add("党员");
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter);
        spinner2.setOnItemSelectedListener(this);

        /*
         * Spinner1选择性别
         */
        spinner1 = (Spinner)findViewById(R.id.Spsex);
        list = new ArrayList<String>();
        list.add("男");
        list.add("女");
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter);
        spinner1.setOnItemSelectedListener(this);

        /*
         * Spinner3选择民族
         */
        spinner3 = (Spinner)findViewById(R.id.Spnation);
        list = new ArrayList<String>();
        list.add("汉族");list.add("阿昌族");list.add("白族");list.add("保安族");list.add("布朗族");list.add("布依族");list.add("朝鲜族");list.add("达斡尔族");list.add("傣族");list.add("德昂族");list.add("东乡族");list.add("侗族");list.add("独龙族");list.add("俄罗斯族");
        list.add("鄂伦春族");list.add("鄂温克族");list.add("高山族");list.add("仡佬族");list.add("哈尼族");list.add("哈萨克族");list.add("赫哲族");list.add("回族");list.add("基诺族");list.add("京族");list.add("景颇族");list.add("柯尔克孜族");list.add("拉祜族");list.add("黎族");
        list.add("傈僳族");list.add("珞巴族");list.add("满族");list.add("毛南族");list.add("门巴族1");list.add("蒙古族");list.add("苗族");list.add("仫佬族");list.add("纳西族");list.add("怒族");list.add("普米族");list.add("羌族");list.add("撒拉族");list.add("畲族");
        list.add("水族");list.add("塔吉克族");list.add("塔塔尔族");list.add("土家族");list.add("土族");list.add("佤族");list.add("维吾尔族");list.add("乌孜别克族");list.add("锡伯族");list.add("瑶族");list.add("彝族");list.add("裕固族");list.add("藏族");list.add("壮族");list.add("其他");
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(arrayAdapter);
        spinner3.setOnItemSelectedListener(this);


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

        editText1=(EditText)findViewById(R.id.Snumber);//学号
        editText2=(EditText)findViewById(R.id.Sname);//姓名
        editText3=(EditText)findViewById(R.id.Sage);//年龄
        editText5=(EditText)findViewById(R.id.Sborn);//出生年月
        editText6=(EditText)findViewById(R.id.Sid);//身份证号
        editText7=(EditText)findViewById(R.id.Sacadmy);//学院
        editText8=(EditText)findViewById(R.id.Shome);//住址
        editText9=(EditText)findViewById(R.id.Sdata);//注册日期
        /*
        传值函数
         */
        editText1.setFocusable(false);
        editText1.setFocusableInTouchMode(false);
        editText2.setFocusable(false);
        editText2.setFocusableInTouchMode(false);
        editText3.setFocusable(false);
        editText3.setFocusableInTouchMode(false);
        editText5.setFocusable(false);
        editText5.setFocusableInTouchMode(false);
        editText6.setFocusable(false);
        editText6.setFocusableInTouchMode(false);
        editText7.setFocusable(false);
        editText7.setFocusableInTouchMode(false);
        editText8.setFocusable(false);
        editText8.setFocusableInTouchMode(false);
        editText9.setFocusable(false);
        editText9.setFocusableInTouchMode(false);

        spinner1.setClickable(false);
        spinner2.setClickable(false);
        spinner3.setClickable(false);
        spinner4.setClickable(false);



        bt1 = (Button)findViewById(R.id.button_1);//编辑
        bt1.setText("编辑");
        bt1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                editText2.setFocusable(true);
                editText2.setFocusableInTouchMode(true);

                editText3.setFocusable(true);
                editText3.setFocusableInTouchMode(true);

                editText5.setFocusable(true);
                editText5.setFocusableInTouchMode(true);

                editText6.setFocusable(true);
                editText6.setFocusableInTouchMode(true);

                editText7.setFocusable(true);
                editText7.setFocusableInTouchMode(true);

                editText8.setFocusable(true);
                editText8.setFocusableInTouchMode(true);

                editText2.requestFocus();

                spinner1.setClickable(true);
                spinner2.setClickable(true);
                spinner3.setClickable(true);
                spinner4.setClickable(true);

            }
        });


         bt2 = (Button)findViewById(R.id.button_2);//确定
         bt2.setText("确定");
         bt2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
            editText2.setFocusable(false);
            editText2.setFocusableInTouchMode(false);

            editText3.setFocusable(false);
            editText3.setFocusableInTouchMode(false);
            editText5.setFocusable(false);
            editText5.setFocusableInTouchMode(false);
            editText6.setFocusable(false);
            editText6.setFocusableInTouchMode(false);
            editText7.setFocusable(false);
            editText7.setFocusableInTouchMode(false);
            editText8.setFocusable(false);
            editText8.setFocusableInTouchMode(false);

            spinner1.setClickable(false);
            spinner2.setClickable(false);
            spinner3.setClickable(false);
            spinner4.setClickable(false);

            }
    });

        bt3 = (Button)findViewById(R.id.button_3);//删除
        bt3.setText("删除");
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Administrator.activity_Ad.finish();
                Intent intent = new Intent(Administrator2.this, Administrator.class);
                startActivity(intent);
                finish();
            }
        });

}
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    /*
     * Spinner结束
     */
}
