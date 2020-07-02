package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem hotDog = new MenuItem(4, "Hot Dog", "Main Course");
        MenuItem burger = new MenuItem(5.50, "Cheese Burger", "Main Course");
        MenuItem fries = new MenuItem(3.25, "French Fries", "Appetizer");
//        System.out.println("Testing toString method in MenuItem Class");
//        System.out.println("*****************************************");
//        System.out.println(hotDog);
//        System.out.println();
//        System.out.println("Testing single add item method and print method");
//        System.out.println("***********************************************");
        Menu menu = new Menu();
//        menu.addMenuItem(hotDog);
//        menu.addMenuItem(burger);
//        menu.addMenuItem(fries);
//        menu.showSingleMenuItem(hotDog);
//        menu.showSingleMenuItem(burger);
//        menu.showSingleMenuItem(fries);
//        System.out.println();
//        System.out.println("Testing single remove item method and print all method");
//        System.out.println("******************************************************");
//        menu.removeMenuItem(hotDog);
//        menu.showAllMenuItems();
//        System.out.println();
//        System.out.println("Testing add list of items method and print all method");
//        System.out.println("*****************************************************");
        List<MenuItem> items = new ArrayList<>();
        items.add(hotDog);
        items.add(burger);
        items.add(fries);
        menu.addMenuItem(items);
//        menu.showAllMenuItems();
//        System.out.println();
//        System.out.println("Testing remove list of items method and print all method");
//        System.out.println("*****************************************************");
//        menu.removeMenuItem(items);
//        menu.showAllMenuItems();
//        System.out.println();
//        System.out.println("Testing update date being set for Menu");
//        System.out.println("**************************************");
//        System.out.println(Menu.getUpdatedDt());
        System.out.println();
        System.out.println("Sample Menu");
        System.out.println("***********");
        System.out.println();
        menu.showAllMenuItems();


    }
}
