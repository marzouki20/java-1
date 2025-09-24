public class Zoo {
    // Attributes
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int count;


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
        this.count = 0;
    }


    Boolean addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count++] = animal;
            return true;
        } else {
            return false;
        }
    }


    public void displayZoo() {
        System.out.println("zoo Nammme " + name);
        System.out.println("place " + city);
        System.out.println("Nbr cages " + nbrCages);
        System.out.println("animaaalss:::");
        for (int i = 0; i < count; i++) {
            animals[i].displayAnimal();
        }
    }
    int searchAnimal(Animal animal) {
        for (int i = 0; i < count; i++) {
            if (animals[i] == animal) {
                return i;

            }
        }

            return -1;
    }
}
