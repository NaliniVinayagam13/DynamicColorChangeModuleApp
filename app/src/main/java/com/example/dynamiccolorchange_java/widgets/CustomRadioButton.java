package com.example.dynamiccolorchange_java.widgets;

import static android.graphics.Color.parseColor;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.example.dynamiccolorchange_java.utils.ThemePreference;


public class CustomRadioButton extends androidx.appcompat.widget.AppCompatRadioButton {
    public CustomRadioButton(Context context) {
        super(context);
        setBackgroundTint();
    }

    public CustomRadioButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setBackgroundTint();
    }

    public CustomRadioButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setBackgroundTint();
    }

    private void setBackgroundTint(){
        if(Build.VERSION.SDK_INT >= 21)
        {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_enabled}, // Disabled
                            new int[]{android.R.attr.state_enabled}   // Enabled
                    },
                    new int[]{
                            parseColor(ThemePreference.getThemeColor(getContext())), // disabled
                            parseColor(ThemePreference.getThemeColor(getContext()))   // enabled
                    }
            );

            setButtonTintList(colorStateList); // set the color tint list
            invalidate(); // Could not be necessary
        }
    }
}
