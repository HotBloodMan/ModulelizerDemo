package com.example.modulea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ScanActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        findViewById(R.id.btn_moduleA).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("ScanActivity","-------->>>ModuleA");
    }
}
