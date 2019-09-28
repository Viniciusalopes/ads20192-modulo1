/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uriestruturacondicional;

import java.util.Scanner;

/**
 *
 * @author vovostudio
 */
public class Ex1040 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[7];

        // Entrada
        notas[0] = sc.nextFloat();
        notas[1] = sc.nextFloat();
        notas[2] = sc.nextFloat();
        notas[3] = sc.nextFloat();

        // Processamento 
        notas[4] = ((notas[0] * 2) + (notas[1] * 3) + (notas[2] * 4) + notas[3]) / 10; // soma dos pesos = 2 + 3 + 4 + 1 = 10

        if (notas[4] >= 7.0) {
            // Saída aprovado
            System.out.printf("Media: %.1f\nAluno aprovado.\n", notas[4]);
        } else if (notas[4] < 5.0) {
            // Saída reprovado
            System.out.printf("Media: %.1f\nAluno reprovado.\n", notas[4]);
        } else if (notas[4] >= 5.0 && notas[4] <= 6.9) {
            // Saída em exame
            System.out.printf("Media: %.1f\nAluno em exame.\n", notas[4]);
            notas[5] = sc.nextFloat();
            notas[6] = (notas[4] + notas[5]) / 2;

            System.out.printf("Nota do exame: %.1f\n", notas[5]);

            if (notas[6] >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", notas[6]);
        }
    }
}
