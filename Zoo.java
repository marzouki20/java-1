public class Zoo {
    // Attributes
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int count; // to track number of animals added

    // Constructor
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25]; // max 25 animals
        this.count = 0;
    }

    // Add animal to zoo
    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count++] = animal;
        } else {
            System.out.println("....");
        }
    }

    // Display zoo info
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < count; i++) {
            System.out.println(animals[i]);
        }
    }
}