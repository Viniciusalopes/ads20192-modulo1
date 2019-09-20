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
 * 21. Faça um programa que leia um tempo total em segundos e expresse-o em
 * horas, minutos e segundos. Ex. 140s = 0h 2m 20s.
 */
public class Exercicio21 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int tempo, horas, minutos, segundos;

        // Entrada
        System.out.println();
        System.out.print("Informe um tempo em segundos: ");
        tempo = sc.nextInt();

        // Processamento
        horas = tempo / 360;
        minutos = (tempo % 360) / 360;
        segundos = ((tempo % 360) % 60) / 60;

        // Saída
        System.out.println();
        System.out.printf("%ds = %dh %dm %ds.\n", tempo, horas, minutos, segundos);
    }
}
