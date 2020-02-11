/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import java.util.Scanner;

/**
 *
 * @author vovostudio
 */
public class Uri1176 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        int t;
        int n;

        long [] fib = new long[61];
        fib[0] = 0;
        fib[1] = 1;
        String saida = "";

        // Números da Seq.Fibonacci até o 61º (posição 60 no vetor)
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Entrada
        t = sc.nextInt();

        // Processamento
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            saida += String.format("Fib(%d) = %d\n", n, fib[n]);
        }

        System.out.print(saida);
    }
}
