package com.example.jiaqi.filesmanagement;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MFragmentPower extends ListFragment {

    private ArrayAdapter<String> po_adapter;

    public void onCreate(Bundle savedInstanceState) {

        final String[] from = new String[] {"姓名", "学号"};
        final int[] to = new int[] {R.id.text1, R.id.text2};
        super.onCreate(savedInstanceState);
        SimpleAdapter po_adapter = new SimpleAdapter(
                this.getActivity(), getSimpleData(),
                R.layout.list_item, from, to);
        this.setListAdapter(po_adapter);
    }

    /*public void onListItemClick(ListView parent, View v,int position, long id) {

        Intent intent = new Intent(getActivity(), Administrator2.class);
        Bundle bundle=new Bundle();
        bundle.putInt("name", position);
        intent.putExtras(bundle);
        startActivity(intent);

    }*/

    private List<Map<String, Object>> getSimpleData() {
        List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("姓名", "张三");
        map.put("学号", "001");
        list1.add(map);

        map = new HashMap<String, Object>();
        map.put("姓名", "李四");
        map.put("学号", "002");
        list1.add(map);

        map = new HashMap<String, Object>();
        map.put("姓名", "王五");
        map.put("学号", "003");
        list1.add(map);

        return list1;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mfragment_power, container, false);
    }

}
