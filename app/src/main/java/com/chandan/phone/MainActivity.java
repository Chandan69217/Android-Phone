package com.chandan.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /* ************** veriable ************** */
    private Intent homeActivity;
    Animation zoom_in;
    LottieAnimationView  phone_logo_lottie;
    TextView about_dev_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zoom_in = AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        getViewID();
        phone_logo_lottie.setAnimation(zoom_in);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                homeActivity = new Intent(getApplicationContext(),Home.class);
                startActivity(homeActivity);
                finish();
            }
        },1500);
    }

    private void getViewID(){
        phone_logo_lottie = findViewById(R.id.phone_logo_lottie);
        about_dev_txt = findViewById(R.id.about_dev_txt);
    }
}