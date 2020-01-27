/*
 49. Faça um programa que leia um código 
 numérico inteiros e um vetor de 10 posições de
 números reais. Se o código for zero, 
 termine o programa. Se for 1, mostre o vetor na
 ordem direta. Se for 2,
 mostre o vetor na ordem inversa.
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * I
 *
 * @author Computador
 */
public class Exercicio_49 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //vetor do numero
        int[] vetor = new int[10];
        //variavel numero
        int numero;
        //variavel codogo
        int codigo;
        //saida
        String saida = null, opcao;
        // entrada do numero e sua respectiva posiçao
        for (int i = 0; i < 10; i++) {
            System.out.printf("Posiçao %d \n Numero ; ", i);
            vetor[i] = numero = entrada.nextInt();
        }
        //entrada do codigo 
        do {

            System.out.println("\n Ordem Direta [1] -  Ordem Inversa[2]\n");
            System.out.printf("digite o codigo");
            codigo = entrada.nextInt();
            while (codigo != 1 || codigo != 2) {
                System.out.println("Digite um codigo valido");
                break;
            }

            for (int i = 0; i < 10; i++) {
                System.out.printf("\nvetor[] = {");
                if (i == 9) {
                    System.out.printf(" %d}\n", vetor[i]);
                    imprimeVetor(vetor);
                    break;
                }
            }

            for (int i = 0; i >= 10; i--) {
                System.out.printf("\nvetor[] = {");
                if (i == 0) {
                    System.out.printf(" %d}\n", vetor[i]);
                    imprimeVetor(vetor);
                    break;
                }
            }
            entrada.nextLine();
            System.out.println("\n");
            System.out.println("Deseja sair ? se sim digite '0' digite 3 se quiser continuar");
            saida = entrada.nextLine();
        } while (saida.equalsIgnoreCase("0"));
        {

        }

    }

    public static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                //quando completar 2 posiçoes o 
                //resultado ira quebrar em 25
                System.out.println("\n");
            }
            System.out.print(vetor[i] + "   ");
        }
    }
}
