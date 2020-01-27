/*
24. Faça um programa que leia um intervalo (num_inicial e num_final) e calcule o
somatório de todos os números entre o num_inicial e num_final.
 */

package exerciciosn2;
import java.util.Scanner;
public class Exercicio_24 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num_inicial , num_final,intervalo = 0,i , soma = 0;
        System.out.println("Imforme o numero inicial");
        num_inicial = entrada.nextInt();
        
        System.out.println("Imforme o numero final");
        num_final = entrada.nextInt();
        for ( i = num_inicial; i < num_final; i++) {
            soma += i ;
            System.out.println(soma);
        
            
        }

    }
}
