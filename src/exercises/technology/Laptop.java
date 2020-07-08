package exercises.technology;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Laptop extends Computer{

    private double screenSize;

    public Laptop(String producer, String model, double weight, double screenSize) {
        super(producer, model, weight);
        this.screenSize = screenSize;
    }

    public void sleep() {
        if (isOn()) {
            System.out.println("Computer is now sleeping. ZZZZzzzzZZZZzzzz");
        } else {
            System.out.println("Computer is not on.");
        }
    }
}
