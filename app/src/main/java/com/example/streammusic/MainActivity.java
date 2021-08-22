package com.example.streammusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.streammusic.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        binding.button.setOnClickListener(view -> {
            Intent intent = new Intent(this, SoundActivity.class);
            startActivity(intent);
        });
    }
}