/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uriestruturacondicional;

import java.util.Scanner;

/**
 *
 * @author vovostudio Intervalos [0,25], (25,50], (50,75], (75,100]
 */
public class Ex1037 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        String intervalo = "";
        double valor;

        // Entrada
        valor = sc.nextDouble();

        // Processamento
        if (valor < 0.0 || valor > 100.0) {
            intervalo = "Fora de intervalo";
        } else if (valor <= 25.0) {
            intervalo = "Intervalo [0,25]";
        } else if (valor <= 50.0) {
            intervalo = "Intervalo (25,50]";
        } else if (valor > 75.0) {
            intervalo = "Intervalo (75,100]";
        }

        // Saída
        System.out.println(intervalo);
    }
}
