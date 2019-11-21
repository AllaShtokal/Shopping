package com.allashtokal.shops;
import com.allashtokal.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project name: Shopping
 * User: Alla
 * Date: 20.11.2019
 * Time: 20:12
 */

public abstract class Shop  {
    protected List<Product> listOfProducts = new ArrayList<>();

    public List<Product> getProducts() {
        return listOfProducts;
    }

    public void addProduct(String s, Integer price)
    {
        listOfProducts.add(new Product(s, price));
    }


}
