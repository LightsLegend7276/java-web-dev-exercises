package exercises.technology;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SmartPhone extends Computer{

    private String style;

    public SmartPhone(String producer, String model, double weight, String style) {
        super(producer, model, weight);
        this.style = style;
    }

    public void ring() {
        System.out.println("Ring... Ring... Ring...");
    }
}
