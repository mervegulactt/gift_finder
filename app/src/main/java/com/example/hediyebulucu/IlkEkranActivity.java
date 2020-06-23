package com.example.hediyebulucu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class IlkEkranActivity extends AppCompatActivity {

    private int gosterim_suresi = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilk_ekran);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(IlkEkranActivity.this, AnaSayfaActivity.class);
                startActivity(i);
                finish();
            }
        }, gosterim_suresi);
    }

}
