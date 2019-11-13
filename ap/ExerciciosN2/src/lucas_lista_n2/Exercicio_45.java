/*
 Escreva um programa que receba quinze números inteiros e armazene em um vetor a
 raiz quadrada de cada número. Caso o valor digitado seja menor do que zero, o número
 -1 deve ser atribuído ao elemento do vetor. Após isso, imprima todos os valores
 armazenados.
 */
package lucas_lista_n2;

import java.util.Scanner;

/**
 * e la vamos nos
 */
public class Exercicio_45 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double vetor_R[] = new double[15];
        int num;
        System.out.println();
        for (int i = 0; i < 15; i++) {
            System.out.printf("Por favor insira o %d numero ", i);
            num = entrada.nextInt();
            if (num < 0) {
                vetor_R[i] = -1;
            } else {
                vetor_R[i] = Math.sqrt(num);
            }

        }
        System.out.printf("= \n ");
        for (int i = 0; i < vetor_R.length; i++) {
            if (i == 14) {
                System.out.printf("\n{ %.1f }\n" , vetor_R[i]);
            }else{
                System.out.printf("\n{ %.1f }\n" , vetor_R[i]);
            }
            
        }
    }
}
