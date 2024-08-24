package entities.poo;
// o metodo estatico não é instaciado igual os outros e diretamente da classe
public class CurrencyConverter {
    public static double price;
    public static double dollar;

    public static double totalDollar(){
        return price * dollar;

    }
    public static double  iofPaid(){
        double iofTax = totalDollar() * 0.06;
        return iofTax + totalDollar();
    }
}
