/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 06/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 21. Faça um programa que leia o seu nome e o imprima 100 vezes.
 */
public class ExercicioN2_21 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        String nome;

        // Inicialização de variáveis
        sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();

        // Saída
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d) %s\n", i + 1, nome);
        }
    }
}
