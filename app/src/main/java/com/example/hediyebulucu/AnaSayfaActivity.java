package com.example.hediyebulucu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class AnaSayfaActivity extends AppCompatActivity {


    Button kisiAyar;


    // Geri basılma durumunu yakaliyoruz

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            AlertDialog.Builder alert = new AlertDialog.Builder(AnaSayfaActivity.this);
            alert.setTitle("Çıkmak İstediğinizden Eminmisiniz ?");
            alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface arg0, int arg1) {
                    finish();
                }
            });
            alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface arg0, int arg1) {
                }
            });
            AlertDialog dialog = alert.create();
            dialog.show();
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));



        }

        return super.onKeyDown(keyCode, event);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);

        kisiAyar = findViewById(R.id.btnHediyeBul);
        kisiAyar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AnaSayfaActivity.this, HediyeAlinacakKisiActivity.class);
                startActivity(i);
                finish();
            }
        });



    }


}
