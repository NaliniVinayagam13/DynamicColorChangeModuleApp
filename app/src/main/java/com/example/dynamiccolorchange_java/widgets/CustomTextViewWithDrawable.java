package com.example.dynamiccolorchange_java.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import androidx.core.graphics.drawable.DrawableCompat;

import com.example.dynamiccolorchange_java.utils.ThemePreference;

/**
 * Applies a pressed state color filter or disabled state alpha for the button's
 * background drawable.
 *
 * @author shiki
 */
public class CustomTextViewWithDrawable extends androidx.appcompat.widget.AppCompatTextView {

	public CustomTextViewWithDrawable(Context context) {
		super(context);
		setCompoundDrawableTint();
	}

	public CustomTextViewWithDrawable(Context context, AttributeSet attrs) {
		super(context, attrs);
		setCompoundDrawableTint();
	}

	public CustomTextViewWithDrawable(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		setCompoundDrawableTint();
	}

	public void setCompoundDrawableTint(){
		Drawable[] unwrappedDrawable = this.getCompoundDrawables();
		Drawable wrappedDrawable = DrawableCompat.wrap(unwrappedDrawable[0]);
		DrawableCompat.setTint(wrappedDrawable, Color.parseColor(ThemePreference.getThemeColor(getContext())));

		setTextColor(Color.parseColor(ThemePreference.getThemeColor(getContext())));
//		if(getBackground() != null){
//			getBackground().setTint(Color.parseColor(ThemePreference.getThemeColor(getContext())));
//		}
	}
}
