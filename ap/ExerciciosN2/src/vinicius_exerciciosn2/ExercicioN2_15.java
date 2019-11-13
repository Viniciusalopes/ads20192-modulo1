/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 05/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.util.Scanner;

/**
 * 15. Leia um número indeterminado de números e conte a quantidade de números pares e
 * números ímpares. Caso o usuário digite um número inválido (negativo) deve-se exibir uma
 * mensagem e repetir a leitura. O sistema deverá ser encerrado quando for digitado o
 * número 0 (zero).
 */
public class ExercicioN2_15 {

    public static void main(String[] args) {
        // Declaração de Variaveis
        Scanner sc;
        int numero, pares, impares;

        // Inicialização de Variaveis
        sc = new Scanner(System.in);
        pares = impares = 0;

        // Entrada
        System.out.println();
        do {
            System.out.print("Digite um número inteiro positivo (0-Sair): ");
            numero = sc.nextInt();

            // Processamento
            if (numero < 0) {
                System.out.println("Números negativos não são válidos!\n");
            } else if (numero > 0) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        } while (numero != 0);

        // Saída
        System.out.println();
        System.out.printf("Quantidade de números pares  : %d\n", pares);
        System.out.printf("Quantidade de números ímpares: %d\n", impares);
    }
}
