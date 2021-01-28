package com.example.felicitacionnavidea;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
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

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.mi_burrito_sabanero);
        mediaPlayer.start();
    }
}