package org.launchcode.java.studios.restaurant;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;


@Getter
@Setter
public class MenuItem {

    enum Category {
        Appetizer, Main_Course, Dessert;
    }

    private double price;
    private String description;
    private MenuItem.Category category;
    private final LocalDate createdDt;
    private @Setter(AccessLevel.NONE) boolean isNew;

    public MenuItem(double price, String description, Category category) {
        this.price =  price;
        this.description = description;
        this.category = category;
        this.createdDt = LocalDate.now();
    }

    public MenuItem(double price, String description, String category) {
        this.price =  price;
        this.description = description;
        this.category = translateCategory(category);
        this.createdDt = LocalDate.now();
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

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if (this.category.equals(Category.Appetizer)) {
            str.append("Appetizer");
        } else if (this.category.equals(Category.Main_Course)) {
            str.append("Main Course");
        } else {
            str.append("Dessert");
        }
        str.append("\n****************");
        str.append("\n");
        str.append("Description: ");
        str.append(this.description);
        str.append("\n");
        str.append("Price: $");
        str.append(this.price);
        if (String.valueOf(this.price).substring(String.valueOf(this.price).indexOf(".")).length() == 2) {
            str.append("0");
        }
        str.append("\n");
        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 &&
                description.equals(menuItem.description) &&
                category == menuItem.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category);
    }
}
