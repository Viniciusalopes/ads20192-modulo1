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
 * 23. Escreva um programa que leia um valor de hora e informe quantos minutos
 * se passaram desde o início do dia.
 */
public class Exercicio23 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int horas, minutos;

        // Entrada
        System.out.println();
        System.out.print("Hora atual (sem os minutos): ");
        horas = sc.nextInt();

        // Processamento
        minutos = horas * 60;

        // Saída
        System.out.println();
        System.out.printf("Passaram-se %d minutos desde o início do dia.\n", minutos);
    }
}
