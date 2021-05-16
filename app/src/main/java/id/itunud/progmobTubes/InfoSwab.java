package id.itunud.progmobTubes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class InfoSwab extends AppCompatActivity {
private Button brag, brab, bspcr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_swab);

        brag= findViewById(R.id.btn_RAG);
        brab = findViewById(R.id.btn_RAB);
        bspcr = findViewById(R.id.btn_PCR);


        //Menampilkan fragment Rapid test Antigen saat button di klik
        brag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.container, new RapidAntigenFragment());
                ft.commit();
            }
        });

        //Menampilkan fragment Rapid test Antibodi saat button di klik
        brab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.container, new RapidAntibodiFragment());
                ft.commit();
            }
        });

        //Menampilkan fragment Swab test PCR saat button di klik
        bspcr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.container, new SwabPcrFragment());
                ft.commit();
            }
        });

        //Menampilkan Video swab dan media controlnya
        VideoView videoView = findViewById(R.id.vvswab);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.rapidvideo);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

    }
}