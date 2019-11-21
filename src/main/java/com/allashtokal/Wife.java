package com.allashtokal;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Project name: Shopping
 * User: Alla
 * Date: 20.11.2019
 * Time: 21:50
 */

public final class Wife {
    //Husband husband;
    public ArrayList<Product> finalListFromHusband;
    public ArrayList<Product> order;

    public ArrayList<Product> giveOrder() {
        order.add(new Product("Bread", 15));
        order.add(new Product("Bread", 15));
        order.add(new Product("Bread", 15));
        order.add(new Product("Bread", 15));
        return order;
    }

    public ArrayList<Product> getFinalListFromHusband() {
        return finalListFromHusband;
    }

    public void printList(ArrayList<Product> arr) {
        for (Product product : arr) {
            System.out.println(product.name + " -  " + product.price);


        }

    }


}