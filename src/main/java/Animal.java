public abstract class Animal { // clasa nu poate fi accesata decat prin intermediul unui animal
    private String name;
    private String color;
    private float weight;
    private String type;


    public Animal() {
        System.out.println("Un animal a fost creat !"); // constructor clasa, efectueaza o notificare cand acesta este accesat
    }
    // metoda prin care este generat programul de hranire pentru fiecare animal in parte
    public void feedProgram(float firstMeal, float secondMeal, float thirdMeal) {
        System.out.println("Feed program : ");
        System.out.println(" 8 - 9 am, quantity : " + firstMeal);
        System.out.println(" 12 - 13 am, quantity : " + secondMeal);
        System.out.println(" 18 - 19 am, quantity : " + thirdMeal);
        this.weight += firstMeal + secondMeal + thirdMeal;
    }
    // metoda prin care este generat programul de hranire pentru bunny
    public void feedProgram(float firstMeal, float secondMeal) { // overload feed program
        System.out.println("Feed program : ");
        System.out.println(" 10 - 11 am, quantity : " + firstMeal);
        System.out.println(" 19 - 20 am, quantity : " + secondMeal);
        this.weight += firstMeal + secondMeal;
    }
    // metoda prin care este generata programul de slabire pentru fiecare animal
    public void activityAnimal(int hours){
        switch (hours) {
            case 1 -> {
                System.out.println("1 Hour activity has 250 gr weight loss");
                this.weight -= 0.25;
            }
            case 2 -> {
                System.out.println("2 Hour activity has 500 gr weight loss");
                this.weight -= 0.5;
            }
            case 3 -> {
                System.out.println("3 Hour activity has 750 gr weight loss");
                this.weight -= 0.75;
            }
            default -> System.out.println("Activity should be between 1-3 hours, no weight changes made");
        }
    }
    // getter si setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
