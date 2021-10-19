import java.util.Scanner;

public class AnimalMenu {
    protected Bunny[] bunnyList;
    protected Cat[] catList;
    protected Dog[] dogList;
    protected final Scanner scannerText = new Scanner(System.in);
    protected final Scanner scannerNumber = new Scanner(System.in);

    public AnimalMenu() {
        System.out.println("A fost accesat constructorul animal menu");
    }

    public void menu() {
        numberOfBunnyes();
        numberOfCats();
        numberOfDogs();
        setAnimalsProp();
        AnimalsWeightProgram animalsWeightProgram = new AnimalsWeightProgram();
        animalsWeightProgram.setBunnyList(bunnyList);
        animalsWeightProgram.setCatList(catList);
        animalsWeightProgram.setDogList(dogList);
        System.out.println(animalsWeightProgram);
        animalsWeightProgram.start();
        System.out.println(animalsWeightProgram);
    }

    private void setAnimalsProp() {
        enterBunnyes();
        enterCats();
        enterDogs();
    }

    private void enterBunnyes() {
        System.out.println("Enter bunnyes");
        for (int i = 0; i < bunnyList.length; i++) {
            bunnyList[i] = new Bunny();
            bunnyList[i].setName(introduceName());
            bunnyList[i].setType("wild");
            bunnyList[i].setWeight(introduceWeight());
            bunnyList[i].setColor(introduceColor());
        }
    }

    private void enterCats() {
        System.out.println("Enter cats");
        for (int i = 0; i < catList.length; i++) {
            catList[i] = new Cat();
            catList[i].setName(introduceName());
            catList[i].setType("domestic");
            catList[i].setWeight(introduceWeight());
            catList[i].setColor(introduceColor());
        }
    }

    private void enterDogs() {
        System.out.println("Enter Dogs");
        for (int i = 0; i < dogList.length; i++) {
            dogList[i] = new Dog();
            dogList[i].setName(introduceName());
            dogList[i].setType("domestic");
            dogList[i].setWeight(introduceWeight());
            dogList[i].setColor(introduceColor());
        }
    }

    private String introduceName() {
        System.out.print("Introduce Name : ");
        return scannerText.nextLine();
    }

    private String introduceColor() {
        System.out.print("Introduce color : ");
        return scannerText.nextLine();
    }

    private float introduceWeight() {
        System.out.print("Introduce weight : ");
        return scannerNumber.nextFloat();
    }

    private void numberOfBunnyes() {
        System.out.print("Enter number of bunnyes : ");
        int number = scannerNumber.nextInt();
        bunnyList = new Bunny[number];
    }

    private void numberOfCats() {
        System.out.print("Enter number of cats : ");
        int number = scannerNumber.nextInt();
        catList = new Cat[number];
    }

    private void numberOfDogs() {
        System.out.print("Enter number of dogs : ");
        int number = scannerNumber.nextInt();
        dogList = new Dog[number];
    }

    public void setBunnyList(Bunny[] bunnyList) {
        this.bunnyList = bunnyList;
    }

    public void setCatList(Cat[] catList) {
        this.catList = catList;
    }

    public void setDogList(Dog[] dogList) {
        this.dogList = dogList;
    }

}
