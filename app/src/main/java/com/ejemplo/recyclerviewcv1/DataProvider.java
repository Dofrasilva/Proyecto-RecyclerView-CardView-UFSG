package com.ejemplo.recyclerviewcv1;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by lenovo on 21/02/2018.
 */

public class DataProvider {
    // 1.1. Definir campos de clase para los elementos del CardView
    private String title;
    private String shortdesc;
    private String rating;
    private int image;


    // 1.2. Generar el constructor

    public DataProvider(String title, String shortdesc, String rating, int image) {
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.image = image;

    }

    // 1.3. Generar los métodos getter.


    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getRating() {
        return rating;
    }

    public int getImage() {
        return image;
    }

    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}