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
public class Ex1017 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int tempo, velocidade;
        double distancia, litros;

        // Entrada
        tempo = sc.nextInt();
        velocidade = sc.nextInt();

        // Processamento
        distancia = tempo * velocidade;
        litros = distancia / 12;

        // Saída
        System.out.printf("%.3f\n", litros);
    }
}
