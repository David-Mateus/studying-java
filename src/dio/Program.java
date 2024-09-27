package dio;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new ContaCorrente();
        scanner.close();
    }
}