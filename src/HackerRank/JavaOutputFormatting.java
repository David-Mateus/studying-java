package HackerRank;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            // %-10s faz a strings se afasta 10
            // %03d adicina 3 caracterer ara valores com duas casas
            System.out.printf("%-10s%03d\n", s1, x);
        }
        System.out.println("================================");

        sc.close();

    }
}
