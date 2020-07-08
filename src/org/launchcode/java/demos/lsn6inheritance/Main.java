package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        System.out.println(garfield.noise());
//        System.out.println(garfield.getFamily());
        garfield.eat();
        System.out.println(garfield.noise());
//        System.out.println(garfield.isTired());
//        garfield.sleep();
//        System.out.println(garfield.isTired());
//        System.out.println(garfield.purr());
    }

}
