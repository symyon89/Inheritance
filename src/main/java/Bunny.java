import java.util.Scanner;

public class Bunny extends Animal {
    //efectuam override la setType si nu permitem iepuri decat cu tipul wild
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

    //efectuam override la setWeight si nu permitem iepuri greutatea mai mica de 0 kg
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
