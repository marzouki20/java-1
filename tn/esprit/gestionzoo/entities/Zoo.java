package tn.esprit.gestionzoo.entities;


public class Zoo {
    // Attributes
    private Animal[] animals;
    private String name;
    private String city;
    public static final int NBR_CAGES = 25;

    private  int count;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }

    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {

            this.city = city;

    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public Animal[] getAnimals() {
        return animals;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[25];
        this.count = 0;
    }


    public Boolean addAnimal(Animal animal) {
        while (!isZooFull()) {//instruction 17
            if (count < animals.length) {
                animals[count++] = animal;
                return true;
            } else {
                return false;
            }
        }

        return false;
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
    public int searchAnimal(Animal animal) {
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
