/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import java.util.Scanner;

/**
 * 27. Escreva um programa que leia três valores inteiros distintos (assuma que
 * o usuário digitará valores diferentes entre si) e os armazene nas variáveis
 * A, B e C. Em seguida, descubra o menor valor e o armazene em uma variável
 * denominada MENOR; o maior valor, coloque-o na variável MAIOR e o valor
 * intermediário, na variável INTER. Imprima os valores em ordem crescente, ou
 * seja, imprima as variáveis MENOR, INTER e MAIOR, nessa ordem.
 */
public class Exercicio27 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        int a, b, c, menor, maior, inter;
        String msg = "";
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o primeiro número inteiro: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        b = sc.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        c = sc.nextInt();

        // Processamento
        if (a == b && a == c) {
            System.out.printf("Você digitou o mesmo número (%d) três vezes.", a);
        } else {
            // Menor
            if (a < b && a < c) {
                menor = a;
            } else if (b < a && b < c) {
                menor = b;
            } else {
                menor = c;
            }

            // Maior
            if (a > b && a > c) {
                maior = a;
            } else if (b > a && b > c) {
                maior = b;
            } else {
                maior = c;
            }

            // Intermediário
            if (a > menor && a < maior) {
                inter = a;
            } else if (b > menor && b < maior) {
                inter = b;
            } else {
                inter = c;
            }

            if (inter == menor || inter == maior) {
                System.out.printf("O MENOR número é [%d] e MAIOR número é [%d].\n",
                        menor, maior);
            } else {
                System.out.printf(
                        "O MENOR número é [%d], o número INTERMEDIÁRIO é [%d] e o MAIOR número é [%d].\n",
                        menor, inter, maior);
            }
        }
    }
}
