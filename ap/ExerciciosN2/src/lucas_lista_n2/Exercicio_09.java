/*
Escreva um programa que mostre na 
tela os números inteiros de 1 a 300, em ordem
crescente. 
Em seguida imprima os números em ordem decrescente.
 */
package lucas_lista_n2;
import java.util.Scanner;
public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0 , cont = 0 ;
        
        while (cont <=300) {
            System.out.println(num);
            num=num + 1;
            cont++;
        }
                    
        }
    }

