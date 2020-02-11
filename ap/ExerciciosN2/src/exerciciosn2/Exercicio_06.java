/*
 Escreva um programa que calcule o fatorial de um número inteiro N fornecido pelo
 usuário. Cuidado com valores inválidos!
 */
//FORMULA DO FATORIAL , n! = n . (n – 1) . (n – 2) . (n – 3)!
package exerciciosn2;

import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int f = 1, num = -1, mult = - 1;
       

        
            while (mult < 0) {
                System.out.println();
                System.out.println("========================================");
                System.out.println("digite o numero inteiro ");
                mult = entrada.nextInt();
                if (mult < 0) {
                    System.out.println("========================================");
                    System.out.println("numero invalido");
                    System.out.println("favor tentar novamente");
                   
                }
            }
                while (mult >= 1) {
                     f = (f * mult); 
                    
                    mult--;
                    
                }
                System.out.println("O valor do fatorial e :" + f);
                System.out.println("========================================");
                System.out.println();

            
        
        }
    }


