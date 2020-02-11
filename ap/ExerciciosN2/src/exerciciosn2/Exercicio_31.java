/*
 Faça um programa que verifique se determinado número X é primo. Obs. Um número é
 considerado primo se for divisível apenas por 1 e por ele mesmo.
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * o nois outra vez
 */
public class Exercicio_31 {

    public static void main(String[] args) {
        //Scanner
        Scanner entrada = new Scanner(System.in);
        //variaveis
        int n = 0, divi;
        String saida;
        //inicializanod variaveis 
        divi = 1; //por 1 e por ele mesmo.
        System.out.println("DIGITE O NUMERO SER VERIFICADO:");
        try {
            n = Integer.parseInt(entrada.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite apenas números!");
        }
        //processamento 
        saida = String.format("o numero %d ", n);
        for (int i = 2; i <= n; i++) {
            if (n % 1 == 0) {
                divi++;
            }
        }
       //verificanod se o numero e primo 
        if (divi == 2) {
            saida += " e ";
        }else{
            saida += " nao e ";
        }
        saida += " um numero primo";
        
        //saida
        System.out.println(saida);
    }
}
