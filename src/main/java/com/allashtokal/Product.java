package com.allashtokal;

import sun.util.calendar.BaseCalendar;

/**
 * Created by IntelliJ IDEA.
 * Project name: Shopping
 * User: Alla
 * Date: 20.11.2019
 * Time: 19:43
 */

public class Product {

    String name;
    int price;
    //BaseCalendar.Date expiryDate;

    public Product(){}
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /*public Product(String name, int price, BaseCalendar.Date expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
