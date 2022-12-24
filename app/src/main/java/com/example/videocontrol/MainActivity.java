package com.example.videocontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView=(VideoView) findViewById(R.id.videoView);
        String path="android.resource://" + getPackageName() + "/" + R.raw.demo;
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(mediaController);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }
}