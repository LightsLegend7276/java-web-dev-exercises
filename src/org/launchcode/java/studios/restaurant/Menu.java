package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private static LocalDate updatedDt;

    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
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
}
