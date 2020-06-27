package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;

public class MenuItem {

    enum Category {
        Appetizer, Main_Course, Dessert
    }

    private double price;
    private String description;
    private MenuItem.Category category;
    private final LocalDate createdDt;
    private boolean isNew;

    public MenuItem(double price, String description, Category category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.createdDt = LocalDate.now();
    }

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = translateCategory(category);
        this.createdDt = LocalDate.now();
    }

    public boolean isNew() {
        boolean aNew = false;
        if (LocalDate.now().getDayOfYear() - this.createdDt.getDayOfYear() <= 5) {
            aNew = true;
        }
        return aNew;
    }

    public LocalDate getCreatedDt() {
        return createdDt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    private Category translateCategory(String category) {
        Category cat = MenuItem.Category.Main_Course;
        if (category.equalsIgnoreCase(MenuItem.Category.Dessert.toString())) {
            cat = MenuItem.Category.Dessert;
        } else if (category.equalsIgnoreCase(MenuItem.Category.Appetizer.toString())) {
            cat = MenuItem.Category.Appetizer;
        }
        return cat;
    }

}
