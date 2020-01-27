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
public class Ex1012 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
        // Entrada
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        // Processamento
        triangulo = (a * c) / 2;
        circulo = pi * Math.pow(c, 2);
        trapezio = ((a + b) * c) / 2;
        quadrado = b * b;
        retangulo = a * b;

        // Saída
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
}
