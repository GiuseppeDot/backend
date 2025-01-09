package Switch;

import java.util.Scanner;

public class StampaLettura {
    public static void stampaLettura(input) {
        switch (input){
                case 0: {
                    System.out.println("zero");
                    break; }
                case 1: {
                    System.out.println("uno");
                    break; }
                case 2: {
                    System.out.println("due");
                    break; }
                case 3: {
                    System.out.println("tre");
                    break; }
                default: {
                System.out.println("non è cpìompreso tra 0 e 3");
                }
            }
    }
    public static void main (String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Inserisci il numero: ");

    }
}
