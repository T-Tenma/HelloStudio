package com.hello.tenma.hellostudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //为了确认版本控制是否有效
        setContentView(R.layout.activity_main);
    }
}
