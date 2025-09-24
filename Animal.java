public class Animal {
    // Attributes
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal() {
        this.family =  "mejri";
        this.name = "aziz";
        this.age = 20;
        this.isMammal = isMammal;
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
   public void displayAnimal() {
        System.out.println("Animal:");
        System.out.println("Name: " +name);
        System.out.println("Age: " + age);
        System.out.println("isMammal: " + isMammal);
       System.out.println("family: " + family);
    }




}
