/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author vovomint
 */
public class Ex1018 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        int n100, n50, n20, n10, n5, n2, n1, valor;
        float saldo;

        // Entrada
        valor = (int) sc.nextFloat();

        // Processamento
        saldo = valor;
        n100 = (int) (saldo / 100);
        saldo %= 100;
        n50 = (int) (saldo / 50);
        saldo %= 50;
        n20 = (int) (saldo / 20);
        saldo %= 20;
        n10 = (int) (saldo / 10);
        saldo %= 10;
        n5 = (int) (saldo / 5);
        saldo %= 5;
        n2 = (int) (saldo / 2);
        saldo %= 2;
        n1 = (int) (saldo / 1);
        saldo %= 1;

        // Saida
        System.out.println(valor);
        System.out.printf("%d nota(s) de R$ 100,00\n", n100);
        System.out.printf("%d nota(s) de R$ 50,00\n", n50);
        System.out.printf("%d nota(s) de R$ 20,00\n", n20);
        System.out.printf("%d nota(s) de R$ 10,00\n", n10);
        System.out.printf("%d nota(s) de R$ 5,00\n", n5);
        System.out.printf("%d nota(s) de R$ 2,00\n", n2);
        System.out.printf("%d nota(s) de R$ 1,00\n", n1);
    }
}
