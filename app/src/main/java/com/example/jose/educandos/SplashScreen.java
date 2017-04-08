package com.example.jose.educandos;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    private static final int TEMPO_SPLASH = 5000;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        sharedPreferences = getSharedPreferences("com.example.jose.educandos.preferencias", MODE_PRIVATE);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Boolean logado = sharedPreferences.getBoolean("logado", false);
                Intent intent;

                if (logado) {
                    intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    intent = new Intent(SplashScreen.this, Login.class);
                    Toast.makeText(SplashScreen.this, ""+logado, Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                    finish();
                }
            }


        }, TEMPO_SPLASH);
    }
}
