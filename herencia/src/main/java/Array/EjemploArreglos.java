package Array;

import java.util.Scanner;

public class EjemploArreglos {
   public void Zologico1(){

        String[] zoo = { "Monkey", "Chimp","Donkey","Elephant","Panda", "Lion","Turtle","Zebra","Tiger","Snake"};
        System.out.println("Mi zoologico tiene"+zoo.length+"animales");
        System.out.println("Que son :");

        for (int i=0; i<zoo.length; i++){
            System.out.println(i+1+"." + zoo[i]);
        }
    }

    public boolean AnimalExists(String animal, String[] zoo) {
        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i].equals(animal)) {
                return true;
            }
        }
        return false;
    }
 public void Zologico2(){
     String[] zoo = new String[3];
     Scanner sc = new Scanner(System.in);
     // read zoo animal
     for (int i = 0; i < 3; i++) {
         System.out.println("Ingrese un animal en la jaula: " + (i + 1));
         zoo[i] = sc.nextLine();
     }
     //show animals
     System.out.println("Estos son los animales del zoo:");
     for (int i = 0; i < zoo.length; i++) {
     }
 }
 }



