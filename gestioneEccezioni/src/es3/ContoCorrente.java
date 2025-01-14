package es3;

public class ContoCorrente {
    private String titolare;
    private int nMovimenti;
    private final int maxMovimento = 50;  //movimenti totali che il conto puo effettuare senza commissioni
    private double saldo;

// costruttore
    public ContoCorrente(String titol, double sald) {
        this.titolare = titol;
        this.saldo = sald;
        this.nMovimenti = 0;

    }


}
