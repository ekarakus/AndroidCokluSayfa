package com.example.coklusayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coklusayfa.databinding.ActivityIletisimBinding;

public class Iletisim extends AppCompatActivity {

    private  ActivityIletisimBinding bagla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bagla= ActivityIletisimBinding.inflate(getLayoutInflater());
        View view= bagla.getRoot();
        setContentView(view);

        bagla.btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Iletisim.this,
                        MainActivity.class);
                startActivity(i);
            }
        });
    }
}