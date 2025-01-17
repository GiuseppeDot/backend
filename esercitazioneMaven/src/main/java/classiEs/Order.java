package classiEs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {

    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;


    public Order(Customer c){
        Random random = new Random();
        this.id = random.nextLong();
        this.customer = c;
        this.status = "PENDING";
        this.orderDate = LocalDate.now();
        this.deliveryDate = LocalDate.now().plusDays(7);
        this.products = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    //aggiunge un prodotto all'ordine
    public void addProduct(Product p){
        products.add(p);
    }

    @Override
    public String toString(){
        String label = "Ordine: " + id + "\n";
        label+= "- Status: " + status + "\n";
        label+= "- Data ordine: " + orderDate + "\n";
        label+= "- Consegna prevista per: " + deliveryDate + "\n";
        label+= "- Cliente: " + customer + "\n";
        label+= "- Prodotti: " + products;
        return label;
    }

}
