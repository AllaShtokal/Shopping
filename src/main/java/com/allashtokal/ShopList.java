package com.allashtokal;


import com.allashtokal.shops.GroceryShop;
import com.allashtokal.shops.Shop;
import com.allashtokal.shops.TechShop;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Project name: Shopping
 * User: Alla
 * Date: 20.11.2019
 * Time: 21:13
 */
public class ShopList {

    public GroceryShop groceryShop;
    public TechShop techShop;

    public ShopList(){
        techShop = new TechShop();
        groceryShop = new GroceryShop();

    }

    public ArrayList<Shop> getShops() {
        ArrayList<Shop> shops = new ArrayList<>();
        shops.add(groceryShop);
        shops.add(techShop);
        return shops;
    }
}