/*
Escreva um programa que receba dois números x e y e calcule xy

. Obs. Não utilize

nenhuma biblioteca matemática, apenas a estrutura de repetição.
 */
package lucas_lista_n2;
import java.util.Scanner;
public class Exercicio_27 {
    public static void main(String[] args) {   
    Scanner entrada = new Scanner (System.in);
    int x , y;
        System.out.println("informe o valor de x ");
        x = entrada.nextInt();
        System.out.println("informe o valor de y ");
        y = entrada.nextInt();
        for ( x = y; x <= y; x++) {
            System.out.printf("%d elevado a %d e = %d",x,y ,x*(y*y));
        }
   } 
}
