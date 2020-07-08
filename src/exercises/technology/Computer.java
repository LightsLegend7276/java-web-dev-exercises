package exercises.technology;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer extends AbstractEntity{

    private String producer;
    private String model;
    private double weight;

    private @Setter(AccessLevel.NONE) boolean isOn;

    private @Setter(AccessLevel.NONE) final int id;

    public Computer(String producer, String model, double weight) {
        this.id = super.getId();
        this.producer = producer;
        this.model = model;
        this.weight = weight;
        isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            this.isOn = true;
        } else {
            System.out.println("The computer is already on!");
        }
    }

    public void turnOff() {
        if (isOn) {
            this.isOn = false;
        } else {
        System.out.println("The computer is already off!");
        }
    }
}
