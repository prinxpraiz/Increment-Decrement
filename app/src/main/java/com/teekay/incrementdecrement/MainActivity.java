package com.teekay.incrementdecrement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button increase, decrease;
    TextView textV;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increase = findViewById(R.id.increment); decrease = findViewById(R.id.decrement);
        textV = findViewById(R.id.textView);

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                textV.setText(count);
            }
        });
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                textV.setText(count);
    }
}
