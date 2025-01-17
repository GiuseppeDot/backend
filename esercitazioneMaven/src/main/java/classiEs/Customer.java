package classiEs;

import java.util.Random;

public class Customer {
    private long id;
    private String name;
    private int tier;

    public Customer(String name,int tier){
        this.name = name;
        this.tier = tier;
        Random random = new Random();
        this.id = random.nextLong();
    }


    public Customer (long id, String nm, int t){
        this(nm, t);
        this.id = id;

    }
//GETTER
    public String getName(){
        return this.name;
    }

    public int getTier(){
        return  this.tier;
    }

    public long getId(){
        return this.id;
    }

    //SETTER (non ritornano nulla quindi: void)

    public void setName(String n){
        this.name = n;
    }

    public void setTier(int t){
        this.tier = t;
    }

    public void setId(long iD){
        this.id = iD;
    }


    @Override
    public String toString() {
        return "Cliente: " + id + " Nome: " + name + " Livello: " + tier;
    }

}
