package com.example.dynamiccolorchange_java.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.example.dynamiccolorchange_java.R;
import com.example.dynamiccolorchange_java.fragments.FirstFragment;

public class BaseFragmentActivity extends BaseActivity {

    private TextView title, textBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_base_fragment);
        initViews();
        setupEvents();
    }

    private void initViews() {
        title = (TextView) findViewById(R.id.custom_title);
        textBack = (TextView) findViewById(R.id.text_back);
        title.setText("First Fragment");
        replaceFragments();
    }

    private void setupEvents() {
        textBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public void replaceFragments() {
        getSupportFragmentManager().beginTransaction().add(R.id.layout_frame, new FirstFragment()).commit();
    }
}
