import java.util.Scanner;

public class Bunny extends Animal {
    @Override
    public void setType(String type) {
        if (type.equalsIgnoreCase("wild")) {
            super.setType(type);
        } else {
            System.out.println("Type cannot be different than wild");
            Scanner scanner = new Scanner(System.in);
            type = scanner.nextLine();
            setType(type);
        }
    }

    @Override
    public void setWeight(float weight) {
        if (weight <= 0) {
            System.out.println("Cannot have weight 0");
            Scanner scanner = new Scanner(System.in);
            weight = scanner.nextFloat();
            setWeight(weight);
        } else {
            super.setWeight(weight);
        }
    }
}
