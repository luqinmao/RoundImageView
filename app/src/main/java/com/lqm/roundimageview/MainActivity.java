package com.lqm.roundimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lqm.roundview.RoundImageView;

public class MainActivity extends AppCompatActivity {

    private RoundImageView mIvProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mIvProgress  = (RoundImageView) findViewById(R.id.iv_progress);
        mIvProgress.setProgress(100,R.color.colorAccent);
    }
}
