/*
 Faça um programa que leia um número entre 1 e 10 (deve ser validado) e exiba a
 tabuada deste número.
 */
package lucas_lista_n2;

import java.util.Scanner;

public class Exercicio_25 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 0, j = 0;
       
        
            System.out.println("INSIRA UM NUMERO ENTRE 1 E 10");
            i = entrada.nextInt();
       
            for (j = 1; j <= 10; j++) {
                System.out.printf("%d X %d = %d\n", i, j, i * j);
            }

        }

    }

