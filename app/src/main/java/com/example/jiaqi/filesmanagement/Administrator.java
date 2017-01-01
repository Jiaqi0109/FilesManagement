package com.example.jiaqi.filesmanagement;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Administrator extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    static Activity activity_Ad;
    private RadioGroup rpTab;
    private RadioButton rbDeal,rbPoi,rbMore,rbUser;
    private Ad_MyFragment1 fg1;
    private Ad_MyFragment2 fg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator);

        activity_Ad = this;
        bindView();

    }


    private void bindView() {
        rpTab = (RadioGroup)findViewById(R.id.rd_group);
        rpTab.setOnCheckedChangeListener(this);

        rbDeal = (RadioButton)findViewById(R.id.rd_menu_deal);
        rbPoi = (RadioButton)findViewById(R.id.rd_menu_poi);

        rbDeal.setChecked(true);
    }

    public void hideAllFragment(FragmentTransaction transaction){
        if(fg1!=null){
            transaction.hide(fg1);
        }
        if(fg2!=null){
            transaction.hide(fg2);
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        hideAllFragment(transaction);
        switch (checkedId){
            case R.id.rd_menu_deal:
                if(fg1==null){
                    fg1 = new Ad_MyFragment1();
                    transaction.add(R.id.fragment_container,fg1);
                }else{
                    transaction.show(fg1);
                }
                break;
            case R.id.rd_menu_poi:
                if(fg2==null){
                    fg2 = new Ad_MyFragment2();
                    transaction.add(R.id.fragment_container,fg2);
                }else{
                    transaction.show(fg2);
                }
                break;
        }
        transaction.commit();
    }
}
