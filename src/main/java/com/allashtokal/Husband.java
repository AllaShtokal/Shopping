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
    private ShopList shopList = new ShopList();

    private ArrayList<Product> listForWife = new ArrayList<>();

    ArrayList<Product> getTotalListOfProducts() {
        return new ArrayList<>(shopList.getAllProducts(shopList.getShops()));

    }


    public Husband() {
    }

    int totalPrice() {
        int sum = 0;
        for (Product product : listForWife
        ) {
            sum += product.price;

        }
        return sum;
    }


    public ArrayList<Product> shopping(ArrayList<Product> order, ShopList
            shopList) {
        ArrayList<Product> productsInTotalList = new ArrayList<>(getTotalListOfProducts());

        for (Product product : order) {
            for (Product productInTotallist : productsInTotalList) {
                if (productInTotallist.name.equals(product.name) &&
                        productInTotallist.price == product.price)
                    listForWife.add(product);
            }

        }


        return listForWife;
    }


}
