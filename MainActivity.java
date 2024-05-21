package com.example.coklusayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coklusayfa.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
//sayfala elemanlarına erişmek için tanımlama yaptım
    private ActivityMainBinding bagla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       //bağlama ile ekran açılması sağlanıyor
        bagla = ActivityMainBinding.inflate(getLayoutInflater());
        View view = bagla.getRoot();
        setContentView(view);
        //hakkımızda butonunu ayarlıyoruz
        bagla.btnHakkimiza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,
                        Hakkimizda.class);
                startActivity(i);
            }
        });
        //iletişim butonunu ayarlıyoruz
        bagla.btnIletisim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,
                        Iletisim.class);
                startActivity(i);
            }
        });

    }
}