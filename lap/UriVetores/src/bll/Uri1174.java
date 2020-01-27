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
public class Uri1174 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        double[] A = new double[100];
        String saida = "";

        // Entrada
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextDouble();

            // Processamento
            if (A[i] <= 10.0) {
                saida += String.format("A[%d] = %.1f\n", i, A[i]);
            }
        }

        // Saída
        System.out.print(saida);
    }
}
