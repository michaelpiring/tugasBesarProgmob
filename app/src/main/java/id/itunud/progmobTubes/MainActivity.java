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

    }

    @Override
    //intent activity sesuai dengan kondisi
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pendahuluan:
                Intent intentpendahuluan = new Intent(MainActivity.this, pendahuluan.class);
                startActivity(intentpendahuluan);
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
                Intent intentkarantina = new Intent(MainActivity.this, InfoProtokol.class);
                startActivity(intentkarantina);
                break;

            case R.id.infoswab:
                Intent intentswab = new Intent(MainActivity.this, InfoSwab.class);
                startActivity(intentswab);
                break;

            case R.id.callcenter:
                Intent intentbantuan = new Intent(MainActivity.this, BantuanInformasi.class);
                startActivity(intentbantuan);
                break;

        }

    }
}