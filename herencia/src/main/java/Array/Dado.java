package Array;
import java.security.SecureRandom;
import java.util.Random;

public class Dado {
    public static void main(String[] args){
        SecureRandom random = new SecureRandom();
        int[] tiro = new int[7];//
        final  int LANZAMIENTOS = 10000;
        int lanzamiento;
        tiro[1] = 0;
        tiro[2] = 0;
        tiro[3] = 0;
        tiro[4] = 0;
        tiro[5] = 0;
        tiro[6] = 0;
        for (int i = 0; i < LANZAMIENTOS; i++){
            lanzamiento = random.nextInt( 6) + 1 ;
            tiro[lanzamiento] = tiro[lanzamiento] + 1 ;
        }
        for (int i = 1; i <tiro.length;  i ++){
            System.out.println(" La cara"+i+ "del Dado  "+tiro[i]+" veces");
        }
    }

}
