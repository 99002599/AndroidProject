package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideoActivity extends YouTubeBaseActivity {
    private static final String TAG = "VideoActivity";

    YouTubePlayerView myouTubePlayerView;
    Button Play;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Log.d(TAG,"onCreate: Starting");


        Play=(Button) findViewById(R.id.button);
        myouTubePlayerView=(YouTubePlayerView) findViewById(R.id.youtubeplay);

        mOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG,"onCreate: Done Initializing");

//                youTubePlayer.loadVideo("0CFPg1m_Umg&feature=youtu.be");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG,"onCreate: Failed Initializing");

            }
        };
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onCreate: Initializing Youtube Player");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/0CFPg1m_Umg")));

//                myouTubePlayerView.initialize(YouTubeconfig.getAPI_Key(),YouTubePlayer.OnInitializedListener);

            }
        });
    }
}