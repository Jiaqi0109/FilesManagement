package com.example.jiaqi.filesmanagement;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class MFragmentRecycle extends ListFragment {
    private ArrayAdapter<String> rec_adapter;

    public void onCreate(Bundle savedInstanceState) {

        final String[] from = new String[] {"姓名", "学号","用户名","被删日期"};
        final int[] to = new int[] {R.id.recycle_text1, R.id.recycle_text2, R.id.recycle_text3, R.id.recycle_text4};
        super.onCreate(savedInstanceState);
        SimpleAdapter rec_adapter = new SimpleAdapter(
                this.getActivity(), getSimpleData(),
                R.layout.list_item_recycle, from, to);
        this.setListAdapter(rec_adapter);
    }
    public void onListItemClick(ListView parent, View v,int position, long id) {
        Toast.makeText(getActivity(),
                "You have selected " + position,
                Toast.LENGTH_SHORT).show();
        dialog1();



    }
    private void dialog1(){
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());  //先得到构造器
        builder.setTitle("提示"); //设置标题
        builder.setMessage("是否彻底删除?"); //设置内容
        builder.setIcon(R.mipmap.ic_launcher);//设置图标，图片id即可
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() { //设置确定按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); //关闭dialog
                Toast.makeText(getActivity(), "确认" + which, Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(getActivity(), "还原" + which, Toast.LENGTH_SHORT).show();
            }
        });

        //参数都设置完成了，创建并显示出来
        builder.create().show();
    }

    private List<Map<String, Object>> getSimpleData() {
        List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("姓名", "张三");
        map.put("学号", "001");
        map.put("用户名", "方楠");
        map.put("被删日期", "2017.1.1");
        list1.add(map);

        map = new HashMap<String, Object>();
        map.put("姓名", "李四");
        map.put("学号", "002");
        map.put("用户名", "方楠");
        map.put("被删日期", "2017.1.1");
        list1.add(map);

        map = new HashMap<String, Object>();
        map.put("姓名", "王五");
        map.put("学号", "003");
        map.put("用户名", "方楠");
        map.put("被删日期", "2017.1.1");
        list1.add(map);

        return list1;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mfragment_recycle,container,false);
        return view;
    }


}