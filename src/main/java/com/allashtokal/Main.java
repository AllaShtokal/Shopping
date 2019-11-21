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

        ShopsList shopsList = new ShopsList();
        Husband husband = new Husband();
        Wife wife = new Wife();
        husband.shopping(wife.giveOrder(),shopsList);
        wife.printList(husband.giveResultListToWife());
    }
}
