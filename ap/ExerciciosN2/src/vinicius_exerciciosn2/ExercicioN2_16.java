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
        // Declaração de Variáveis
        Scanner sc;
        int numero, maior, menor, soma, cont, pares, soma_pares, impares;
        double media, media_pares, percentual_impares;

        // Inicialização
        sc = new Scanner(System.in);
        maior = menor = soma = cont = pares = soma_pares = impares = 0;
        media = media_pares = percentual_impares = 0;

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
                if (cont == 1) {
                    maior = menor = numero;
                } else {
                    if (numero > maior) {
                        maior = numero;
                    }

                    // e) o menor número digitado;
                    if (numero < menor) {
                        menor = numero;
                    }
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
            media = (double) soma / (double) cont;

            // f) a média dos números pares; 
            if (pares > 0) {
                media_pares = soma_pares / pares;
            }

            // g) a percentagem dos números ímpares entre todos os números digitados.
            percentual_impares = ((double) impares / ((double) pares + (double) impares)) * 100;
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
