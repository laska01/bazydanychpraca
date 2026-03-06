package com.example.pracanalekcjibazydanych;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
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

        EditText Jakieimie = findViewById(R.id.imie);
        EditText Jakiwiek = findViewById(R.id.wiek);
        EditText kolorek = findViewById(R.id.kolor);
        Button przyciskDodaj = findViewById(R.id.button2);

        przyciskDodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zwierzetaDatabase.ZwrocWszystkieZwierzetaZbazy().wstawZwierzeDoBazy(new Zwierzeta(Integer.parseInt(Jakiwiek.getText().toString()), Jakieimie.getText().toString(), kolorek.getText().toString()));
                zwierzetaDatabase.add(new Zwierzeta(Integer.parseInt(Jakiwiek.getText().toString()), Jakieimie.getText().toString(), kolorek.getText().toString()));
                arrayAdapter.notifyDataSetChanged();
            }
        });
    }
}


