public class Zoo {
    // Attributes
    public Animal[] animals;
    public String name;
    public String city;
    public static final int NBR_CAGES = 25;

    public int count;


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
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
        System.out.println("Nbr cages " + NBR_CAGES);
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


//commmmmpttt

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < count; i++) {
            if (animals[i].equals(animal)) {
                for (int j = i; j < count - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }
//fuuulllll
public boolean isZooFull() {
    return count >= NBR_CAGES;
}
//commmparaisonn
public static Zoo comparerZoo(Zoo z1, Zoo z2) {
    if (z1.count >= z2.count) return z1;
    else return z2;
}

}
