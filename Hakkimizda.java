package com.example.coklusayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.coklusayfa.databinding.ActivityHakkimizdaBinding;

public class Hakkimizda extends AppCompatActivity {
private ActivityHakkimizdaBinding bagla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_hakkimizda);

        bagla= ActivityHakkimizdaBinding.inflate(getLayoutInflater());
        View view= bagla.getRoot();
        setContentView(view);

        bagla.btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hakkimizda.this,
                        MainActivity.class);
                startActivity(i);
            }
        });
    }
}