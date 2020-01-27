/*
 5. Faça um programa que leia um número indeterminado de números, calcule e mostre a
 soma dos números digitados, a quantidade de números digitados e a média dos números
 digitados.
 */
package exerciciosn2;

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quant, numero, soma = 0, cont = 1, media = 0;
        //entrada da quantidade de numeros 
        System.out.println("favor inserir quantos numeros serao verificados ");
        quant = entrada.nextInt();
        //while que vai repitir a partir da quantidade d e vezes que usuario desejar
        cont = 'a';
        if (cont == 'a') {
            System.out.println("favor digitar um numero");
        }
        while (cont <= quant) {
            System.out.println();
            System.out.println("=======================================================");
            System.out.println("insria o numero ");
            numero = entrada.nextInt();
            soma = numero + numero;
            cont++;
            media = soma/numero;
        }
        System.out.println("a soma dos numeros e "+ soma);
        System.out.println("a media e " + media);
        System.out.println("=======================================================");
        System.out.println();
    }
}
