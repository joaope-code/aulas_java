package com.company;

import java.util.Scanner;

public class Exercicio3da3 {
    public static void main(String[] args) {
        boolean ff = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scan.next();
        while (nome.length() <= 3) {
            System.out.println("Nome invalido, insira novamente seu nome");
            nome = scan.next();
        }

        System.out.println("idade");
        int idade = scan.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Idade invalida, insira novamente");
            idade = scan.nextInt();
        }


        System.out.println("Salário");
        int sala = scan.nextInt();
        while (sala <= 0) {
            System.out.println("Salário invalido, insira novamente");
            sala = scan.nextInt();
        }


      do {
          System.out.println("Qual seu sexo F/M");
          String sx = scan.next();
          if (sx.equalsIgnoreCase("f") || sx.equalsIgnoreCase("m")){

          }else {
              System.out.println("O sexo sexo precisar ser definido como F ou M");
              sx = scan.next();
          }
          }while (ff);


    }
}




