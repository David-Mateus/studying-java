package beecrowd.lista3;

import java.util.Scanner;

public class ParesentreCincoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int i = 0; i < 5; i++){
            int n = sc.nextInt();
            if(n % 2 == 0){
                total += 1;
            }

        }
        System.out.println(total);
        sc.close();
    }
}
