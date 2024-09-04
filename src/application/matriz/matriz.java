package application.matriz;

import java.util.Arrays;
import java.util.Scanner;

//aranjos bidimensionais vetoresxvetores(ilinhaxccolna)
public class matriz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // colunas
        int m = sc.nextInt(); //linhas
         int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++){

            //percorrendo as colunas
            for( int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int position = sc.nextInt();
/*
3 4
10 8 15 12
21 11 23 8
14 5 13 19
8
**/
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == position){
                    System.out.println("Position: "+i +","+j);
                    if(j>0){
                        System.out.println("Left: "+mat[i][j-1]);
                    }
                    if(i > 0){
                        System.out.println("Up: "+mat[i-1][j]);
                    }
                    if(j < mat[i].length-1){
                        System.out.println("Right: "+mat[i][j+1]);
                    }
                    if(i < mat.length-1){
                        System.out.println("Down"+mat[i+1][j]);
                    }




                }
            }

        }

//        int n = sc.nextInt();

        //criar matriz
//        int[][] mat = new int[n][n];

        //percorrendo as linhas
//        for (int i = 0; i < n; i++){
//
//            //percorrendo as colunas
//            for( int j = 0; j < n; j++){
//                mat[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Main diagonal");
//        for(int i = 0; i<n; i++){
//            System.out.println(mat[i][i] + " ");
//        }
//        int count = 0;
//        for (int i = 0; i < n; i++){
//
//            //percorrendo as colunas
//            for( int j = 0; j < n; j++){
//                if(mat[i][j] < 0){
//                    count++;
//                }
//            }
//        }
//        System.out.println("Negative number "+ count);







        sc.close();
    }
}
