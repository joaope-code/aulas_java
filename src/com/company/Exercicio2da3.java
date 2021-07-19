package com.company;

import java.util.Scanner;

public class Exercicio2da3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Usuário");
        String user = scan.next();
        System.out.println("Senha");
        String senha = scan.next();

        while (user.equals(senha)){
            System.out.println("A senha não pode ser igual ao nome de usuário");
            senha = scan.next();
        }
        System.out.println("Obrigado");

    }
}
