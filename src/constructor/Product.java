package constructor;



public class Product {
    // Os Atributos devem ser privados e
    // esses atributos serem acessados pelo set e get
    private String name;
    private double price;
    private int quantity;



    // construtor padrao
    public Product(){}
    // com isso o construtor obriga passa argumentos.
    // Usando outros nomes para facilitar entendimento

    public Product(String name2 , double price2, int quantity2){
        //Referencia para o proprio objeto(Nesse caso a classe Product)
        this.name = name2;
        this.price = price2;
        this.quantity = quantity2;

    }

    // Construtor Opcional - Sobrecarga
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Encapsulamento - Objeto sempre com dados consistente e a propria classe deve garantir isso!
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }


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
