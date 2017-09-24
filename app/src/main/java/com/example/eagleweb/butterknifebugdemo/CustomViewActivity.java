package com.example.eagleweb.butterknifebugdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CustomViewActivity extends AppCompatActivity {

    @BindView(R.id.custom)
    CustomView mCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.custom)
    public void onViewClicked() {
        mCustom.onDestory();
    }
}
