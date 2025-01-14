package es1;

import java.util.Arrays;
import java.util.Random;

public class esercizio1 {

    public static void eseguiEsercizio1() {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);

        }
        stampaArray(array);
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);

        }
        stampaArray(array);
    }
    public static void stampaArray(int[] array){
        System.out.println(Arrays.toString(array));  //stampa a stringa l'array passato in precedenza
    }


}
