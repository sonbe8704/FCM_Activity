package com.example.fcm_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//파이어 베이스 쓰기전에는 파이어베이스에서 프로젝트만들고 구글서비스파일 등록해줘야함+기본설정
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}