package com.example.pracanalekcjibazydanych;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ZwierzetaDao {
    @Insert
    public  void wstawZwierzeDoBazy(Zwierzeta zwierzeta);

    @Delete
    public  void usunZbazy(Zwierzeta zwierzeta);

    @Query("Select * from zwiereta_tabela")
    List<Zwierzeta> ZwrocWszystkieZwierzetaZbazy();

}
//@Query("Select nazwa from zwiereta_tabela");
//List<String> z(int czas);