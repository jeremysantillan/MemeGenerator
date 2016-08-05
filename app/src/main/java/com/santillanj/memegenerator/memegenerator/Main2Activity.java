package com.santillanj.memegenerator.memegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView toptxt = (TextView) findViewById(R.id.mtxtviewTop);
        TextView bottomtxt = (TextView) findViewById(R.id.mtxtViewBottom);

        Intent intent = getIntent();
        if(intent!= null){
            String topmessage = intent.getStringExtra("TOP_TEXT");
            String bottommessage = intent.getStringExtra("BOTTOM_TEXT");

            toptxt.setText(topmessage);
            bottomtxt.setText(bottommessage);
        }


    }
}
