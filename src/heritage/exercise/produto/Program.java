package heritage.exercise.produto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products");
        int n = sc.nextInt();
        ArrayList<Product> listProducts = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Product #"+(i+1)+" data:");
            System.out.print("Common, used or imported (c/u/i) ?");
            char product = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(product == 'i'){
                System.out.print("Taxa de importacao: ");
                double frete = sc.nextDouble();
                Product productImported = new ImportedProduct(name, price, frete);
                listProducts.add(productImported);

            }else if(product == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                listProducts.add(new UsedProduct(name, price, date));


            } else if (product == 'c') {
                listProducts.add(new Product(name, price));
            }else{
                System.out.println("Valor errado");
            }

        }
        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Product prod : listProducts) {
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}
