package com.udemy.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivStar;
    Button btnAlpha,btnRotate,btnTranslate,btnScale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivStar = findViewById(R.id.ivStar);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnRotate = findViewById(R.id.btnRotate);
        btnTranslate = findViewById(R.id.btnTranslate);
        btnScale = findViewById(R.id.btnScale);

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                ivStar.startAnimation(alpha);

            }
        });
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                ivStar.startAnimation(rotate);
            }
        });
         btnTranslate.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Animation move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                 ivStar.startAnimation(move);
             }
         });
         btnScale.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                 ivStar.startAnimation(scale);
             }
         });
    }
}