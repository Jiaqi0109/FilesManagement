package com.example.jiaqi.filesmanagement.NormalUser;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.jiaqi.filesmanagement.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NormalBorrowManage extends AppCompatActivity implements AdapterView.OnItemClickListener {



    static Activity activity_NB;
    private ListView Lv;
    private String str, str2 = "拒绝借阅。";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_normal_borrow);

        activity_NB = this;


        Lv = (ListView) findViewById(R.id.list1);
        final String[] from = new String[]{"学号", "借阅日期", "借阅原因", "处理时间", "是否同意借阅"};
        final int[] to = new int[]{R.id.jieyue_text1, R.id.jieyue_text2, R.id.jieyue_text3, R.id.jieyue_text4, R.id.jieyue_text5};
        SimpleAdapter jie_adapter = new SimpleAdapter(
                this, getSimpleData(),
                R.layout.list_item_normal_borrow, from, to);
        Lv.setAdapter(jie_adapter);
        Lv.setOnItemClickListener(this);


    }

    private List<Map<String, Object>> getSimpleData() {
        List<Map<String, Object>> list3 = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("学号", "001");
        map.put("借阅日期", "2016.1.1");
        map.put("借阅原因", "需求");
        map.put("处理时间", "2017.1.1");
        map.put("是否同意借阅", "true");
        list3.add(map);

        map = new HashMap<String, Object>();
        map.put("学号", "002");
        map.put("借阅日期", "2016.1.1");
        map.put("借阅原因", "需求");
        map.put("处理时间", "2017.1.1");
        map.put("是否同意借阅", "false");
        list3.add(map);

        map = new HashMap<String, Object>();
        map.put("学号", "003");
        map.put("借阅日期", "2016.1.1");
        map.put("借阅原因", "需求");
        map.put("处理时间", "2017.1.1");
        map.put("是否同意借阅", "true");
        list3.add(map);

        return list3;
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String text = Lv.getItemAtPosition(i) + "";

        int a,b;
        a=getCharacterPosition(text);

        b=getCharacterPosition2(text);
        str=text.substring(a+1,b);
        Toast.makeText(this,"位置="+str, Toast.LENGTH_LONG).show();
        if(str.equals("false")){
            new  AlertDialog.Builder(this)
                    .setTitle("被拒原因" )
                    .setMessage(str2 )
                    .setPositiveButton("确定" ,  null )
                    .show();

        }
        else{
            Intent intent = new Intent(this, Borrow.class);
            Bundle bundle=new Bundle();
            bundle.putInt("学号", i);
            intent.putExtras(bundle);
            startActivity(intent);

        }
    }

    public static int getCharacterPosition(String string) {
        Matcher slashMatcher = Pattern.compile("=").matcher(string);
        int mIdx = 0;
        while (slashMatcher.find()) {
            mIdx++;
            if (mIdx == 3) {
                break;
            }
        }
        return slashMatcher.start();
    }
    public static int getCharacterPosition2(String string) {
        Matcher slashMatcher = Pattern.compile(",").matcher(string);
        int mIdx = 0;
        while (slashMatcher.find()) {
            mIdx++;
            if (mIdx == 3) {
                break;
            }
        }
        return slashMatcher.start();
    }
}

