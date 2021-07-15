package com.company;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual turno você estuda? digite M-matutino ou V-Vespertino ou N- Noturno");
        String ini =scan.next();

        if (ini.equalsIgnoreCase("m")){
            System.out.println("Bom dia!");
        }else if (ini.equalsIgnoreCase("v")){
            System.out.println("Boa tarde!");
        }else if (ini.equalsIgnoreCase("n")){
            System.out.println("Boa noite!");
        }else {
            System.out.println("Valor Inválido");
        }
    }
}
