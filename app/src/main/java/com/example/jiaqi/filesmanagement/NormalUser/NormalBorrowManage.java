package com.example.jiaqi.filesmanagement.NormalUser;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.jiaqi.filesmanagement.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class NormalBorrowManage extends ListFragment {

    private String str,str2="你是个傻逼";


    public void onCreate(Bundle savedInstanceState) {

        final String[] from = new String[] {"学号", "借阅日期","借阅原因","处理时间","是否同意借阅"};
        final int[] to = new int[] {R.id.jieyue_text1, R.id.jieyue_text2, R.id.jieyue_text3, R.id.jieyue_text4, R.id.jieyue_text5};
        super.onCreate(savedInstanceState);

        SimpleAdapter jie_adapter = new SimpleAdapter(
                this.getActivity(), getSimpleData(),
                R.layout.normal_borrow_item, from, to);
        this.setListAdapter(jie_adapter);
    }

    public void onListItemClick(ListView parent, View v, int position, long id) {
       /*str2="拒绝借阅原因";*/
        if(str=="false"){
            new  AlertDialog.Builder(getActivity())
                    .setTitle("被拒原因" )
                    .setMessage(str2 )
                    .setPositiveButton("确定" ,  null )
                    .show();
        }
        else{
            Intent intent = new Intent(getActivity(), NormalBorrowView.class);
            Bundle bundle=new Bundle();
            bundle.putInt("学号", position);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

    private List<Map<String, Object>> getSimpleData() {
        List<Map<String, Object>> list3 = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("学号", "001");
        map.put("借阅日期", "2016.1.1");
        map.put("借阅原因", "因为我是傻逼");
        map.put("处理时间", "2017.1.1");
        map.put("是否同意借阅", "true");
        list3.add(map);

        map = new HashMap<String, Object>();
        map.put("学号", "002");
        map.put("借阅日期", "2016.1.1");
        map.put("借阅原因", "因为我是傻逼");
        map.put("处理时间", "2017.1.1");
        map.put("是否同意借阅", "false");
        list3.add(map);

        map = new HashMap<String, Object>();
        map.put("学号", "003");
        map.put("借阅日期", "2016.1.1");
        map.put("借阅原因", "因为我是傻逼");
        map.put("处理时间", "2017.1.1");
        map.put("是否同意借阅", "true");
        list3.add(map);

        return list3;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.mfragment_power, container, false);
    }

}
