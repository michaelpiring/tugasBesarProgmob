package id.itunud.progmobTubes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //private CardView cvpenda, cvgejala, cvprotokol, cvkarantina, cvswab, cvcallcenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cvpenda = findViewById(R.id.pendahuluan);
        cvpenda.setOnClickListener(this);

        CardView cvgejala = findViewById(R.id.infogejala);
        cvgejala.setOnClickListener(this);

        CardView cvprotokol = findViewById(R.id.informasiprotokol);
        cvprotokol.setOnClickListener(this);

        CardView cvkarantina = findViewById(R.id.infokarantina);
        cvkarantina.setOnClickListener(this);

        CardView cvswab = findViewById(R.id.infoswab);
        cvswab.setOnClickListener(this);

        CardView cvcallcenter = findViewById(R.id.callcenter);
        cvcallcenter.setOnClickListener(this);

        /*cardView = findViewById(R.id.infoprotokol);
        //cardView = findViewById(R.id.infogejala);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InfoProtokol.class);
                startActivity(intent);
            }
        });*/
    /*
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InfoProtokol.class);
                startActivity(intent);
            }
        });

     */
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pendahuluan:

                break;

            case R.id.infogejala:
                Intent intentgejala = new Intent(MainActivity.this, InfoGejala.class);
                startActivity(intentgejala);
                break;

            case R.id.informasiprotokol:
                Intent intentprotokol = new Intent(MainActivity.this, InformasiProtokol.class);
                startActivity(intentprotokol);
                break;

            case R.id.infokarantina:

                break;

            case R.id.infoswab:

                break;

            case R.id.callcenter:

                break;



        }

    }
}