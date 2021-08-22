package com.example.streammusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class SoundActivity extends AppCompatActivity {

    private static final String SONG_URL = "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-4.mp3 ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.MyDarkTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);


        Button button = findViewById(R.id.button2);

        button.setOnClickListener(view -> {
            MediaPlayer player = MediaPlayer.create(this, Uri.parse(SONG_URL));
            player.start();
        });
    }
}