/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 02/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 3. Escreva um programa que leia uma quantidade de números (para teste use 10)
 * calculando e imprimindo o maior, o menor e a média entre os números.
 */
public class ExercicioN2_3 {

    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int quantidade = 10,
                cont = 1,
                menor = 2147483647,
                maior = -2147483648,
                numero;

        double soma = 0.0,
                media;

        // Entrada
        System.out.println();
        while (cont < quantidade) {
            System.out.printf("Digite o %dº número: ", cont);
            numero = sc.nextInt();

            // Processamento
            if (numero < menor) {
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            }

            soma += (double) numero;

            cont++; // Incremento
        }

        media = soma / quantidade;

        // Saída
        System.out.println();
        System.out.printf("O menor número é %d.\n", menor);
        System.out.printf("O maior número é %d.\n", maior);
        System.out.printf("Média entre os números: %.2f\n", media);
    }
}
