//package com.example.dynamiccolorchangemoduleapp.activities;
//
//import android.content.Intent;
//import android.content.res.ColorStateList;
//import android.graphics.Color;
//import android.os.Bundle;
//import android.text.Editable;
//import android.text.TextWatcher;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//
//import com.example.dynamiccolorchange_java.R;
//import com.example.dynamiccolorchange_java.utils.Constants;
//import com.example.dynamiccolorchange_java.utils.ThemePreference;
//import com.example.dynamiccolorchange_java.widgets.CustomTextViewWithDrawable;
//
//public class FirstActivity extends BaseActivity {
//
//    private TextView txtSampleText;
//    private EditText etxtToolbarColor;
//    private ImageView imgSample;
//    private CustomTextViewWithDrawable txtThemeColor;
//    private Button btnApplyColor, btnSecondScreen;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_first);
//
//        initViews();
//        setupDefaults();
//        setupEvents();
//    }
//
//    private void initViews() {
//        txtThemeColor = (CustomTextViewWithDrawable) findViewById(R.id.txt_theme_color);
//        txtSampleText = (TextView) findViewById(R.id.txt_sample_text);
//        etxtToolbarColor = (EditText) findViewById(R.id.etxtToolBarColr);
//        imgSample = (ImageView) findViewById(R.id.img_sample);
//        btnApplyColor = (Button) findViewById(R.id.changeThemeButton);
//        btnSecondScreen = (Button) findViewById(R.id.secondScreenBtn);
//    }
//
//    private void setupDefaults() {
//        txtCustomTitle.setText("Main Screen");
//        txtBack.setVisibility(View.GONE);
//        layoutBack.setVisibility(View.GONE);
//        setTextColorsToViews();
//    }
//
//    private void setupEvents() {
//
//        etxtToolbarColor.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                String prefix = "#";
//                int count = 0;
//                if(s != null && !s.toString().equals("") && !s.toString().equalsIgnoreCase("null")){
//                    count = s.toString().length();
//                }
//                if (count < prefix.length()) {
//                    if (s.toString() != prefix.trim()) {
//                        etxtToolbarColor.setText(""+prefix+s);
//                    } else {
//                        etxtToolbarColor.setText(prefix);
//                    }
//                    etxtToolbarColor.setSelection(etxtToolbarColor.length());
//                }
//            }
//        });
//
//        btnApplyColor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                try {
//                    ThemePreference.setThemeColor(FirstActivity.this, etxtToolbarColor.getText().toString());
//                    getWindow().setStatusBarColor(Color.parseColor(etxtToolbarColor.getText().toString()));
//                    toolbarLayout.setBackgroundColor(Color.parseColor(etxtToolbarColor.getText().toString()));
//                    imgSample.setColorFilter(Color.parseColor(etxtToolbarColor.getText().toString()));
//                    backIconBg.setColorFilter(Color.parseColor(etxtToolbarColor.getText().toString()));
//                    btnApplyColor.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(etxtToolbarColor.getText().toString())));
//                    btnSecondScreen.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(etxtToolbarColor.getText().toString())));
//                    txtThemeColor.setCompoundDrawableTint();
//                    setTextColorsToViews();
//                }catch (Exception e){
//                    Toast.makeText(FirstActivity.this, "Invalid Color Code", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnSecondScreen.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    private void setTextColorsToViews() {
//        Constants mCons = new Constants();
//        mCons.setTextColor(FirstActivity.this, txtBack);
//        mCons.setTextColor(FirstActivity.this, txtCustomTitle);
//        mCons.setTextColor(FirstActivity.this, btnApplyColor);
//        mCons.setTextColor(FirstActivity.this, btnSecondScreen);
//        mCons.setTextColor(FirstActivity.this, txtSampleText);
//    }
//}
