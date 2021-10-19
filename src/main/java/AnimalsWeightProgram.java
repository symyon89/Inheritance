
public class AnimalsWeightProgram extends AnimalMenu { // mostenim clasa Animal si clasa Animal meniu si utilizam campurile din acestea
    private int days;

    static{
        System.out.println("Programul de hranire a fost accesat!"); // metoda statica conform exercitiu
    }
    {
        System.out.println("Programul de hranire a fost accesat din blocul non - static !");// metoda non-statica conform exercitiu
    }

    public AnimalsWeightProgram() {

        System.out.println("Incepem sa rulam constructorul programul de hranire !!");
    }

    public void start() {
        System.out.println("For how many days do you want to generate weight program ?");
        days = this.scannerNumber.nextInt();
        System.out.println("Select first meal for animals in Kg");
        float firstMeal = scannerNumber.nextFloat();
        System.out.println("Select second meal for animals in Kg");
        float secondMeal = scannerNumber.nextFloat();
        System.out.println("Select third meal for animals in Kg");
        float thirdMeal = scannerNumber.nextFloat();
        System.out.println(" Enter 1-3 hours for activity");
        int hours = scannerNumber.nextInt();
        bunnyActivities(firstMeal, secondMeal, hours);
        catActivities(firstMeal, secondMeal, thirdMeal, hours);
        dogActivities(firstMeal, secondMeal, thirdMeal, hours);
    }

    private void bunnyActivities(float firstMeal, float secondMeal, int hours) {
        for (Bunny bunny : bunnyList) {
            System.out.println("Bunnies feeding program :");
            for (int i = 0; i < days; i++) {
                bunny.feedProgram(firstMeal, secondMeal);
                bunny.activityAnimal(hours);
            }
        }
    }

    private void catActivities(float firstMeal, float secondMeal, float thirdMeal, int hours) {
        for (Cat cat : catList) {
            System.out.println("Cats feeding program :");
            for (int i = 0; i < days; i++) {
                cat.feedProgram(firstMeal, secondMeal, thirdMeal);
                cat.activityAnimal(hours);
            }
        }
    }

    private void dogActivities(float firstMeal, float secondMeal, float thirdMeal, int hours) {
        for (Dog dog : dogList) {
            System.out.println("Dogs feeding program :");
            for (int i = 0; i < days; i++) {
                dog.feedProgram(firstMeal, secondMeal, thirdMeal);
                dog.activityAnimal(hours);
            }
        }
    }

    @Override
    public String toString() {
        return "AnimalsWeightProgram: " +
                "\nbunnyList:\n" + showAllBunnys() +
                "catList:\n" + showAllCats() +
                "dogList:\n" + showAllDogs();
    }

    private String showAllBunnys() {
        StringBuilder stringBunnies = new StringBuilder();
        for (Bunny bunny : bunnyList) {
            stringBunnies.append(bunny.getName());
            stringBunnies.append(", ");
            stringBunnies.append(bunny.getColor());
            stringBunnies.append(", ");
            stringBunnies.append(bunny.getType());
            stringBunnies.append(", ");
            stringBunnies.append(bunny.getWeight());
            stringBunnies.append("\n");
        }
        return String.valueOf(stringBunnies);
    }

    private String showAllCats() {
        StringBuilder stringCats = new StringBuilder();
        for (Cat cat : catList) {
            stringCats.append(cat.getName());
            stringCats.append(", ");
            stringCats.append(cat.getColor());
            stringCats.append(", ");
            stringCats.append(cat.getType());
            stringCats.append(", ");
            stringCats.append(cat.getWeight());
            stringCats.append("\n");
        }
        return String.valueOf(stringCats);
    }

    private String showAllDogs() {
        StringBuilder stringDogs = new StringBuilder();
        for (Dog dog : dogList) {
            stringDogs.append(dog.getName());
            stringDogs.append(", ");
            stringDogs.append(dog.getColor());
            stringDogs.append(", ");
            stringDogs.append(dog.getType());
            stringDogs.append(", ");
            stringDogs.append(dog.getWeight());
            stringDogs.append("\n");
        }
        return String.valueOf(stringDogs);
    }
}
