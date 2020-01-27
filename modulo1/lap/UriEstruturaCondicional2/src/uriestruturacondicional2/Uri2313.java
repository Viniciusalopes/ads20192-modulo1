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
public class Uri2313 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int a, b, c, x;
        String saida = "Invalido";

        // Inicialização de variáveis
        sc = new Scanner(System.in);

        // Entrada
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // Maior valor em a
        if(a < b){
            // Inverte se b for maior que a
            x = a;
            a = b;
            b = x;
        }
        
        if(a < c){
            // Inverte se c for maior que a
            x = a;
            a = c;
            c = x;
        }
        
        // Processamento
        if ((a < (b + c)) && (b < (a + c)) && (c < (b + a))) {  // Medidas formam um triângulo
            saida = "Valido-";

            if (a == b && b == c) {
                saida += "Equilatero";
            } else if ((a == b && b != c) || (a == c && b != c) || (b == c && a != c)) {
                saida += "Isoceles";
            } else if (a != b && b != c && a != c) {
                saida += "Escaleno";
            }

            // Acrescenta à saida
            saida += "\nRetangulo: ";

            // Teorema de Pitágoras
            saida += (a * a == b * b + c * c) ? "S" : "N";
        }

        // Saida
        System.out.println(saida);
    }

}
