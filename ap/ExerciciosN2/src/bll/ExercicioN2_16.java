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

/*
 * 16. Escreva um programa que receba vários números inteiros, calcule e mostre: 
    a) a soma dos números digitados;
    b) a quantidade de números digitados;
    c) a média dos números digitados;
    d) o maior número digitado;
    e) o menor número digitado;
    f) a média dos números pares; 
    g) a percentagem dos números ímpares entre todos os números digitados.
 
    Finalize a entrada de dados com a digitação do número 0.
 */
public class ExercicioN2_16 {

    public static void main(String[] args) {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        int numero,
                soma = 0,
                cont = 0,
                maior = -2147483648,
                menor = 2147483647,
                pares = 0,
                soma_pares = 0,
                impares = 0;

        double media = 0,
                media_pares = 0,
                percentual_impares = 0;

        // Entrada
        System.out.println();
        do {
            System.out.print("Digite um número inteiro positivo (0-Sair): ");
            numero = sc.nextInt();

            // Processamento
            if (numero < 0) {
                System.out.println("Números negativos não são válidos!\n");
            } else if (numero > 0) {
                // a) a soma dos números digitados;
                soma += numero;

                // b) a quantidade de números digitados;
                cont++;

                // d) o maior número digitado;
                if (numero > maior) {
                    maior = numero;
                }

                // e) o menor número digitado;
                if (numero < menor) {
                    menor = numero;
                }

                if (numero % 2 == 0) {
                    pares++;
                    soma_pares += numero;
                } else {
                    impares++;
                }
            }
        } while (numero != 0);

        // c) a média dos números digitados;
        if (cont > 0) {
            media = (double)soma / (double)cont;

            // f) a média dos números pares; 
            if (pares > 0) {
                media_pares = soma_pares / pares;
            }

            // g) a percentagem dos números ímpares entre todos os números digitados.
            percentual_impares = ((double)impares / ((double)pares + (double)impares)) * 100;
        } else {
            maior = menor = 0;
        }

        // Saída
        System.out.println();
        System.out.printf("Soma dos números digitados . . : %d\n", soma);
        System.out.printf("Quantidade de números digitados: %d  (negativos não contam)\n", cont);
        System.out.printf("Média dos números digitados. . : %.2f\n", media);
        System.out.printf("Maior número digitado. . . . . : %d\n", maior);
        System.out.printf("Menor número digitado. . . . . : %d\n", menor);
        System.out.printf("Média dos números pares. . . . : %.2f\n", media_pares);
        System.out.printf("Percentagem dos números ímpares: %.2f\n", percentual_impares);
    }
}
