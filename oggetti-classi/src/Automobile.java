//definizione della classe
public class Automobile {

    //campo (o attributo o ststi)

    //private [static] [final] tipoCampo nomeCanpo
    //private: attributo di visibilità
    //static: condiviso da tutti gli oggetti della classe
    //final: è una costante, come "const" in JS
    private String modello;
    private String colore;
    private double benzina;
    private Persona conducemte;
    private String targa;

    //metodi (i costruttori)
    public Automobile (String modello) {
        //inizializzare i volori (campi) dell'oggetto
        // non ha mai un return e in void
        this.modello = modello;

    }

    public Automobile(String modello, String colore, String targa) {
        this.modello = modello;
        this.colore = colore;
        this.targa = targa;

    }


    //intestazione del metodo
    public String getModello() {
        //corpo del metodo
        return this.modello;

    }



}