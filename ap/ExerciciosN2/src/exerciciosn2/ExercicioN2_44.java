/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 13/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 44. Faça um programa que leia um vetor de inteiros, de 10 posições. A seguir, encontre
 * o menor elemento (X) e o maior elemento (Y) do vetor. Imprima uma mensagem mostrando:
 * “O menor elemento do vetor é”, X, “e sua posição dentro do vetor é: V[x]. Já o maior
 * elemento é “, Y,” e está na posição V[y]”. Assuma que os elementos informados no vetor
 * são todos diferentes entre si.
 */
public class ExercicioN2_44 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int vetor[];
        int x, y, px, py;

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        vetor = new int[10];
        x = y = px = py = 0;

        // Entrada
        for (int i = 0; i < 10; i++) {
            System.out.printf("Valor do elemento na posição [%d]: ", i);
            vetor[i] = sc.nextInt();

            // Processamento
            if (i == 0) {
                x = y = vetor[i];
                px = py = i;
            } else {
                // menor
                if (vetor[i] < x) {
                    x = vetor[i];
                    px = i;
                }
                // Maior
                if (vetor[i] > y) {
                    y = vetor[i];
                    py = i;
                }
            }
        }

        // Saída
        System.out.printf("O menor elemento do vetor é '%d' e sua posição dentro do vetor é: V[%d].\n"
                + "Já o maior elemento é '%d' e está na posição V[%d].\n", x, px, y, py);
    }
}
