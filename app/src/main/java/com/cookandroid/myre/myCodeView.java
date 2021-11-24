package com.cookandroid.myre;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class myCodeView extends AppCompatActivity {
    TextView mycodeview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycode);
        userDBHelper userDBHelper = new userDBHelper(getApplicationContext());
        mycodeview.setText(userDBHelper.getCode());
    }
}
