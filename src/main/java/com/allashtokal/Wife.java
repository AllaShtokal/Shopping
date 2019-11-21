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
    private ArrayList<Product> finalListFromHusband;


    ArrayList<Product> giveOrder() {
        ArrayList<Product> order = new ArrayList<>();
        order.add(new Product("Sony", 555));
        order.add(new Product("Bread", 15));
        order.add(new Product("Lenovo", 15));
        order.add(new Product("Onion", 85));
        return order;
    }

    public ArrayList<Product> getFinalListFromHusband() {
        return finalListFromHusband;
    }

     void printList(ArrayList<Product> arr) {
        for (Product product : arr) {
            System.out.println(product.name + " -  " + product.price);


        }


    }
     void getTotalPrice(Husband h){
        System.out.println("Total price is: " + h.totalPrice());

    }


}