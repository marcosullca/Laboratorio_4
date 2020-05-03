package com.example.flashbrowser.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.flashbrowser.R;

public class ReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        // Se recuperan los valores del intent
        String movie = extras.getString("movie");
        int year = extras.getInt("year");
        boolean oscar = extras.getBoolean("oscar");
        float score = extras.getFloat("score");

        // Se pintan los valores en consola
        Log.d(this.getClass().getCanonicalName(), "Película: " + movie);
        Log.d(this.getClass().getCanonicalName(), "Año: " + year);
        Log.d(this.getClass().getCanonicalName(), "¿Ganó un Oscar?: " + oscar);
        Log.d(this.getClass().getCanonicalName(), "Calificación: " + score);
    }

}

