package entities.poo;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public String informationProduct(){
        String info = "Name: " + name + " Price: " + price + " Quantity: " + quantity + " Total " + totalValueInStock();
        System.out.println(info);
        return info;
    }
    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity1){
        quantity += quantity1;
    }
    public void removeProducts(int quantity2){
        quantity -= quantity2;
    }
    public String toString(){
        return name
                + ", $"
                + price
                + ", "
                + quantity
                + " units, Total: $"
                + totalValueInStock();
    }
}
