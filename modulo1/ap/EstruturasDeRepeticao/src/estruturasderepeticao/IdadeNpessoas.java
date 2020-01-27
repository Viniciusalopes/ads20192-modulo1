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
public class IdadeNpessoas {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        double soma, media;
        soma = 0;

        // Entrada
        System.out.println();

        while (cont < 10) {
            cont++;
            System.out.printf("Informe a idade da pessoa %d: ", cont);
            soma += sc.nextDouble();
        }

        // Processamento
        media = soma / cont;

        // Saída
        System.out.println();
        System.out.printf("Média das idades: %.2f\n", media);
    }
}
