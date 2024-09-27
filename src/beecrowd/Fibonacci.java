package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 0; // 1, 1
        int next = 1;
        for(int k = 0; k < n; k++){
            int fib = prev + next;
            prev = next;
            next = fib;
            System.out.print( prev+" ");
        }

        sc.close();
    }
}
