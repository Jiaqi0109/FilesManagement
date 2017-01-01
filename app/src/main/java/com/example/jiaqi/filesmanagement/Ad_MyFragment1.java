package com.example.jiaqi.filesmanagement;

import android.app.Fragment;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
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

import static android.R.attr.name;
import static android.R.id.list;
import static android.content.ContentValues.TAG;

/**
 * Created by jiaqi on 16-12-23.
 */

public class Ad_MyFragment1 extends ListFragment {


    private ListView selfList;
    private ArrayAdapter<String> adapter;

    public void onCreate(Bundle savedInstanceState) {

        final String[] from = new String[] {"姓名", "学号"};
        final int[] to = new int[] {R.id.text1, R.id.text2};
        super.onCreate(savedInstanceState);
        SimpleAdapter adapter = new SimpleAdapter(
                this.getActivity(), getSimpleData(),
                R.layout.list_item, from, to);
        this.setListAdapter(adapter);
    }
    public void onListItemClick(ListView parent, View v,int position, long id) {

        Intent intent = new Intent(getActivity(), Administrator2.class);
        Bundle bundle=new Bundle();
        bundle.putInt("name", position);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private List<Map<String, Object>> getSimpleData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("姓名", "张三");
        map.put("学号", "001");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("姓名", "李四");
        map.put("学号", "002");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("姓名", "王五");
        map.put("学号", "003");
        list.add(map);

        return list;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.ad_my_fragment1, container, false);
    }


}
