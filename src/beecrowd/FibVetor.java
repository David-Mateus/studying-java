package beecrowd;

import java.util.ArrayList;
import java.util.Scanner;

public class FibVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int prev = 0, next = 1;
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(prev);
        fibonacci.add(next);
        for (int i = 0; i < 60; i++) {
            int fib = prev + next;
            prev = next;
            next = fib;
            fibonacci.add(fib);
        }
        int n = sc.nextInt();
        for(int i = 0; i <n;i++){
            int pos = sc.nextInt();
            if (pos >= 0 && pos < fibonacci.size()) {
                System.out.println("Valor de Fibonacci na posição " + pos + ": " + fibonacci.get(pos));
            } else {
                System.out.println("Posição " + pos + " é inválida.");
            }
        }


        sc.close();
    }
}
