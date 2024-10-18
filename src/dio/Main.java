package dio;

import java.util.Scanner;

public class Main {
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        int sumVelo = 0;

        for(String  v : velocidades){
            total +=1;
            sumVelo += Integer.parseInt(v);
        }
        return (double)sumVelo/total;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}
