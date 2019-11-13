/*
 Escreva um programa que leia uma quantidade de números (para teste use 10)
 calculando e imprimindo o maior, o menor e a média entre os números.
 */
package lucas_lista_n2;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont = 0, quant = 10, menor = 0, maior = 0;
        double soma = 0, media;
        while (cont <= quant) { //bendito while que vois clamo
            System.out.println();
            System.out.println("=======================================");
            System.out.printf("Insira o numero a ser analisado \n", cont);
            numero = entrada.nextInt();
            //entrada
            //processamento
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
            else if (numero != numero){
                System.out.println("insira um numero valido");
            }
            soma += (double) numero;
            cont++;

            media = (soma / quant);
            //sdida
            System.out.println("o menor numero e \n" + menor);
            System.out.println("o maior numero e \n" + maior);
            System.out.println("a media e \n" + soma);
            System.out.println("=======================================");
            System.out.println();
        }
    }
}
