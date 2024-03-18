package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // 첫번째 (변수)
    Button btnMan;
    Button btnWoman;
    TextView tv;
    LinearLayout test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 두번째 (리소스 연결)
        // R - 리소스(activity_main.xml 내의 요소들)
        btnMan = (Button) findViewById(R.id.btnMan);
        btnWoman = (Button) findViewById(R.id.btnWoman);
        tv = (TextView) findViewById(R.id.textView);
        test = (LinearLayout) findViewById(R.id.test);

        // 세번째 (이벤트)
        btnMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "남자에요", Toast.LENGTH_SHORT).show();
                tv.setTextSize(100);
                test.setBackgroundColor(Color.BLUE);
            }
        });

        btnWoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "여자에요", Toast.LENGTH_SHORT).show();
            }
        });
    }
}