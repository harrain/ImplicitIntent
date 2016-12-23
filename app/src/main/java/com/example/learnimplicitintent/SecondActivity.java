package com.example.learnimplicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");

        TextView tv = (TextView) findViewById(R.id.second_tv);
        tv.setText(msg);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



        /*Intent intent1 = getIntent();
        String a = intent1.getStringExtra("a");
        Bundle bundleExtra = intent1.getBundleExtra("a bundle");
        String b = bundleExtra.getString(b);*/


    }
}
