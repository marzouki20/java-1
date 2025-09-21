public class Main {
    public static void main(String[] args) {
        // Create animals
        Animal lion = new Animal();
        Animal eagle = new Animal("Accipitridae", "Eagle", 3, false);

        // Create zoo
        Zoo myZoo = new Zoo("Safari Park", "Tunis", 20);

        // Add animals
        myZoo.addAnimal(lion);
        myZoo.addAnimal(eagle);

        // Display zoo
        myZoo.displayZoo();

        // Test toString
        System.out.println(lion);   // calls Zoo.toString()
    }
}
