/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 13/11/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 39, Faça um programa que leia um numero inteiro N e mostre todos os números primos
 * entre 1 e N. Número primo é aquele que é divisível apenas por 1 e ele mesmo. Ex. 17 é
 * um número primo, pois só é divisível por 1 e por ele mesmo.
 */
public class ExercicioN2_39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        int num = 0;
        int divisores;
        boolean invalido = true;
        String primos = "";

        do {
            System.out.print("\nDigite um número inteiro positivo > ");
            entrada = sc.nextLine();

            if (ExercicioN2_52.inteiro_valido(entrada)) {
                num = Integer.parseInt(entrada);
                if (num > 0) {
                    invalido = false;
                }

            }
            if (invalido) {
                System.out.println("Número inválido. Tente outra vez...");
            }

        } while (invalido);

        for (int i = 1; i <= num; i++) {
            divisores = 1;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                primos += i + ", ";
            }
        }

//        do {
//            divisores = 1;
//            for (int j = 2; j <= i; j++) {
//                if (i % j == 0) {
//                    divisores++;
//                }
//            }
//            if (divisores == 2) {
//                primos += i + ", ";
//            }
//            i++;
//
//        } while (i <= num);
        primos = primos.substring(0, primos.length() - 2);
        System.out.printf("Numeros primos entre 1 e %s são: %s\n", entrada, primos);
    }
}
