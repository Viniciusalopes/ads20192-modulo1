/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 02/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 3. Escreva um programa que leia uma quantidade de números (para teste use 10)
 * calculando e imprimindo o maior, o menor e a média entre os números.
 */
public class ExercicioN2_03 {

    public static void main(String[] args) {
        // Declaração de Variáveis
        Scanner sc;
        int quantidade, cont, menor, maior, numero;
        double soma, media;
        
        // Inicialização de Variáveis
        sc = new Scanner(System.in);
        quantidade = 10;
        cont = 1;
        menor = maior = 0;
        soma = 0.0;

        // Entrada
        System.out.println();
        while (cont < quantidade) {
            System.out.printf("Digite o %dº número: ", cont);
            numero = sc.nextInt();

            // Processamento
            if (cont == 1) {
                maior = menor = numero;
            } else {
                if (numero < menor) {
                    menor = numero;
                }

                if (numero > maior) {
                    maior = numero;
                }
            }

            soma += (double) numero;

            cont++; // Incremento
        }

        // Média
        media = soma / quantidade;

        // Saída
        System.out.println();
        System.out.printf("O menor número é %d.\n", menor);
        System.out.printf("O maior número é %d.\n", maior);
        System.out.printf("Média entre os números: %.2f\n", media);
    }
}
