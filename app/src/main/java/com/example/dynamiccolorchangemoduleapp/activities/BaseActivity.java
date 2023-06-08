package com.example.dynamiccolorchangemoduleapp.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.dynamiccolorchange_java.utils.Constants;
import com.example.dynamiccolorchange_java.utils.ThemePreference;
import com.example.dynamiccolorchangemoduleapp.R;

public class BaseActivity extends AppCompatActivity {

    private LinearLayout overallLayout;
    public Toolbar toolbarLayout;
    public TextView txtBack, txtCustomTitle;
    public FrameLayout layoutBack;
    public ImageView backIconBg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(int layoutResID) {
        overallLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.layout_action_bar, null);
        toolbarLayout = (Toolbar) overallLayout.findViewById(R.id.toolbar);
        layoutBack = (FrameLayout) overallLayout.findViewById(R.id.back_layout);
        backIconBg = (ImageView) overallLayout.findViewById(R.id.back_icon_bg);
        txtBack = (TextView) overallLayout.findViewById(R.id.text_back);
        txtCustomTitle = (TextView) overallLayout.findViewById(R.id.custom_title);

        FrameLayout activityContainer = (FrameLayout) overallLayout.findViewById(R.id.layout_container);
        getLayoutInflater().inflate(layoutResID, activityContainer, true);
        setColors();
        super.setContentView(overallLayout);
    }

    private void setColors() {
        toolbarLayout.setBackgroundColor(Color.parseColor(ThemePreference.getThemeColor(BaseActivity.this)));
        getWindow().setStatusBarColor(Color.parseColor(ThemePreference.getThemeColor(BaseActivity.this)));

        Constants mConsts = new Constants();
        mConsts.setTextColor(BaseActivity.this, txtBack);
        mConsts.setTextColor(BaseActivity.this, txtCustomTitle);
    }
}
