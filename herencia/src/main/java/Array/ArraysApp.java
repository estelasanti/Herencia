package Array;
import java.util.Scanner;
public class ArraysApp {
    /*public boolean AnimalExists(String animal, String[] zoo) {
        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i].equals(animal)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
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
    }*/
    public static void main(String[] args) {
        int[] numeros = new  int[10];
        Scanner cs = new Scanner(System.in);
        int mayor = 0 ;

        System.out.println("Escribe 10 numeros enteros mayores que 0");
        for (int i= 0;i<10; i++){
            System.out.println("Dame el numero "+ (i+1));
            numeros[i] = cs.nextInt();
        }
        for (int i= 0;i<10;i++){
            if (numeros[i] > mayor){
                mayor = numeros [i];
            }
        }
        System.out.println("El numero mayor es : " + mayor);
    }


}
