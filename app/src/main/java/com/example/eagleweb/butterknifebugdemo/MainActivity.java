package com.example.eagleweb.butterknifebugdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tv_butterknife)
    TextView mTvButterknife;
    @BindView(R.id.tv_other)
    TextView mTvOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mTvOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "this is other click event", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void gotoCustom(View view) {
        startActivity(new Intent(this, CustomViewActivity.class));
    }

    @OnClick(R.id.tv_butterknife)
    public void onViewClicked() {
        Toast.makeText(this, "this is butterknife click event", Toast.LENGTH_SHORT).show();
    }
}
