package com.example.felicitacionnavidea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Typeface myFont = Typeface.createFromAsset(getAssets(),"bells.ttf");
        TextView texto = (TextView) findViewById(R.id.textView3);

        texto.setTypeface(myFont);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.splash);
        texto.startAnimation(animacion);

        animacion.setAnimationListener(this);

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(SplashActivity.this,TarjetaNavidad.class);
        startActivity(intent);
        finish();
//intent es el camino desde el origen hasta el destino
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}