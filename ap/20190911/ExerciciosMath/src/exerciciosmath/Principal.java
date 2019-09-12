/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosmath;

import java.util.Scanner;

/**
 *
 * @author vovostudio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        // Variáveis
        double cateto1, cateto2, hipotenusa;
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o valor do cateto 1: ");
        cateto1 = sc.nextDouble();
        System.out.print("Digite o valor do cateto 2: ");
        cateto2 = sc.nextDouble();

        // Processamento
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2.0) + Math.pow(cateto2, 2.0));
        
        // Saída
        System.out.printf("A hipotenusa de um triângulo com essas medidas é: %.2f\n.", hipotenusa);

    }
}
