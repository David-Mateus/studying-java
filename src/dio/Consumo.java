package dio;


import java.util.Scanner;


public class Consumo {

    public static int calcularConsumoTotal(String[] consumoSemanal) {
        int total = 0;
        for(String sum: consumoSemanal){
            total+=Integer.parseInt(sum);
        }
        return total;
    }
    public static int calcularMediaMensal(int total, int tamanho){
        return total/tamanho;
    }
    public static int calcularMaiorConsumo(String[] maiorConsumo){
        int maior = 0;
        int sem = 0;
        for(String m: maiorConsumo){
            if(Integer.parseInt(m) > maior){
                maior = Integer.parseInt(m);
                sem++;
            }
        }
        return sem;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dados = scanner.nextLine();
        String[] consumoSemanal = dados.split(",");
        int calculaConsumo = calcularConsumoTotal(consumoSemanal);
        int calcularMedia = calcularMediaMensal(calculaConsumo, consumoSemanal.length);
        int maiorConsumo = calcularMaiorConsumo(consumoSemanal);

        System.out.println(calculaConsumo);
        System.out.println(calcularMedia);
        System.out.println(maiorConsumo);


        scanner.close();
    }

}

