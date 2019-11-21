package com.allashtokal;

import com.allashtokal.shops.Shop;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Project name: Shopping
 * User: Alla
 * Date: 20.11.2019
 * Time: 21:52
 */
public final class Husband {

    Wife wife;
    ShopList shopList;
    public ArrayList<Product> totalListOfProducts;
    public ArrayList<Product> listForWife;

    public ArrayList<Product> getTotalListOfProducts() {
        return totalListOfProducts;

    }

    public Husband() {
    }


    public ArrayList<Product> shopping(ArrayList<Product> order,
                                       ArrayList<Shop> shopList) {

        for (Shop shop : shopList) {
            ArrayList<Product> products = new ArrayList<>();
           products.addAll(shop.getProducts());
            for (Product product: products)
            {
                for (Product productInTotallist: products)
                {

                }

            }
        }

        return listForWife;
    }

    public ArrayList<Product> giveResultListToWife() {
        return new ArrayList<Product>();
    }


}
