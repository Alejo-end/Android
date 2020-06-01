package com.example.parcial1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Intent intent  = getIntent();
        int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        TextView  textView1=(TextView) findViewById(R.id.textView1);
        TextView  textView2=(TextView) findViewById(R.id.textView2);
        Bundle bundle=getIntent().getExtras();
        String data=bundle.get("data").toString();
        textView1.setText(""+number);
        textView2.setText(data);

    }
}