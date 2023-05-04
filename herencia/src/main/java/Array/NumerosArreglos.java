package Array;

import java.util.Scanner;

public class NumerosArreglos {
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
