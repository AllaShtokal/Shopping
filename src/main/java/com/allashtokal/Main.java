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
        System.out.println("---OrderFromWife---");
        wife.printList(wife.giveOrder());
        System.out.println("---TotalListOfProducts---");
        wife.printList(husband.getTotalListOfProducts());
        System.out.println("---Result---");
        wife.printList(husband.shopping(wife.giveOrder(),shopList));
        wife.getTotalPrice(husband);
    }
}
