package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private static LocalDate updatedDt;

    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = new ArrayList<>();
        this.setUpdatedDt(LocalDate.now());
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public LocalDate getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(LocalDate updatedDt) {
        Menu.updatedDt = updatedDt;
    }

    public void addMenuItem(MenuItem menuItem) {
        ArrayList<MenuItem> items = this.getMenuItems();
        items.add(menuItem);
        this.setMenuItems(items);
    }

    public void addMenuItem(List<MenuItem> menuItems) {
        ArrayList<MenuItem> items = this.getMenuItems();
        items.addAll(menuItems);
        this.setMenuItems(items);
    }

    public void removeMenuItem(MenuItem menuItem) {
        ArrayList<MenuItem> items = this.getMenuItems();
        items.remove(menuItem);
        this.setMenuItems(items);
    }

    public void removeMenuItem(List<MenuItem> menuItems) {
        ArrayList<MenuItem> items = this.getMenuItems();
        items.removeAll(menuItems);
        this.setMenuItems(items);
    }

    public void showSingleMenuItem(MenuItem menuItem) {
        System.out.println(menuItem.toString());
    }

    public void showAllMenuItems(List<MenuItem> menuItems) {
        for (MenuItem m : menuItems) {
            System.out.println(m.toString());
        }
    }

    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem(4, "Hot Dog", "Main Course");
        System.out.println(menuItem);
        System.out.println(menuItem.getPrice());
    }
}
