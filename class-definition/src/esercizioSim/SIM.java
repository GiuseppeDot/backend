package esercizioSim;

public class SIM {

    private String numero;
    private double credito;
    private Chiamata[] listaChiamate;


    public SIM(String numero) {
        this.numero = numero;
        this.credito = 0;
        this.listaChiamate = new Chiamata[5];
    }

    public void aggiungiCredito(double nuovoCredito){
        this.credito += nuovoCredito;
    }

}
