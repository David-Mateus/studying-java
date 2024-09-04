package constructor;



import java.util.Locale;
import java.util.Scanner;
//modificadores de acesso
/*
    private - so pode ser acessado dentro da prorpria classe
    prodected - membro so pode ser acessado no mesmo pacote, bem como em subclasse de pacotes diferentes
    public - acessado em todas as classe

*/


public class ConstructorMain {
    public static void main(String[] args) {
        // Construtor origa que objeto receba dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Product product;
//        product = new Product();
//
//        product.setName(sc.next());
//        product.setPrice(sc.nextDouble());
//
//
//        System.out.println("Product data: " + product.informationProduct());
//        System.out.println("Enter the number of products to be added in Stock: ");
//        int addProduct = sc.nextInt();
//        product.addProducts(addProduct);
//        System.out.println("Product data: " + product.informationProduct());
////        System.out.prinStudenttln("Enter the number of products to be remoed in Stock: ");
//        int removeProduct = sc.nextInt();
//        product.removeProducts(removeProduct);
//        System.out.println("updated data " + product.informationProduct());
        int number = sc.nextInt();
        String holder = sc.next();
        double deposit = sc.nextDouble();
        Bank bank = new Bank(number, holder, deposit);
        bank.withdraw(500.00);
        System.out.println(bank.toString());



        sc.close();
    }
}
