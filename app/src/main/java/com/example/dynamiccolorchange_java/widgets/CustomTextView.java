package com.example.dynamiccolorchange_java.widgets;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

import com.example.dynamiccolorchange_java.utils.ThemePreference;

/**
 * Applies a pressed state color filter or disabled state alpha for the button's
 * background drawable.
 *
 * @author shiki
 */
public class CustomTextView extends androidx.appcompat.widget.AppCompatTextView {

	public CustomTextView(Context context) {
		super(context);
		setCompoundDrawableTint();
	}

	public CustomTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		setCompoundDrawableTint();
	}

	public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		setCompoundDrawableTint();
	}

	private void setCompoundDrawableTint(){
		setTextColor(Color.parseColor(ThemePreference.getThemeColor(getContext())));
		if(getBackground() != null){
			getBackground().setTint(Color.parseColor(ThemePreference.getThemeColor(getContext())));
		}
	}
}
