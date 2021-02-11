package com.example.foodiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class gifSplash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 36  00;



    GifImageView gifImageView;
    Animation animfade;
    TextView tear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_gif_splash);

        //animations
        animfade = AnimationUtils.loadAnimation(this,R.anim.fade_animation);


        //hook
        gifImageView = findViewById(R.id.splash);
        tear = findViewById(R.id.tear);


        gifImageView.setAnimation(animfade);
        tear.setAnimation(animfade);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Intent = new Intent(gifSplash.this, welcome.class);
                startActivity(Intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}