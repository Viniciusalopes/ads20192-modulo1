/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 06/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 25. Faça um programa que leia um número entre 1 e 10 (deve ser validado) e exiba a
 * tabuada deste número.
 */
public class ExercicioN2_25 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int numero;

        // Inicialização de variáveis
        sc = new Scanner(System.in);

        // Entrada
        do {
            System.out.print("Digite um número de 1 até 10: ");
            numero = sc.nextInt();
            if (numero < 1 || numero > 10) {
                System.out.println("Número inválido! Tente outra vez...");
            }
        } while (numero < 1 || numero > 10); // Há controvérsias, mas eu entendi :) "um número entre 1 e 10"

        System.out.println("Tabuada:\n");
        imprime_tabuada(numero);
    }

    public static void imprime_tabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d  x%s%d = %d\n", numero, ((i < 10) ? "  " : " "), i, (numero * i));
        }
    }
}
