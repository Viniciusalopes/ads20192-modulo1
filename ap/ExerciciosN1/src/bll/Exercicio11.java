/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 19/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 11. Faça um algoritmo que recebe o raio de uma esfera e calcula o seu volume
 * (v = 4/3.P .R³ ), e a área (a = P.R²).
 */
public class Exercicio11 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double raio, volume, area;

        // Entrada
        System.out.println();
        System.out.print("Raio da esfera....: ");
        raio = sc.nextDouble();

        // Processamento
        volume = (4 * Math.PI * (Math.pow(raio, 3))) / 3;
        area = Math.PI * (Math.pow(raio, 2));

        // Saída
        System.out.println();
        System.out.printf("Volume da esfera..: %.2f\n", volume);
        System.out.printf("Área da esfera....: %.2f\n", area);
    }

}
