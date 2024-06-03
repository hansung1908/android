package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // 회전 각도를 담을 변수
    EditText edtAngle;
    // 이미지를 담을 변수
    ImageView imageView1;

    // 화면 생성에 대한 함수
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // activity_main.xml 설정을 가져와 메인 화면 구성
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("제주도 풍경");

        // 각 요소들을 가져와 저장
        edtAngle = (EditText) findViewById(R.id.edtAngle);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
    }

    // 메뉴 생성에 대한 함수
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 메뉴 인플레이터를 이용해 menu1.xml을 가져와 메뉴 구성
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    // 메뉴 선택지에 대한 함수
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 어떤 메뉴를 선택했는지 담은 변수
        int itemId = item.getItemId();

        // 현재 이미지의 가로, 세로 길이를 담은 변수
        float currentScaleX = imageView1.getScaleX();
        float currentScaleY = imageView1.getScaleY();

        // 그림 회전을 선택하면 edtAngle에 입력한 수만큼 회전
        if (itemId == R.id.itemRotate) {
            imageView1.setRotation(Float.parseFloat(edtAngle.getText()
                    .toString()));
            return true;
        }
        // 그림 확대를 선택하면 현재 이미지 크기에서 2배 확대
        else if(itemId == R.id.itemSizeUp) {
            imageView1.setScaleX(currentScaleX * 2);
            imageView1.setScaleY(currentScaleY * 2);
            return true;
        }
        // 그림 축소를 선택하면 현재 이미지 크기에서 2배 축소
        else if(itemId == R.id.itemSizeDown) {
            imageView1.setScaleX(currentScaleX * 0.5f);
            imageView1.setScaleY(currentScaleY * 0.5f);
            return true;
        }
        // 한라산을 선택하면 jeju2 그림으로 세팅
        else if (itemId == R.id.item1) {
            imageView1.setImageResource(R.drawable.jeju2);
            return true;
        }
        // 추자도를 선택하면 jeju14 그림으로 세팅
        else if (itemId == R.id.item2) {
            imageView1.setImageResource(R.drawable.jeju14);
            return true;
        }
        // 범섬을 선택하면 jeju6 그림으로 세팅
        else if (itemId == R.id.item3) {
            imageView1.setImageResource(R.drawable.jeju6);
            return true;
        }
        return false;
    }
}
