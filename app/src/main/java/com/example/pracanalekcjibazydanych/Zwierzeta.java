package com.example.pracanalekcjibazydanych;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "zwiereta_tabela")
public class Zwierzeta {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String imie;
    private String kolor;

    public Zwierzeta( String imie, String kolor, int wiek) {
        id = 0;
        this.imie = imie;
        this.kolor = kolor;
        this.wiek = wiek;
    }

    public Zwierzeta(int i, String string, String string1) {
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    private int wiek;
    @Override
    public String toString() {
        return "Zweirze" +
                "id=" + id +
                ", imie=" + imie +
                ", kolor=" + kolor +
                ", wiek=" + wiek + '\''
                ;
    }
}
