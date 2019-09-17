/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 17/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 4. Escreva um programa que leia dois números inteiros e imprima a seguinte
 * saída, com os valores calculados, sabendo que o primeiro número informado
 * será o dividendo e o segundo, o divisor: Dividendo = Divisor = Quociente =
 * Resto = Obs. Para obter o resto de uma divisão utilize o operador %.
 */
public class Exercicio4 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int dividendo, divisor, quociente, resto;

        // Entradas
        System.out.print("Digite um número inteiro   : ");
        dividendo = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        divisor = sc.nextInt();

        // Processamento
        quociente = dividendo / divisor;
        resto = dividendo % divisor;

        // Saída
        System.out.printf("Dividendo = %d\n", dividendo);
        System.out.printf("Divisor   = %d\n", divisor);
        System.out.printf("Quociente = %d\n", quociente);
        System.out.printf("Resto     = %d\n", resto);
    }
}
