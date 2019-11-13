/*
Escreva um programa que receba vários números inteiros 
informados pelo usuário enquanto os mesmos forem positivos. 
Imprimir quantos números foram digitados.
 */
package exerciciosn2;
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //transformandi uma variavel inteira em double
        int num = 0 , cont = 1;
        do {
            System.out.println("insira o numero ");
            num = entrada.nextInt();
            
            System.out.println("a quantidade de numeros e "+cont);
            cont++;
            
        } while(num >= 0); 
        System.out.println("o numero nao e positivo");
        System.out.println("fim da execuçao do programa");
    }
    
}
