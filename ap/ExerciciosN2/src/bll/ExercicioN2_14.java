/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 05/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 14. Faça um programa que utilizando a estrutura Do-While, leia para um número
 * indeterminado de pessoas: leia a idade de cada pessoa, sendo que a leitura da idade 0
 * (zero) indica o fim dos dados e não deve ser considerada: calcule e escreva o número de
 * pessoas; calcule e escreva a idade média do grupo; calcule e escreva a menor idade e a
 * maior idade.
 */
public class ExercicioN2_14 {

    public static void main(String[] args) {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        int idade, quantidade = 0, menor = 120, maior = 0;
        double soma = 0, media = 0;

        // Entrada
        System.out.println();
        do {
            System.out.printf("Idade da %dº pessoa: ", quantidade + 1);
            idade = sc.nextInt();

            if (idade < 0) {
                System.out.println("Idade inválida!\n");
            } else if (idade > 0) {

                quantidade++;
                soma += idade;

                if (idade > maior) {
                    maior = idade;
                }
                if (idade < menor) {
                    menor = idade;
                }
            }
        } while (idade != 0);

        // Processamento // Saída
        if (quantidade > 0) {
            media = soma / quantidade;
            System.out.println();
            System.out.printf("Quantidade de pessoas: %d\n", quantidade);
            System.out.printf("Idade média do grupo : %.2f\n", media);
            System.out.printf("Menor idade no grupo : %d\n", maior);
            System.out.printf("Maior idade no grupo : %d\n", menor);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
    }
}
