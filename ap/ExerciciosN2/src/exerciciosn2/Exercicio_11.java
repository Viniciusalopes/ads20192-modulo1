/*
 Escreva um programa que leia uma quantidade inteira N e, em seguida, leia N valores
 double. Calcule e informe a média dos N valores lidos.
 */
package exerciciosn2;

import java.util.Scanner;

public class Exercicio_11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int  num_inteiro ;
        double num_double , media;

        System.out.println("INSIRA UM NUMERO INTEIRO");
        num_inteiro = entrada.nextInt();
        System.out.println("INSIRA UM NUMERO REAL (DOUBLE)");
        num_double = entrada.nextDouble();
        media = (num_inteiro + num_double )/ 2;
      
       
        System.out.println("A MEDIA DOS NUMEROS FORNECIDOS É " + media);

    }
}
