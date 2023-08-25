package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;
    
    public doubletotalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void remove(int quantity){
        this.quantity -= quantity;
    }
}

