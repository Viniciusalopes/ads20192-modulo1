/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uriestruturacondicional;

import java.util.Scanner;

/**
 *
 * @author vovostudio
 */
public class Ex1021 {
    // import java.util.Scanner;

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner entrada = new Scanner(System.in);
        double valor, n100, n50, n20, n10, n5, n2, m1, m50, m25, m10, m5, m01;

        // Entrada
        valor = entrada.nextDouble();

        // Processamento
        n100 = (int) (valor / 100);
        valor -= (n100 * 100);
        n50 = (int) (valor / 50);
        valor -= (n50 * 50);
        n20 = (int) (valor / 20);
        valor -= (n20 * 20);
        n10 = (int) (valor / 10);
        valor -= (n10 * 10);
        n5 = (int) (valor / 5);
        valor -= (n5 * 5);
        n2 = (int) (valor / 2);
        valor -= (n2 * 2);
        m1 = (int) (valor / 1);

        // Centavos
        valor = (valor - m1) * 100;
        m50 = (int) (valor / 50);
        valor -= (m50 * 50);
        m25 = (int) (valor / 25);
        valor -= (m25 * 25);
        m10 = (int) (valor / 10);
        valor -= (m10 * 10);
        m5 = (int) (valor / 5);
        m01 = (int) (valor - (m5 * 5));

        // Saída
        System.out.printf("NOTAS:\n");
        System.out.printf("%.0f nota(s) de R$ 100.00\n", n100);
        System.out.printf("%.0f nota(s) de R$ 50.00\n", n50);
        System.out.printf("%.0f nota(s) de R$ 20.00\n", n20);
        System.out.printf("%.0f nota(s) de R$ 10.00\n", n10);
        System.out.printf("%.0f nota(s) de R$ 5.00\n", n5);
        System.out.printf("%.0f nota(s) de R$ 2.00\n", n2);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%.0f moeda(s) de R$ 1.00\n", m1);
        System.out.printf("%.0f moeda(s) de R$ 0.50\n", m50);
        System.out.printf("%.0f moeda(s) de R$ 0.25\n", m25);
        System.out.printf("%.0f moeda(s) de R$ 0.10\n", m10);
        System.out.printf("%.0f moeda(s) de R$ 0.05\n", m5);
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", m01);

    }
}
