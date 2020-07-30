package com.truthpower.arunbatt;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

import androidx.appcompat.app.AppCompatActivity;

public class splashscreen extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 3000;
    private ProgressBar pb1;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mainIntent = new Intent(splashscreen.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);




        pro();}
    public void pro()
    {
        pb1 = (ProgressBar)findViewById(R.id.progressBar);

        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run()
            {
                counter++;
                pb1.setProgress(counter);

                if(counter == 2000)
                    t.cancel();
            }
        };

        t.schedule(tt,0,25);
    }

}
