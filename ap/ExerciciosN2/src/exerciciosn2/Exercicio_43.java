/*
 43. Faça um programa que preencha um vetor com 10 números inteiros. Calcule e mostre os
 números superiores a 50 e suas respectivas posições. O programa deverá mostrar uma
 mensagem se não existir nenhum número nessa condição.
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * e la vamos nos vetor
 *
 */
public class Exercicio_43 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num[] = new int[10];
        int cont = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Porfavor insira o " + (i + 1) + " numero :");
            num[i] = entrada.nextInt();

        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 50) {
                System.out.println(num[i] + " e maior que 50, na posição " + (i + 1)+"º");
                cont++;
            }
        }
        if (cont <= 1) {
            System.out.println("Não existem numeros maiores que 50");
        
        }

    }
}
