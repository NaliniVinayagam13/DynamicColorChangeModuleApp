package com.example.dynamiccolorchange_java.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ProgressBar;

import com.example.dynamiccolorchange_java.utils.ThemePreference;

public class CustomProgressBar extends ProgressBar {
    public CustomProgressBar(Context context) {
        super(context);
        setPgrBarColor();
    }

    public CustomProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPgrBarColor();
    }

    public CustomProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setPgrBarColor();
    }

    public CustomProgressBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setPgrBarColor();
    }

    private void setPgrBarColor() {
        this.setIndeterminate(true);
        this.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor(ThemePreference.getThemeColor(getContext()))));

    }
}
