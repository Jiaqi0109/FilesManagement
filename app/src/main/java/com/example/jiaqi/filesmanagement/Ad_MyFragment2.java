package com.example.jiaqi.filesmanagement;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jiaqi on 16-12-23.
 */

public class Ad_MyFragment2 extends Fragment{
    private Button bt_add;
    private Button bt_borrow;
    private Button bt_recycle;
    private Button bt_power;
    private Button bt_import;
    private Button bt_inquire;
    private Button bt_changepw;
    private Button bt_logout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ad_my_fragment2,container,false);

        bt_add = (Button)view.findViewById(R.id.Fadd);
        bt_borrow = (Button)view.findViewById(R.id.Fborrow);
        bt_recycle = (Button)view.findViewById(R.id.Frecycle);
        bt_power = (Button)view.findViewById(R.id.Fpower);
        bt_import = (Button)view.findViewById(R.id.Fimport);
        bt_inquire = (Button)view.findViewById(R.id.Finquire);
        bt_changepw = (Button)view.findViewById(R.id.Fpower);
        bt_logout = (Button)view.findViewById(R.id.Flogout);

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt_borrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt_recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt_import.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt_inquire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt_changepw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainLogin.class);
                startActivity(intent);
                getActivity().finish();
            }
        });


        return view;

    }
}
