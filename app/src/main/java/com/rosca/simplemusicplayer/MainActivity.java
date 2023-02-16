package com.rosca.simplemusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ImageButton play, pause, stop, previous, next;
    MediaPlayer mediaPlayer;
    boolean isPlaying = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);
        pause = findViewById(R.id.pause);
        stop = findViewById(R.id.stop);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPlaying) {
                    mediaPlayer.start();
                    isPlaying = true;
                }
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlaying) {
                    mediaPlayer.pause();
                    isPlaying = false;
                }
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                isPlaying = false;
            }
        });
    }
}