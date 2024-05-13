package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    String[] ver = new String[] {"파이", "9", "?"};
    boolean[] checkArray = new boolean[] {true, false, false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(
                        MainActivity.this);
                dlg.setTitle("제목입니다");
                dlg.setMessage("이곳이 내용입니다");
                dlg.setIcon(R.mipmap.ic_launcher);

                dlg.setMultiChoiceItems(ver, checkArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        btn.setText(ver[which]);
                    }
                });
                
//                dlg.setSingleChoiceItems(ver, 0, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        btn.setText(ver[which]);
//                    }
//                });
                
//                dlg.setPositiveButton("확인",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int which) {
//                                Toast.makeText(MainActivity.this,
//                                        "확인을 눌렀네요", Toast.LENGTH_SHORT).show();
//                            }
//                        });
//
//                dlg.setItems(ver, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int i) {
//                        btn.setText(ver[i]);
//                    }
//                });

                dlg.show();

                Toast.makeText(MainActivity.this, "대화상자", Toast.LENGTH_SHORT).show();
            }
        });
    }
}