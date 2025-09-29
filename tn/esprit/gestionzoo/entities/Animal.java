package tn.esprit.gestionzoo.entities;

public class Animal {
    // Attributes
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

//name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>0) {
            this.name = name;
        }
    }


//family
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }

//age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
       if(age >0) {
           this.age = age;

       }

    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }



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
        System.out.println("tn.esprit.gestionzoo.entities.Animal:");
        System.out.println("Name: " +name);
        System.out.println("Age: " + age);
        System.out.println("isMammal: " + isMammal);
       System.out.println("family: " + family);
    }




}
