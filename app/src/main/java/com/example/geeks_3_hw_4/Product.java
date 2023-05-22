package com.example.geeks_3_hw_4;

import java.io.Serializable;

public class Product implements Serializable {

    String name;
    int image;
    String descr;
    String color;
    String sum;

    public Product(String name, int image, String descr, String color, String sum) {
        this.name = name;
        this.image = image;
        this.descr = descr;
        this.color = color;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getDescr() {
        return descr;
    }

    public String getColor() {
        return color;
    }

    public String getSum() {
        return sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
}
