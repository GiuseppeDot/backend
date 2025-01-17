package classiEs;

import java.util.Random;

public class Product {

    private long id;
    private String name;
    private double prezzo;
    private String category;


    public Product(String np,String category ,double prz){
        this.name = np;
        this.category = category;
        this.prezzo = prz;
        Random random = new Random();
        this.id = random.nextLong();
    }


    public Product(String np, String category, double prz, long id){
        this(np, category, prz);
        this.id = id;
    }

//GET
    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public long getId(){
        return this.id;
    }
//SET

    public void setName(String nm) {
        this.name = nm;
    }
    public void setCategory(String ct){
        this.category = ct;
    }
    public void setPrezzo(double pr){
        this.prezzo = pr;
    }
    public void setId(long iD){
        this.id = iD;
    }

    @Override
    public String toString(){
        return "Prodotto: " + id + " Nome prodotto: " +  name + " Category: " + category + " Preizzo: " + prezzo ;
    }

}
