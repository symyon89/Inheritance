import java.util.Scanner;

public class AnimalMenu implements StartMenu {
    //composition
    protected Bunny[] bunnyList;
    protected Cat[] catList;
    protected Dog[] dogList;
    protected final Scanner scannerText = new Scanner(System.in);
    protected final Scanner scannerNumber = new Scanner(System.in);

    // constructor prin care imi afiseaza cand a fost creat meniul
    public AnimalMenu() {
        System.out.println("Meniul de animale a fost creat");
    }
    //metoda independenta apelata prin clasa la sfarsitul meniului
    public static void getMethod() {
        System.out.println("Felicitari tot programul a fost generat");
    }

    public void menu() {
        //introducerea animalelor in array
        numberOfBunnyes();
        numberOfCats();
        numberOfDogs();
        setAnimalsProp();
        // cream un obiect si pasam listele de animale, aici ar fi mers mai bine un constructor parametrizat
        AnimalsWeightProgram animalsWeightProgram = new AnimalsWeightProgram();
        animalsWeightProgram.setBunnyList(bunnyList);
        animalsWeightProgram.setCatList(catList);
        animalsWeightProgram.setDogList(dogList);
        //afisare animale inainte de inceperea programului de greutate
        System.out.println(animalsWeightProgram);
        // strat program grutate
        animalsWeightProgram.start();
        //afisare dupa programul de greutate
        System.out.println(animalsWeightProgram);
        // apelam metoda statica
        AnimalMenu.getMethod();
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
