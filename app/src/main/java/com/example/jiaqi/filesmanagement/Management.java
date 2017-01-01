package com.example.jiaqi.filesmanagement;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class Management extends AppCompatActivity {
    private int i;
    private MFragmentBorrow Fborrow;
    private MFragmentChangepw Fchangepw;
    private MFragmentImport Fimport;
    private MFragmentInquier Finquier;
    private MFragmentPower Fpower;
    private MFragmentRecycle Frecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);

        Bundle bundle = this.getIntent().getExtras();
        i = bundle.getInt("i");
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFragment(transaction);
        switch (i) {
            case 1:
                if (Fborrow == null) {
                    Fborrow = new MFragmentBorrow();
                    transaction.add(R.id.fragment_container2, Fborrow);
                } else {
                    transaction.show(Fborrow);
                }
                break;
            case 2:
                if (Frecycle == null) {
                    Frecycle = new MFragmentRecycle();
                    transaction.add(R.id.fragment_container2, Frecycle);
                } else {
                    transaction.show(Frecycle);
                }
                break;
            case 3:
                if (Fpower == null) {
                    Fpower = new MFragmentPower();
                    transaction.add(R.id.fragment_container2, Fpower);
                } else {
                    transaction.show(Fpower);
                }
                break;
            case 4:
                if (Fimport == null) {
                    Fimport = new MFragmentImport();
                    transaction.add(R.id.fragment_container2, Fimport);
                } else {
                    transaction.show(Fimport);
                }
                break;
            case 5:
                if (Finquier == null) {
                    Finquier = new MFragmentInquier();
                    transaction.add(R.id.fragment_container2, Finquier);
                } else {
                    transaction.show(Finquier);
                }
                break;
            case 6:
                if (Fchangepw == null) {
                    Fchangepw = new MFragmentChangepw();
                    transaction.add(R.id.fragment_container2, Fchangepw);
                } else {
                    transaction.show(Fchangepw);
                }
                break;
        }
        transaction.commit();
    }

    public void hideAllFragment(FragmentTransaction transaction) {
        if (Fborrow != null) {
            transaction.hide(Fborrow);
        }
        if (Fchangepw != null) {
            transaction.hide(Fchangepw);
        }
        if (Fimport != null) {
            transaction.hide(Fimport);
        }
        if (Finquier != null) {
            transaction.hide(Finquier);
        }
        if (Fpower != null) {
            transaction.hide(Fpower);
        }
        if (Frecycle != null) {
            transaction.hide(Frecycle);
        }

    }
}
