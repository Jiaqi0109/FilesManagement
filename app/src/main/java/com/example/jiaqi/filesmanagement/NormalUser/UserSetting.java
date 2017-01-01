package com.example.jiaqi.filesmanagement.NormalUser;


import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jiaqi.filesmanagement.R;

public class UserSetting extends AppCompatActivity {
    private int i;
    private NormalBorrow jieyue;
    private NormalBorrowManage guanli;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_setting);

        Bundle bundle = this.getIntent().getExtras();
        i = bundle.getInt("i");
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        hideAllFragment(transaction);
        switch (i) {
            case 1:
                if (jieyue == null) {
                    jieyue = new NormalBorrow();
                    transaction.add(R.id.fragment_container3, jieyue);
                } else {
                    transaction.show(jieyue);
                }
                break;
            case 2:
                if (guanli == null) {
                    guanli = new NormalBorrowManage();
                    transaction.add(R.id.fragment_container3, guanli);
                } else {
                    transaction.show(guanli);
                }
                break;
        }
            transaction.commit();
        }


    public void hideAllFragment(FragmentTransaction transaction) {
        if (jieyue != null) {
            transaction.hide(jieyue);
        }
        if (guanli != null) {
            transaction.hide(guanli);
        }


    }
}

