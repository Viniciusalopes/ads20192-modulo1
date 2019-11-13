/*
 Faça um programa que leia uma senha (número inteiro). Em seguida, pergunte ao
 usuário a senha informada, caso a senha esteja errada imprima “Senha incorreta, tente
 novamente” e leia novamente a senha. Caso o usuário digite a senha correta, imprima
 “Senha correta! Bem-vindo ao sistema”.
 */
package lucas_lista_n2;

import java.util.Scanner;

public class Exercicio_18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //entrada e dados 
        //variaveis

        int senha = 0;
        do {
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("SISTEMA SECRETO");
            System.out.println("informe a senha");
            try {
                senha = Integer.parseInt(entrada.nextLine());
                
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite apenas números!");
            }
/* try   VEFICAÇAO SE E LETRA
{
                senha = Integer.parseInt(entrada.nextLine());
                
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite apenas números!");
            }
  */
  if (senha == 1234) {
                System.out.println("Senha correta! Bem-vindo ao sistema");
                System.out.println("-------------------------------------");
            } else {
                System.out.println("Senha incorreta, tente novamente");
                System.out.println("-------------------------------------");
            }
        } while (senha != 1234);

    }
}
