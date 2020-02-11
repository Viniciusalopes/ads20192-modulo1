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
public class Uri1175 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        int tamanho = 20;
        int[] n = new int[20];
        int aux;

        // Entrada
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        // Processamento
        tamanho--;
        for (int i = 0; i < n.length / 2; i++) {
            aux = n[i];
            n[i] = n[tamanho];
            n[tamanho] = aux;
            tamanho--;
        }

        // Saída
        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }
    }
}
