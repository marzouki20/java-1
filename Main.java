public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal();
        Animal eagle = new Animal("3asfour", "Eagle", 3, false);

        Zoo myZoo = new Zoo("lafayetttt", "Tunis");

        myZoo.addAnimal(lion);
        myZoo.addAnimal(eagle);
      int find = myZoo.searchAnimal(lion);
        if (find == -1) {
            System.out.println("Animal not found");
        }
        else {
            System.out.println("Animal found");
        }




       // myZoo.displayZoo();


       // System.out.println(lion);
    }
}
