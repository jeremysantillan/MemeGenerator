package com.santillanj.memegenerator.memegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText top = (EditText) findViewById(R.id.mtxtfldTop);
        final EditText bottom = (EditText) findViewById(R.id.mtxtfldbottom);
        View enter = findViewById(R.id.mbtnEnter);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String topmessage = top.getText().toString();
                String bottommessage = bottom.getText().toString();

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("TOP_TEXT", topmessage);
                intent.putExtra("BOTTOM_TEXT", bottommessage);

                startActivity(intent);
            }
        });






    }
}
