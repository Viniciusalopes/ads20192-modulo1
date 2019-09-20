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
 * 16. Construa um algoritmo que, tendo como dados de entrada dois pontos
 * quaisquer no plano, P(x1,y1) e P(x2,y2), escreva a distância entre eles. A
 * fórmula que efetua tal cálculo é:
 */
//       ___________________
//  d = √(x2-x1)² + (y2-y1)²
//
public class Exercicio16 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2, d;

        // Entrada
        System.out.println();
        System.out.print("Coordenada 'x1': ");
        x1 = sc.nextDouble();

        System.out.print("Coordenada 'x2': ");
        x2 = sc.nextDouble();

        System.out.print("Coordenada 'y1': ");
        y1 = sc.nextDouble();

        System.out.print("Coordenada 'y2': ");
        y2 = sc.nextDouble();

        // Processamento
        d = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));

        // Saída
        System.out.println();
        System.out.printf("A distância entre os dois pontos é %.2f\n", d);
    }
}
