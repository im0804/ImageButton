package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageButton ib;
    ImageView iv;
    int rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib = findViewById(R.id.ib);
        iv = findViewById(R.id.iv);
    }

    public void clicking(View view) {
    rnd = (int) (101*Math.random() % 3 + 1);
    if (rnd == 1){
        ib.setImageResource(R.drawable.number1);
        iv.setImageResource(R.drawable.tenniscourt1); }
    else if(rnd == 2){
        ib.setImageResource(R.drawable.number2);
        iv.setImageResource(R.drawable.tenniscourt2); }
    else{
        ib.setImageResource(R.drawable.number3);
        iv.setImageResource(R.drawable.tenniscourt3); }
    }
}