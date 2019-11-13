/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 06/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.util.Scanner;

/**
 * 24. Faça um programa que leia um intervalo (num_inicial e num_final) e calcule o
 * somatório de todos os números entre o num_inicial e num_final.
 */
public class ExercicioN2_24 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int num_inicial, num_final, soma, maior, menor;

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        soma = 0;

        // Entrada
        System.out.print("Digite um número inteiro: ");
        num_inicial = sc.nextInt();

        do {
            System.out.printf("Digite um número inteiro, diferente de %d: ", num_inicial);
            num_final = sc.nextInt();
        } while (num_final == num_inicial);

        // Inverte as posições caso o segundo num_inicial > num_final
        maior = menor = num_inicial;

        if (num_final < menor) {
            menor = num_final;
        }
        if (num_final > maior) {
            maior = num_final;
        }

        // Processamento
        for (int i = menor + 1; i < maior; i++) {
            soma += i;
        }

        // Saída
        System.out.printf("\nO somatório dos números entre %d e %d é: %d\n", menor, maior, soma);
    }
}
