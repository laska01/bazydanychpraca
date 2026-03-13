package com.example.pracanalekcjibazydanych;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Zwierzeta.class}, version = 1)
public abstract class ZwierzetaDatabase extends RoomDatabase {
    public abstract ZwierzetaDao ZwrocWszystkieZwierzetaZbazydao();

    private static ZwierzetaDatabase instancje;

    public static ZwierzetaDatabase ZwrocinstancjeBazydanych(Context context){
        if(instancje == null){
            instancje = Room.databaseBuilder(
                    context,
                    ZwierzetaDatabase.class,
                        "zwierzeta_db"
            )
                    .allowMainThreadQueries()
                    .build();
        }
        return instancje;
    }

    public void add(Zwierzeta zwierzeta) {
    }
}
