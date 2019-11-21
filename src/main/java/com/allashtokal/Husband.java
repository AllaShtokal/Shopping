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


    public ArrayList<Product> shopping(ArrayList<Product> order,ShopList
                                        shopList) {
        ArrayList<Product> productsInTotalList = new ArrayList<>();
        productsInTotalList.addAll(shopList.getAllProducts(shopList.getShops()));

            for (Product product: order)
            {
                for (Product productInTotallist: productsInTotalList)
                {
                   if(productInTotallist.name.equals(product.name) &&
                      productInTotallist.price == product.price)
                       listForWife.add(product);
                }

            }


        return listForWife;
    }




}
