package com.example.jiaqi.filesmanagement;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Administrator extends Activity implements RadioGroup.OnCheckedChangeListener{

    private RadioGroup rpTab;
    private RadioButton rbDeal,rbPoi,rbMore,rbUser;
    private Ad_MyFragment1 fg1;
    private Ad_MyFragment2 fg2;
    private Ad_MyFragment3 fg3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator);

        bindView();
    }
    private void bindView() {
        rpTab = (RadioGroup)findViewById(R.id.rd_group);
        rpTab.setOnCheckedChangeListener(this);

        rbDeal = (RadioButton)findViewById(R.id.rd_menu_deal);
        rbPoi = (RadioButton)findViewById(R.id.rd_menu_poi);
        rbMore = (RadioButton)findViewById(R.id.rd_menu_more);


        rbDeal.setChecked(true);
    }

    public void hideAllFragment(FragmentTransaction transaction){
        if(fg1!=null){
            transaction.hide(fg1);
        }
        if(fg2!=null){
            transaction.hide(fg2);
        }
        if(fg3!=null){
            transaction.hide(fg3);
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
            case R.id.rd_menu_more:
                if(fg3==null){
                    fg3 = new Ad_MyFragment3();
                    transaction.add(R.id.fragment_container,fg3);
                }else{
                    transaction.show(fg3);
                }
                break;

        }
        transaction.commit();
    }
}
