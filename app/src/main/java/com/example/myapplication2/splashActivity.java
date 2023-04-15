package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class splashActivity extends AppCompatActivity {

    TextView welcomeText;
    Animation topAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(() -> {
                Intent i = new Intent(splashActivity.this,MainActivity.class);
                startActivity(i);
                finish();

        },10000);

        welcomeText = findViewById(R.id.textView);
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        welcomeText.setAnimation(topAnim);


    }
}