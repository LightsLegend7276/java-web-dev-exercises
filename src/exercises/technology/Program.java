package exercises.technology;


import org.junit.Test;

import static org.junit.Assert.*;

public class Program {

    @Test
    public void createComputer() {
    Computer computer = new Computer("Microsoft", "Surface Pro 6", 5.8);
    assertFalse(computer.isOn());
    assertEquals("Microsoft", computer.getProducer());
    assertEquals(5.8, computer.getWeight(), .001);
    computer.turnOn();
    assertTrue(computer.isOn());
        System.out.println(computer.getId());
    }

    @Test
    public void createLaptop() {
    Laptop laptop = new Laptop("Microsoft", "Surface Pro 6", 5.8, 10.2);
    laptop.turnOn();
    laptop.sleep();
    assertEquals("Surface Pro 6", laptop.getModel());
    assertEquals(5.8, laptop.getWeight(), .001);
    assertEquals("Microsoft", laptop.getProducer());
        System.out.println(laptop.getId());
    }

    @Test
    public void createSmartPhone() {
    SmartPhone smartPhone = new SmartPhone("Google", "Pixel 4 XL", 2.3, "Candy bar");
    smartPhone.ring();
    assertEquals("Candy bar", smartPhone.getStyle());
    assertEquals("Google", smartPhone.getProducer());
    assertEquals("Pixel 4 XL", smartPhone.getModel());
    assertEquals(2.3, smartPhone.getWeight(), .001);
        System.out.println(smartPhone.getId());
    }
}
