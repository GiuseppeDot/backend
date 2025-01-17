package Catalogo;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class LibriERiviste {
    private long isbnCode;
    private String titolo;
    private LocalDate annoPubblicazione;
    private int numeroPagine;

    public LibriERiviste(String titolo, LocalDate annoPubblicazione, int numeroPagine){
        this.titolo = titolo;
        this.annoPubblicazione = LocalDate.now().minusYears(8);
        this.numeroPagine = numeroPagine;
        Random random = new Random();
        this.isbnCode = random.nextLong();
    }

    public LibriERiviste(String titolo, LocalDate annoPubblicazione, int numeroPagine, long isbnCode){
        this(titolo, annoPubblicazione, numeroPagine);
        this.isbnCode = isbnCode;
    }

    //GET


    public String getTitolo() {
        return titolo;
    }

    public LocalDate getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public long getIsbnCode() {
        return isbnCode;
    }

    //SET

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAnnoPubblicazione(LocalDate annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public void setIsbnCode(long isbnCode) {
        this.isbnCode = isbnCode;
    }


    @Override
    public String toString(){
        return "ISBN CODE: " + isbnCode +
                " - Titolo: " + titolo +
                " - Anno pubblicazione: " + annoPubblicazione +
                " - Numero di pagine: " + numeroPagine;
    }


    //metodo per creare un'istanza tramite input utente:
    public static LibriERiviste catturaInput(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci il titolo dun libro/ rivista");
        String titolo = scanner.nextLine();

        System.out.println("Inserici l'anno di pubblicazione (formato y)");
        int anno = scanner.nextInt();

        System.out.println("Inserisci il numero di pagine");
        int numeroPagine = scanner.nextInt();

        LocalDate annoPubblicazione = LocalDate.of(anno,1,1);
        return new LibriERiviste(titolo, annoPubblicazione, numeroPagine);
    }





}
