package com.company;

import java.util.Scanner;

public class Exercicio1da3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma nota entre 0 e 10");
        int nota = scan.nextInt();

        while (nota <0 || nota >10){
            System.out.println("Nota invalida, por favor insira novamente");
             nota = scan.nextInt();
        }
        System.out.println("Obrigado!");
    }
}
