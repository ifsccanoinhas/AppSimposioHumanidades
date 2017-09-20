package com.devifsc.estagiario.appeventos.IHC;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.devifsc.estagiario.appeventos.MainActivity;
import com.devifsc.estagiario.appeventos.MinhaTask;
import com.devifsc.estagiario.appeventos.R;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();//Esconde a ActionBar
        setContentView(R.layout.activity_splash_screen);

        ProgressBar barraProgresso = (ProgressBar) findViewById(R.id.pbSplashScreen);

        new MinhaTask(this, barraProgresso).execute();

        new Handler().postDelayed(new Runnable() {
            /*
             * Exibindo splash com um timer.
             */
            @Override
            public void run() {
                // Esse método será executado sempre que o timer acabar
                // E inicia a activity principal
                Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(i);

                // Fecha esta activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
