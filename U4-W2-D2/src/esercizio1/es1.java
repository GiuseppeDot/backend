package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class es1 {
    public static void funzione() {
        Scanner myScanner = new Scanner(System.in);

        Set<String> interi = new HashSet<>();
        Set<String> duplicato = new HashSet<>();

        System.out.println("Inserisci il numero di elementi da inserire");
        int nElementi = myScanner.nextInt();
        myScanner.nextLine();


        for (int i = 0; i < nElementi; i++){
            System.out.println("Inserisci un altra parola" + (i + 1));
            String parola = myScanner.nextLine();
            if (!interi.add(parola)){
                duplicato.add(parola);
            }
        }
        System.out.println("Parola duplicata " + duplicato);
        System.out.println("Numero parola " + interi.size());
        System.out.println("Elenco parole  " + interi);

    }
}
