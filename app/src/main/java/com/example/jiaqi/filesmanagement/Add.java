package com.example.jiaqi.filesmanagement;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;

public class Add extends Activity implements AdapterView.OnItemSelectedListener {

    private List<String> list;
    private Spinner spinner1,spinner2,spinner3,spinner4;
    private ArrayAdapter<String> arrayAdapter;
    private ImageView imageView;
    private EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8,editText9;
    private Button bt1;
    private Button bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Bundle bundle = this.getIntent().getExtras();


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

        spinner4 = (Spinner)findViewById(R.id.Sgrade);
        list = new ArrayList<String>();
        list.add("大一");
        list.add("大二");
        list.add("大三");
        list.add("大四");
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
        editText4=(EditText)findViewById(R.id.Sgrade);//年级
        editText5=(EditText)findViewById(R.id.Sborn);//出生年月
        editText6=(EditText)findViewById(R.id.Sid);//身份证号
        editText7=(EditText)findViewById(R.id.Sacadmy);//学院
        editText8=(EditText)findViewById(R.id.Shome);//住址
        editText9=(EditText)findViewById(R.id.Sdata);//注册日期

    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    public void onNothingSelected(AdapterView<?> parent) {

    }
    /*
     * Spinner结束
     */
}
