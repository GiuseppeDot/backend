package classiEs;

public class Negozio {

    public static void main(String[] args){
        Customer giuseppe = new Customer("Giuseppe", 8);
        System.out.println(giuseppe);

        Product RTX9000 = new Product("RTX9000 -", "Scheda video -", 4000);
        Product Zappa = new Product("Zappa -", "Oggetto per lavoi agricoli -", 57);
        Product Ferrari812 = new Product("Ferrari 812 SuperFast -", "Macchine -",57.95);

        System.out.println(RTX9000);
        System.out.println(Zappa);
        System.out.println(Ferrari812);

    }

}
