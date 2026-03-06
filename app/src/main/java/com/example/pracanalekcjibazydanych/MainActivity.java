package com.example.pracanalekcjibazydanych;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ZwierzetaDatabase zwierzetaDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zwierzetaDatabase = ZwierzetaDatabase.ZwrocinstancjeBazydanych(MainActivity.this);
        zwierzetaDatabase.ZwrocWszystkieZwierzetaZbazy().wstawZwierzeDoBazy(new Zwierzeta("Marcin", "czarny", 67));
        zwierzetaDatabase.ZwrocWszystkieZwierzetaZbazy().wstawZwierzeDoBazy(new Zwierzeta("Marcin", "czarny", 67));
        zwierzetaDatabase.ZwrocWszystkieZwierzetaZbazy().wstawZwierzeDoBazy(new Zwierzeta("Marcin", "czarny", 67));
    };
}


