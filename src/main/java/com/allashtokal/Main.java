package com.allashtokal;

/**
 * Created by IntelliJ IDEA.
 * Project name: Shopping
 * User: Alla
 * Date: 20.11.2019
 * Time: 21:45
 */
public class Main {
    public static void main(String[] args) {

        ShopList shopList = new ShopList();
        Husband husband = new Husband();
        Wife wife = new Wife();

        wife.printList(wife.giveOrder());
        wife.printList(husband.getTotalListOfProducts());
        wife.printList(husband.shopping(wife.giveOrder(),shopList));
    }
}
