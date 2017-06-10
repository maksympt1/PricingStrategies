package com.example.android.pricingstrategies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create these elements in java
        TextView strategy01 = (TextView) findViewById(R.id.strategy01_TextView);
        TextView strategy02 = (TextView) findViewById(R.id.strategy02_TextView);
        TextView strategy03 = (TextView) findViewById(R.id.strategy03_TextView);
        TextView strategy04 = (TextView) findViewById(R.id.strategy04_TextView);
        TextView strategy05 = (TextView) findViewById(R.id.strategy05_TextView);
        TextView strategy06 = (TextView) findViewById(R.id.strategy06_TextView);
        TextView strategy07 = (TextView) findViewById(R.id.strategy07_TextView);
        TextView strategy08 = (TextView) findViewById(R.id.strategy08_TextView);
        TextView strategy09 = (TextView) findViewById(R.id.strategy09_TextView);
        TextView strategy10 = (TextView) findViewById(R.id.strategy10_TextView);
        TextView strategy11 = (TextView) findViewById(R.id.strategy11_TextView);
        TextView strategy12 = (TextView) findViewById(R.id.strategy12_TextView);

        //Assign an OnClickListener and what is going to happen
        strategy01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStrategy01 = new Intent(v.getContext(), strategy01.class);
                startActivity(openStrategy01);
            }
        });
        strategy02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStrategy02 = new Intent(v.getContext(), strategy02.class);
                startActivity(openStrategy02);
            }
        });
        strategy03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStrategy03 = new Intent(v.getContext(), strategy03.class);
                startActivity(openStrategy03);
            }
        });
        strategy04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStrategy04 = new Intent(v.getContext(), strategy04.class);
                startActivity(openStrategy04);
            }
        });
        strategy05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStrategy05 = new Intent(v.getContext(), strategy05.class);
                startActivity(openStrategy05);
            }
        });
        strategy06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStrategy06 = new Intent(v.getContext(), strategy06.class);
                startActivity(openStrategy06);
            }
        });
        strategy07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStrategy07 = new Intent(v.getContext(), strategy07.class);
                startActivity(openStrategy07);
            }
        });
        strategy08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStrategy08 = new Intent(v.getContext(), strategy08.class);
                startActivity(openStrategy08);
            }
        });
        strategy09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStrategy09 = new Intent(v.getContext(), strategy09.class);
                startActivity(openStrategy09);
            }
        });
        strategy10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStrategy10 = new Intent(v.getContext(), strategy10.class);
                startActivity(openStrategy10);
            }
        });
        strategy11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStrategy11 = new Intent(v.getContext(), strategy11.class);
                startActivity(openStrategy11);
            }
        });
        strategy12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openStrategy12 = new Intent(v.getContext(), strategy12.class);
                startActivity(openStrategy12);
            }
        });
    }
}
