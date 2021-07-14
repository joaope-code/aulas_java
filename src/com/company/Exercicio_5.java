package com.company;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a primeira nota do aluno");
        float n1 = scan.nextFloat();
        System.out.println("Informe a segunda nota do aluno");
        float n2 = scan.nextFloat();
        float avg = (n1 + n2) / 2;
        if (avg >= 7) {
        }
        System.out.println("Aprovado");
            else if (avg == 10) {
            System.out.println("Aprovado com Distinção");
        } else (avg < 7) {
            System.out.println("Reprovado");
        }
    }
}

}



