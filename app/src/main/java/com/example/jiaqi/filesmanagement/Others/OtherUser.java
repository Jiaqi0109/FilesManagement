package com.example.jiaqi.filesmanagement.Others;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jiaqi.filesmanagement.ChangePassword;
import com.example.jiaqi.filesmanagement.MainLogin;
import com.example.jiaqi.filesmanagement.NormalUser.NormalBorrowManage;
import com.example.jiaqi.filesmanagement.NormalUser.NormalUser2;
import com.example.jiaqi.filesmanagement.R;

public class OtherUser extends AppCompatActivity {
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_user);

        bt1 = (Button) findViewById(R.id.NborrowSearch);
        bt2 = (Button) findViewById(R.id.NborrowList);
        bt3 = (Button) findViewById(R.id.Nchangepw);
        bt4 = (Button) findViewById(R.id.Nlogout);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText editText = new EditText(OtherUser.this);
                AlertDialog.Builder inputDialog =
                        new AlertDialog.Builder(OtherUser.this);
                inputDialog.setTitle("请输入要借阅的档案的学号").setView(editText);
                inputDialog.setPositiveButton("确定",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(OtherUser.this,
                                        editText.getText().toString(),
                                        Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OtherUser.this,OthersBorrowManage.class);
                startActivity(intent);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OtherUser.this, ChangePassword.class);
                startActivity(intent);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OtherUser.this, MainLogin.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
