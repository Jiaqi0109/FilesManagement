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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.jiaqi.filesmanagement.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class MFragmentBorrow extends ListFragment {
    public void onCreate(Bundle savedInstanceState) {

        final String[] from = new String[] {"申请人", "学号","申请日期","借阅原因"};
        final int[] to = new int[] {R.id.recycle_text1, R.id.recycle_text2, R.id.recycle_text3, R.id.recycle_text4};
        super.onCreate(savedInstanceState);
        SimpleAdapter bo_adapter = new SimpleAdapter(
                this.getActivity(), getSimpleData(),
                R.layout.list_item_borrow, from, to);
        this.setListAdapter(bo_adapter);
    }
    public void onListItemClick(ListView parent, View v, int position, long id) {
        Toast.makeText(getActivity(),
                "You have selected " + position,
                Toast.LENGTH_SHORT).show();
        dialog2();



    }
    private void dialog2(){
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());  //先得到构造器
        builder.setTitle("提示"); //设置标题
        builder.setMessage("请选择操作:"); //设置内容
        builder.setIcon(R.mipmap.ic_launcher);//设置图标，图片id即可

        builder.setPositiveButton("同意借阅", new DialogInterface.OnClickListener() { //设置确定按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); //关闭dialog
                Toast.makeText(getActivity(), "确认同意" + which, Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("拒绝借阅", new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                Toast.makeText(getActivity(), "因为你是个傻逼" , Toast.LENGTH_SHORT).show();
                final EditText editText = new EditText(getActivity());
                AlertDialog.Builder inputDialog =
                        new AlertDialog.Builder(getActivity());
                inputDialog.setTitle("请输入拒绝原因").setView(editText);
                inputDialog.setPositiveButton("确定",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getActivity(),
                                        editText.getText().toString(),
                                        Toast.LENGTH_SHORT).show();

                            }
                        }).show();
            }
        });

        //参数都设置完成了，创建并显示出来
        builder.create().show();
    }

    private List<Map<String, Object>> getSimpleData() {
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("申请人", "张三");
        map.put("学号", "001");
        map.put("申请日期", "2017.1.1");
        map.put("借阅原因", "因为嘉琪2");
        list2.add(map);

        map = new HashMap<String, Object>();
        map.put("申请人", "李四");
        map.put("学号", "002");
        map.put("申请日期", "2017.1.1");
        map.put("借阅原因", "因为嘉琪2");
        list2.add(map);

        map = new HashMap<String, Object>();
        map.put("申请人", "王五");
        map.put("学号", "003");
        map.put("申请日期", "2017.1.1");
        map.put("借阅原因", "因为嘉琪2");
        list2.add(map);

        return list2;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view,container,false);
        return view;
    }

}
