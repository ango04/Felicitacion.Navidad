package com.example.felicitacionnavidea;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class TarjetaNavidad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miFuente = Typeface.createFromAsset(getAssets(),"bells.ttf");
        TextView titulo = findViewById(R.id.titulo);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        titulo.setTypeface(miFuente);
        textView.setTypeface(miFuente);
        textView2.setTypeface(miFuente);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion);
        titulo.startAnimation(animacion);

        Animation slideup = AnimationUtils.loadAnimation(this,R.anim.slideup);
        TextView texto1 = (TextView) findViewById(R.id.textView);
        TextView texto2 = (TextView) findViewById(R.id.textView2);
        texto1.startAnimation(slideup);
        texto2.startAnimation(slideup);

        Animation burrito = AnimationUtils.loadAnimation(this,R.anim.burrito);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.startAnimation(burrito);




        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.mi_burrito_sabanero);
        mediaPlayer.start();
    }
}