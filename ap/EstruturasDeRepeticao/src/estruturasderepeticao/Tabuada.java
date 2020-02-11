/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasderepeticao;

import java.util.Scanner;

/**
 *
 * @author vovostudio
 */
public class Tabuada {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        int n, c;
        c = 1; // Inicialização

        // Entrada
        System.out.println();
        System.out.print("Digite um número: ");
        n = sc.nextInt();

        // Processamento e Saída
        while (c <= 10) { // Condição de parada
            System.out.printf("%d X %d = %d\n", n, c, n * c);
            c++; // Incremento
        }
    }
}
