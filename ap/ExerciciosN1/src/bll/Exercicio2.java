/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 17/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 2. Escreva um programa que leia o nome e a idade de uma pessoa e imprima: “O
 * usuário Nome* informou que tem *idade* anos”.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        // Entrada
        System.out.print("Digite o seu nome : ");
        nome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();
        
        // Saída
        System.out.printf("O usuário %s informou que tem %d anos.\n", nome, idade);

    }
}
