package dio;

import java.util.Scanner;

public class Queda {
    public static String verificarQuedaConexao(String[] velocidades) {
        for(String velo : velocidades){

            if(Integer.parseInt(velo) == 0){
                return "Queda de Conexao";
            }
        }
        return "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] velocidades = input.split(",");
        String resultado = verificarQuedaConexao(velocidades);
        System.out.println(resultado);
        scanner.close();
    }
}