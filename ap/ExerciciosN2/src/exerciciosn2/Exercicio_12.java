package exerciciosn2;

import java.util.Scanner;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/*
12. Faça um programa que leia dois números inteiros positivos (n1 e n2). Repita a leitura
até que n1 seja menor que n2, quando n2 for maior que n1, imprima os números entre
n1 e n2.
 */
public class Exercicio_12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //dando sentido a variavel 
        int numero_1, numero_2, cont;
        // iniciando as variaveis 
        numero_1 = numero_2 = 0; //entrada de dados 
        while (numero_1 >= numero_2) {
            while (numero_1 <= 0) {
                System.out.println("Porfavor insira o primeiro numero ");
                numero_1 = entrada.nextInt();
                if (numero_1 == 0) {
                    System.out.println("o numero 0 nao ten vaor");
                } else if (numero_1 < 0) {
                    System.out.println("o numero precisa ser positivo");
                }
            }
            while (numero_2 <= 0) {
                System.out.println(" digite o segundo numero ,\n( e preciso que seja maior que o primeiro valor) ");
                numero_2 = entrada.nextInt();
                if (numero_2 == 0) {
                    System.out.println("o numero 0 nao ten vaor");
                } else if (numero_2 < 0) {
                    System.out.println("o numero precisa ser positivo");
                }
            }
            if (numero_1 >= numero_2) {
                System.out.println("O numero precisa ser maior queo primeiro");

            }
        }
        //saida dos resultados
        if (numero_1 - numero_2 == 1) {
            System.out.println("Nao existe numero iinteiro entre esses " + numero_1 + " e " + numero_2);
        } else {
            System.out.println("os numeros inteiros entre " + numero_1 + " e " + numero_2 + "sao :");
            cont = numero_1 + 1;
            while (cont < numero_2) {
                System.out.println(cont + " ");
                cont++;
                if (cont % 15 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
