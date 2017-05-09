package com.example.ekta.customviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ekta.customviewexample.views.CustomView;

public class MainActivity extends AppCompatActivity {

    CustomView mCustomView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CustomView customView= new CustomView(this);
        mCustomView= (CustomView) findViewById(R.id.customView);
        findViewById(R.id.btn_swap).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mCustomView.swapColor();
            }
        });
    }
}
