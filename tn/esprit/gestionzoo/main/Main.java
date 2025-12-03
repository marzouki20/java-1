package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import java.awt.desktop.QuitStrategy;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            String name="7ayewen";
            int age=0;
            Animal lion = new Animal(name, age);
            Animal eagle = new Animal("3asfour", "Eagle", 3, false);

            Zoo myZoo = new Zoo("lafayetttt", "Tunis");

            myZoo.addAnimal(lion);
            myZoo.addAnimal(eagle);
          int find = myZoo.searchAnimal(lion);
            if (find == -1) {
                System.out.println("tn.esprit.gestionzoo.entities.Animal not found");
            }
            else {
                System.out.println("tn.esprit.gestionzoo.entities.Animal found");
            }
            string aziz;
            scanner aziz = new Scanner(System.in);
            System.out.println("myZoo comporte" ,nbrcage,"cage");


           // myZoo.displayZoo();


           // System.out.println(lion);
        }
    }
