package com.example.jiaqi.filesmanagement.Manager;


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

import com.example.jiaqi.filesmanagement.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MFragmentPower extends ListFragment {

    private ArrayAdapter<String> po_adapter;

    public void onCreate(Bundle savedInstanceState) {

        final String[] from = new String[] {"姓名", "类型"};
        final int[] to = new int[] {R.id.text1, R.id.text2};
        super.onCreate(savedInstanceState);
        SimpleAdapter po_adapter = new SimpleAdapter(
                this.getActivity(), getSimpleData(),
                R.layout.list_item, from, to);
        this.setListAdapter(po_adapter);
    }

    public void onListItemClick(ListView parent, View v,int position, long id) {

        dialog1();

    }
    private void dialog1(){
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());  //先得到构造器
        builder.setTitle("提示"); //设置标题
        builder.setMessage("是否改变用户类型?"); //设置内容
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
                Toast.makeText(getActivity(), "取消" + which, Toast.LENGTH_SHORT).show();
            }
        });

        //参数都设置完成了，创建并显示出来
        builder.create().show();
    }

    private List<Map<String, Object>> getSimpleData() {
        List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("姓名", "李明");
        map.put("类型", "管理员");
        list1.add(map);

        map = new HashMap<String, Object>();
        map.put("姓名", "张红");
        map.put("类型", "学生");
        list1.add(map);

        map = new HashMap<String, Object>();
        map.put("姓名", "王强");
        map.put("类型", "学生");
        list1.add(map);

        return list1;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_view, container, false);
    }

}
