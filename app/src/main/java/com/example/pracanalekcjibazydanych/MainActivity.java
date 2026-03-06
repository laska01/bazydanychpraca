package com.example.pracanalekcjibazydanych;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ZwierzetaDatabase zwierzetaDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        zwierzetaDatabase = ZwierzetaDatabase.ZwrocinstancjeBazydanych(MainActivity.this);
        /*przepisyDatabase.zwrocWypiekiDao().wstawWypiekDoBazy(new Wypiek(170, 120, "Sernik", "ser, ziemniaki, cukier, jajka"));
        przepisyDatabase.zwrocWypiekiDao().wstawWypiekDoBazy(new Wypiek(170, 15, "drożdzówki", "ser, drożdże, mąka, cukier, jajka"));
        przepisyDatabase.zwrocWypiekiDao().wstawWypiekDoBazy(new Wypiek(170, 60, "Chleb", "mąka, drożdże"));
        przepisyDatabase.zwrocWypiekiDao().zwrocWszystkieWypiekiZBazy();*/
        ListView listView = findViewById(R.id.listview);
        List<Zwierzeta> wszystkieWypiekiListy = zwierzetaDatabase.ZwrocWszystkieZwierzetaZbazy().ZwrocWszystkieZwierzetaZbazy();
        ArrayAdapter<Zwierzeta> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, wszystkieWypiekiListy);
        listView.setAdapter(arrayAdapter);
    }
}


