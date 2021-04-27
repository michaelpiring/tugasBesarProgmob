package id.itunud.progmobTubes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class InfoGejala extends AppCompatActivity {
    ViewFlipper vf_infogejala;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_gejala);

        int images[]={
                R.drawable.pictgejala1,
                R.drawable.pictgejala2,
                R.drawable.pictgejala3,
                R.drawable.pictgejala4,
                R.drawable.pictgejala5,
                R.drawable.pictgejala6};

        vf_infogejala = findViewById(R.id.vf_infogejala);

        //loop images

        for(int image : images){
            flipperImages(image);

        }

    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource (image);

        vf_infogejala.addView(imageView);
        vf_infogejala.setFlipInterval(1000);
        vf_infogejala.setAutoStart(true);
        vf_infogejala.setInAnimation(this, android.R.anim.slide_in_left);
        vf_infogejala.setOutAnimation(this, android.R.anim.slide_out_right);


    }
}