package com.example.dynamiccolorchange_java.widgets;

import static android.graphics.Color.parseColor;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.dynamiccolorchange_java.utils.ThemePreference;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CustomFloatingActionButton extends FloatingActionButton {
    public CustomFloatingActionButton(@NonNull Context context) {
        super(context);
        setBackgroundTint();
    }

    public CustomFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setBackgroundTint();
    }

    public CustomFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setBackgroundTint();

    }

    public void setBackgroundTint(){
        setBackgroundTintList(ColorStateList.valueOf(parseColor(ThemePreference.getThemeColor(getContext()))));
    }

    //    @Override
//    public void setImageDrawable(@Nullable Drawable drawable) {
//        drawable.setTint(Color.parseColor(ThemePreference.getThemeColor(getContext())));
//        super.setImageDrawable(drawable);
//    }
}
