package com.example.hediyebulucu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class HediyeAlinacakKisiActivity extends AppCompatActivity {

    //Spinner içerisine koyacağımız verileri tanımlama

    private String[] cinsiyet = {"Erkek", "Kadın", "Unisex"};
    private String[] yasAralık = {"0-3", "4-7", "8-12", "13-16", "17-21", "22-25", "26-30", "31-35", "36-40", "41-45", "46-50", "50+"};
    private String[] hediyeKisiErkek = {"Büyükbaba", "Baba", "Erkek Kardeş", "Abi", "Erkek Kuzen", "iş Arkadaşı", "Sınıf/Okul Arkadaşı", "Erkek Arkadaş", "Sevgili", "Erkek Bebek"};
    private String[] hediyeKisiKadın = {"Büyükanne", "Anne", "Kız Kardeş", "Abla", "Kız Kuzen", "İş Arkadaşı", "Sınıf/Okul Arkadaşı", "Kız Arkadaş", "Sevgili", "Kız Bebek"};
    private String[] hediyeKisiUnisex = {"İş Arkadaşı", "Sınıf/Okul Arkadaşı", "Sevgili", "Bebek"};
    private String[] hediyeAmac = {"Yıllbaşı", "Özür Dilemek", "Tebrik Etmek", "Yeni İş", "Söz/Nişan", "Geçmiş Olsun", "Doğum Günü", "Yıl Dönümü", "Ev Hediyesi"};
    private String[] hediyeAmacBebek = {"Doğum Günü", "Geçmiş Olsun", "Hoşgeldin Bebek!"};

    //Spinner'ları ve Adapter'lerini tanımlıyoruz.
//    private Spinner spinnerCinsiyet;
//    private Spinner spinnerHediyeKisi;
//    private Spinner spinnerHediyeAmac;
//    private Spinner spinnerYas;
    private ArrayAdapter<String> adapterCinsiyet;
    private ArrayAdapter<String> adapterHediyeKisi;
    private ArrayAdapter<String> adapterHediyeAmac;
    private ArrayAdapter<String> adapterYas;
    private ArrayAdapter<String> adapterHediyeAmacBebek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hediye_alinacak_kisi);


        final Spinner spinnerCinsiyet = findViewById(R.id.cinsiyet);
        final Spinner spinnerHediyeKisi = findViewById(R.id.hediyeKisi);
        final Spinner spinnerHediyeAmac = findViewById(R.id.hediyeAmaci);
        final Spinner spinnerYas = findViewById(R.id.yas);

        //Spinner'lar için adapterleri hazırlıyoruz.
        adapterCinsiyet = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cinsiyet);
        adapterHediyeKisi = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, hediyeKisiErkek);
        adapterHediyeAmac = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, hediyeAmac);
        adapterYas = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, yasAralık);
        adapterHediyeAmacBebek = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, hediyeAmacBebek);


        //Listelenecek verilerin görünümünü belirliyoruz.
        adapterCinsiyet.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterHediyeKisi.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterHediyeAmac.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterYas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterHediyeAmacBebek.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        //Hazırladğımız Adapter'leri Spinner'lara ekliyoruz.
        spinnerCinsiyet.setAdapter(adapterCinsiyet);
        spinnerHediyeKisi.setAdapter(adapterHediyeKisi);
        spinnerHediyeAmac.setAdapter(adapterHediyeAmac);
        spinnerYas.setAdapter(adapterYas);


        // Listelerden bir eleman seçildiğinde yapılacakları tanımlıyoruz.
        spinnerCinsiyet.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //Seçimlere göre listeleme
                if (parent.getSelectedItem().toString().equals(cinsiyet[0]))
                    adapterHediyeKisi = new ArrayAdapter<String>(HediyeAlinacakKisiActivity.this, android.R.layout.simple_spinner_item, hediyeKisiErkek);
                else if (parent.getSelectedItem().toString().equals(cinsiyet[1]))
                    adapterHediyeKisi = new ArrayAdapter<String>(HediyeAlinacakKisiActivity.this, android.R.layout.simple_spinner_item, hediyeKisiKadın);

                else if (parent.getSelectedItem().toString().equals(cinsiyet[2]))
                    adapterHediyeKisi = new ArrayAdapter<String>(HediyeAlinacakKisiActivity.this, android.R.layout.simple_spinner_item, hediyeKisiUnisex);
//                    if (parent.getSelectedItem().toString().equals(hediyeKisiUnisex[3]))
//                        adapterHediyeAmac = new ArrayAdapter<String>(HediyeAlinacakKisiActivity.this,android.R.layout.simple_spinner_item,hediyeAmacBebek);

                adapterHediyeKisi.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerHediyeKisi.setAdapter(adapterHediyeKisi);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerHediyeKisi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

}
