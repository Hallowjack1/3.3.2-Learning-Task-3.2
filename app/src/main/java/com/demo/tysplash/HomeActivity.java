package com.demo.tysplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView imgOne = findViewById(R.id.controller);
        imgOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(HomeActivity.this, ControllerActivity.class);
                startActivity(i);
            }
        });

        ImageView imgTwo = findViewById(R.id.keyboard);
        imgTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(HomeActivity.this, KeyboardActivity.class);
                startActivity(i);
            }
        });

        ImageView imgThree = findViewById(R.id.mouse);
        imgThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(HomeActivity.this, MouseActivity.class);
                startActivity(i);
            }
        });
    }
}