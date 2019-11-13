/*
 47. Faça um programa que leia dois vetores de 10 elementos inteiros cada um e mostre o
 vetor resultante da intercalação desses dois vetores.
 Exemplo: Vetor 1 [0 5 4 2 1 5 3 2 5 9]
 Vetor 2 [1 5 4 2 0 5 3 2 5 9]
 Vetor resultante da intercalação [0 1 5 5 4 4 2 2 1 0 5 5 3 3 2 2 5 5 9 9]
 */
package lucas_lista_n2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_47 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //controladores de vetor
        int controlador_vetor1, controlador_vetor2;
        //inicializando controladores
        controlador_vetor1 = controlador_vetor2 = 0;
        //primeiro vetor

        int[] vetor1 = new int[10];
        //segundo vetor
        int[] vetor2 = new int[10];
        //vetor esultante da intercalação desses dois vetores.
        int[] interelacao = new int[vetor1.length + vetor2.length];
        //prenchendo vetor 1
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println();
            System.out.printf("insira o valor do primeiro vetor [%d]", i);
            vetor1[i] = entrada.nextInt();
            vetor1[i] = sorteia(1, 100);

        }
        //preenchendo vetor 2
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println();
            System.out.printf("insira o valor do segundo vetor [%d]", i);
            vetor2[i] = entrada.nextInt();
            vetor2[i] = sorteia(1, 100);

        }
        //prenchendo  o  resultante da intercalação
        for (int i = 0; i < interelacao.length; i++) {
            //condiçao se ele vai ser oar ou impar
            if (i % 2 == 0) {
                interelacao[i] = vetor1[controlador_vetor1];
                //icremento vetor 1
                controlador_vetor1++;

            } else {
                interelacao[i] = vetor2[controlador_vetor2];
                //icremento vetor 2
                controlador_vetor2++;
            }

        }
        //saida do primeiro vetor
        System.out.println("vetor 1 :");
        imprimeVetor(vetor1);
        System.out.println();
        //saida do segundo vetor
        System.out.println("\n\nvetor 2 :");
        imprimeVetor(vetor2);
        System.out.println();
        //resultante da intercalação
        System.out.println("\n\ninterelaçao :");
        imprimeVetor(interelacao);
        System.out.println();

    }

    public static int sorteia(int limiteInferior, int limiteSuperior) {
        Random rd = new Random();
        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }

    public static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 5 == 0) {
                //quando completar 5 posiçoes o resultado ira quebrar em 25
                System.out.println("\n");
            }
            System.out.print(vetor[i] + "   ");
        }
    }

}
