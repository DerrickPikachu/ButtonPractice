package com.example.buttonpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int textSize = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnBigger(View v) {
        TextView text = (TextView) findViewById(R.id.txv);
        text.setTextSize(++textSize);
    }

    public void btnLittler(View v) {
        TextView text = (TextView) findViewById(R.id.txv);
        text.setTextSize(--textSize);
    }
}
