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
 * 11. Escreva um programa que leia uma quantidade inteira N e, em seguida, leia N valores
 * double. Calcule e informe a média dos N valores lidos.
 */
public class ExercicioN2_11 {

    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int cont = 0, quantidade;
        double n, soma = 0, media;

        // Entrada
        System.out.println();
        System.out.print("Informe a quantidade de números que vai digitar: ");
        quantidade = sc.nextInt();

        if (quantidade == 0) {
            System.out.println("Ok. =|");
        } else {
            while (cont < quantidade) {
                System.out.printf("Digite o %dº número decimal: ", cont + 1);
                n = sc.nextDouble();
                soma += n;
                cont++;
            }
            // Processamento
            media = soma / quantidade;

            // Saída
            System.out.println();
            System.out.printf("Média do(s) %d valor(es) informado(s): %.3f\n", quantidade, media);
        }
    }
}
