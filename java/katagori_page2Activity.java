package com.example.paceshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class katagori_page2Activity extends AppCompatActivity {

    LinearLayout pindahHal1;
    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;
    LinearLayout pindahHal7;
    LinearLayout pindahHal8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katagori_page2);

        pindahHal1 = findViewById(R.id.baju1);
        pindahHal2 = findViewById(R.id.accessories);
        pindahHal3 = findViewById(R.id.hoodie);
        pindahHal4 = findViewById(R.id.jacket);
        pindahHal5 = findViewById(R.id.LONGPANTS);
        pindahHal6 = findViewById(R.id.celana);
        pindahHal7 = findViewById(R.id.Hat);
        pindahHal8 = findViewById(R.id.bag);

        pindahHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(katagori_page2Activity.this, Tshrsit_1.class);
                startActivity(i);
            }
        });

        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(katagori_page2Activity.this, Accessories_2.class);
                startActivity(i);
            }
        });

        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(katagori_page2Activity.this, Hoodie_3.class);
                startActivity(i);
            }
        });

        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(katagori_page2Activity.this, Jacket_page4.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(katagori_page2Activity.this, LongsPants_5.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(katagori_page2Activity.this, Shorts_6.class);
                startActivity(i);
            }
        });
        pindahHal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(katagori_page2Activity.this, Hat7.class);
                startActivity(i);
            }
        });
        pindahHal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(katagori_page2Activity.this, Bag_8.class);
                startActivity(i);
            }
        });

    }
    public void openActivity3(View view) {
        Intent intent = new Intent(this, diskon_page3Activity.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
