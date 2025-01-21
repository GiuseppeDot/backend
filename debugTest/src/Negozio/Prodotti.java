package Negozio;

import java.util.Random;

public class Prodotti{

    private long id;
    private String categoria;
    private String nome;
    private double prezzo;

    public static long Random(){
        Random random = new Random();
        if(random.nextLong() >= 0){
            return random.nextLong();
        }
        return Random();
    }


    public Prodotti(String categoria, String nome, double prezzo){
        this.categoria = categoria;
        this.nome = nome;
        this.prezzo = prezzo;
        this.id = Random();
    }

    public Prodotti(String categoria, String nome, double prezzo, long id){
        this(categoria, nome, prezzo);
        this.id = id;
    }

    //GET

    public String getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public long getId() {
        return id;
    }
    //SET


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Codice id prodotto: " + id + " - Categoria: " + categoria + " - Nome: " + nome + " - €" + prezzo;
    }

}