package com.example.alderiatecosoundbox;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pitiemr =  (Button) findViewById(R.id.pitiemr);
        pitiemr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.pitiemr);
            }
            });
        Button finfrero =  (Button) findViewById(R.id.finfrero);
        finfrero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.finfrero);
            }
        });
        Button aaah =  (Button) findViewById(R.id.aaah);
        aaah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.aaah);
            }
        });
        Button hysterie =  (Button) findViewById(R.id.hysterie);
        hysterie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.hysterie);
            }
        });
        Button macron =  (Button) findViewById(R.id.macron);
        macron.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.macron);
            }
        });
        Button corona =  (Button) findViewById(R.id.corona);
        corona.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.corona);
            }
        });
        Button alderp =  (Button) findViewById(R.id.alderp);
        alderp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.alderp);
            }
        });
        Button alors =  (Button) findViewById(R.id.alors);
        alors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.alors);
            }
        });
        Button poigne =  (Button) findViewById(R.id.poigne);
        poigne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.poigne);
            }
        });
        Button uwu =  (Button) findViewById(R.id.uwu);
        uwu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.uwu);
            }
        });
        Button mcdo =  (Button) findViewById(R.id.mcdo);
        mcdo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.mcdo);
            }
        });
        Button bisou =  (Button) findViewById(R.id.bisou);
        bisou.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.bisou);
            }
        });
        Button caisse =  (Button) findViewById(R.id.caisse);
        caisse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playSound(R.raw.caisse);
            }
        });
    }
    @Override
    public void onPause(){
        super.onPause();
        if(mPlayer!=null){
            mPlayer.stop();
            mPlayer.release();
        }
    }

    private void playSound(int resId){
        if(mPlayer!=null){
            mPlayer.stop();
            mPlayer.release();
        }
        mPlayer=MediaPlayer.create(this,resId);
        mPlayer.start();
    }
}