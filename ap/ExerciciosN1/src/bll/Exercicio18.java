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
 * 18. Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
 * valores de modo que a variável A passe a possuir o valor da variável B, e a
 * variável B passe a possuir o valor da variável A. Apresentar os valores
 * trocados.
 */
public class Exercicio18 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int a, b, tmp;

        // Entrada
        System.out.println();
        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();

        // Processamento
        tmp = a;
        a = b;
        b = tmp;

        // Saída
        System.out.println();
        System.out.printf("O valor de A agora é %d, e o valor de B agora é %d.\n", a, b);
    }
}
