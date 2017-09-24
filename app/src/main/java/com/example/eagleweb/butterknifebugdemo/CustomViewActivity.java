package com.example.eagleweb.butterknifebugdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CustomViewActivity extends AppCompatActivity {

    @BindView(R.id.custom)
    CustomView mCustom;
    @BindView(R.id.tv_back)
    TextView   mTvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);
        ButterKnife.bind(this);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Toast.makeText(CustomViewActivity.this, "2222delay message execute success", Toast.LENGTH_SHORT).show();
//
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Toast.makeText(CustomViewActivity.this, "3333delay message execute success", Toast.LENGTH_SHORT).show();
//                    }
//                });
//            }
//        }, 10000);

    }

    @OnClick({R.id.custom, R.id.tv_back})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.custom:
                mCustom.onDestory();
                Toast.makeText(this, "remove success", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_back:
                finish();
                break;
        }
    }
}
