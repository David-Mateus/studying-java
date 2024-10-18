package abstracts;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payer: ");
        int numberPayers = sc.nextInt();
        for(int i =0; i < numberPayers; i ++){
            System.out.println("Tax payer #1 data: "+ (i+1));
            System.out.print("Individual or company(i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name:  ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if(type == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                TaxPayer taxPayer1 = new Individual(name, anualIncome, healthExpenditures);
                taxPayers.add(taxPayer1);

            }else if(type == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                TaxPayer taxPayer2 = new Company(name, anualIncome, numberOfEmployees);
                taxPayers.add(taxPayer2);

            }else{
                System.out.println("Sigla errada!");
            }

        }
        System.out.println("Taxes PAID:");
        for(TaxPayer tax : taxPayers){
            System.out.println(tax.getName() +":"+"$"+ tax.tax());
        }

        sc.close();
    }
}
