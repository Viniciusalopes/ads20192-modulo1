/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 20/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 15. Faça um algoritmo que leia x e y e resolva a equação abaixo:
 */
// Eq = 2 . √3x + 30
//          -------- + (y − 32)⁴ 
//             3
//
public class Exercicio15 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int x, y;
        double eq;

        // Entrada
        System.out.print("Digite o valor de x: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de x: ");
        y = sc.nextInt();

        // Processamento
        eq = (2 * (((Math.sqrt(3 * x)) + 30) / 3)) + Math.pow((y - 32), 4);

        // Saída
        System.out.println();
        System.out.print("          _______");
        System.out.print("Eq = 2 . √3x + 30\n"
                + "         -------- + (y − 32)⁴\n"
                + "            3\n");
        System.out.println();

        System.out.printf("Resultado da equação: %.2f\n", eq);
    }
}
