/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uriestruturacondicional2;

import java.util.Scanner;

/**
 *
 * @author vovoubuntu
 */
public class Uri1043 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        double a, b, c, perimetro, area;
        // Inicialização de variáveis
        sc = new Scanner(System.in);

        // Entrada
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        // Processamento
        if ((a < (b + c)) && (b < (a + c)) && (c < (b + a))) {  // Medidas formam um triângulo
            perimetro = a + b + c;
            // Saída perímetro
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {    // Medidas formam um trapézio
            // Saída área
            area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}
