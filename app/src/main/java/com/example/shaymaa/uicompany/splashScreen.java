package com.example.shaymaa.uicompany;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class splashScreen extends AppCompatActivity {
    private ProgressBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);




        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                splashScreen.this.runOnUiThread(new TimerTask() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(splashScreen.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        }, 2000);









    }



}
