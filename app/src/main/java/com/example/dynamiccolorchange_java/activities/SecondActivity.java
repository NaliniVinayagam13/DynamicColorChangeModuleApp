package com.example.dynamiccolorchange_java.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;

import com.example.dynamiccolorchange_java.R;

public class SecondActivity extends BaseActivity {

    private Button btnMove;
    private ProgressBar pgrbarLoader;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initViews();
        setupDefaults();
        setupEvents();
    }

    private void initViews() {
        btnMove = (Button) findViewById(R.id.btn_move);
        pgrbarLoader = (ProgressBar) findViewById(R.id.pgr_bar_loader);
     }

    private void setupDefaults() {
        txtCustomTitle.setText("Second Screen");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pgrbarLoader.setVisibility(View.GONE);
            }
        }, 2000);
    }

    private void setupEvents() {

        txtBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, BaseFragmentActivity.class));
            }
        });
    }
}
