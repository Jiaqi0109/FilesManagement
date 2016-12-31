package com.example.jiaqi.filesmanagement;

import android.os.Bundle;
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

    }
}
