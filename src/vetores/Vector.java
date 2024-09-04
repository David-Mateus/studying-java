package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        int v = sc.nextInt();
//        double[] vect = new double[v];
//        for(int i = 0; i < v; i++){
//            vect[i] = sc.nextDouble();
//        }
//        double average = 0.0;
//        for(int i = 0; i < vect.length; i++){
//             average += vect[i];
//        }
//        System.out.printf("Media %.2f",(average/v));

//        int v = sc.nextInt();
//        Product[] vect = new Product[v];
//        for(int i = 0; i < v; i++){
//           String name = sc.next();
//           double price = sc.nextDouble();
//           vect[i] = new Product(name, price);
//       }
//        double sum = 0.0;
//        for(int i = 0; i < v; i++){
//            sum += vect[i].getPrice();
//        }
//        System.out.println(sum/v);
//        int v = sc.nextInt();
//        Height[] vect = new Height[v];
//        for(int i = 0; i < v; i++){
//           String name = sc.next();
//           int age = sc.nextInt();
//           double height = sc.nextDouble();
//           vect[i] = new Height(name, age, height);
//       }
//
//        int menores = 0;
//        double sum = 0.0;
//        for(int i = 0; i < vect.length; i++){
//            if(vect[i].getAge() < 16){
//                menores +=1;
//            }
//            sum += vect[i].getAge();
//        }
//        double average = sum/vect.length;
//        System.out.printf("Altura media: %.2f", average);
//        double percentualMenores = ((double) menores / v) * 100.0;
//        System.out.printf("Pessoas com menos de 16 anos: %.2f", percentualMenores);
//        for(int i = 0; i < vect.length; i++) {
//            if (vect[i].getAge() < 16) {
//                System.out.println(vect[i].getName());
//            }
//        }
//        int v = sc.nextInt();
//        Old[] vect = new Old[v];
//        for(int i = 0; i < v; i++){
//            String name = sc.next();
//            int age = sc.nextInt();
//            vect[i] = new Old(name, age);
//        }
//        Old older = vect[0];
//
//
//        for(int i = 0; i < v; i++){
//            if(vect[i].getAge() >= older.getAge()){
//                older = vect[i];
//            }
//        }
//        System.out.println("Última pessoa com a maior idade: " + older.getName() + " com idade " + older.getAge());

        int v = sc.nextInt();
        if(v < 10){
            Pensionato[] vect = new Pensionato[10];
            for(int i = 0; i < v; i++){
                System.out.println("Rent #"+(i+1)+":");
                System.out.print("Name:");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Email:");
                String email = sc.next();
                System.out.print("Room:");
                // Escolho a posição que quero colocar dentro do vetor
                int room = sc.nextInt();
                vect[room] = new Pensionato(name, email);

            }
            for (int i = 0; i < 10; i++) {
                if(vect[i] != null){
                    System.out.println(i+":"+vect[i].getName()+","+vect[i].getEmail());
                }

            }
        }else{
            System.out.println("Estourou limite de quertos");
        }


        sc.close();
    }

}
