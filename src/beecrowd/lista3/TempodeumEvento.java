package beecrowd.lista3;

import java.util.Scanner;

public class TempodeumEvento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia1 = sc.nextInt();
        int hr1 = sc.nextInt();
        int min1 = sc.nextInt();
        int sg1 = sc.nextInt();
        int dia2 = sc.nextInt();
        int hr2 = sc.nextInt();
        int min2 = sc.nextInt();
        int sg2 = sc.nextInt();

        int tempo1 = (dia1*60*60*24) + (hr1*60*60) + (min1*60) + sg1;
        int tempo2 = (dia2*60*60*24) + (hr2*60*60) + (min2*60) + sg2;
        int segundos = tempo2 - tempo1;

        int dias = (segundos/60*60*24);
        segundos -= dias * 24 * 60 * 60;
        int horas = segundos/(60*60);
        segundos -= horas * 60 * 60;
        int minutos = segundos/60;
        segundos -= minutos * 60;
        System.out.printf("%s dia(s)\n", dias);
        System.out.printf("%s hora(s)\n", horas);
        System.out.printf("%s minuto(s)\n", minutos);
        System.out.printf("%s segundo(s)\n", segundos);

        sc.close();
    }
}
