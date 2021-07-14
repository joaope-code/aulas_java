package com.company;

import java.util.Scanner;

public class aula14_07 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Digite o primeiro numéro");
//        double num1 = scan.nextDouble();
//        System.out.println("Digite o segundo numéro");
//        double num2 = scan.nextDouble();
//        if (num1 > num2) {
//            System.out.println(num1);
//        }
//        else if (num2 > num1) {
//            System.out.println(num2);
        //Exercicio 2 da lista 2
        Scanner Scan = new Scanner(System.in);
        System.out.println("Informe um valor");
        double num1 = Scan.nextDouble();
        if (num1 < 0) {
            System.out.println("O valor é negativo");
        } else if (num1 >= 0) {
            System.out.println("O valor é positivo");
        }

    }
}



//}







