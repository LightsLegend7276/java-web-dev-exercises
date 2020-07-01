package org.launchcode.java.studios.restaurant;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Menu {

    private ArrayList<MenuItem> menuItems;
    @Getter
    @Setter
    private static LocalDate updatedDt;

    public Menu() {
        this.menuItems = new ArrayList<>();
        Menu.setUpdatedDt(LocalDate.now());
    }

    public void addMenuItem(MenuItem menuItem) {
        ArrayList<MenuItem> items = this.getMenuItems();
        if (!items.contains(menuItem)) {
            items.add(menuItem);
            this.setMenuItems(items);
        }
    }

    public void addMenuItem(List<MenuItem> menuItems) {
        for (MenuItem m : menuItems) {
            addMenuItem(m);
        }
    }

    public void removeMenuItem(MenuItem menuItem) {
        ArrayList<MenuItem> items = this.getMenuItems();
        if (items.contains(menuItem)) {
            items.remove(menuItem);
            this.setMenuItems(items);
        }
    }

    public void removeMenuItem(List<MenuItem> menuItems) {
        for (MenuItem m : menuItems) {
            removeMenuItem(m);
        }
    }

    public void showSingleMenuItem(MenuItem menuItem) {
        System.out.println(menuItem);
    }

    public void showAllMenuItems() {
        for (MenuItem m : this.menuItems) {
            showSingleMenuItem(m);
        }
    }
}
