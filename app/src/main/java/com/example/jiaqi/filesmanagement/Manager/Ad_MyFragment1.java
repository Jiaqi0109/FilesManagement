package com.example.jiaqi.filesmanagement.Manager;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.jiaqi.filesmanagement.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        map.put("姓名", "李明");
        map.put("学号", "2014000001");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("姓名", "张红");
        map.put("学号", "2014000002");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("姓名", "王强");
        map.put("学号", "2014000003");
        list.add(map);

        return list;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.list_view, container, false);
    }


}
