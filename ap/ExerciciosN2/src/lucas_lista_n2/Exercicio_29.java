/*
 Altere o exercício 23, onde o sistema deverá gerar a tabuada completa de 1 até 10.-+
 */

package lucas_lista_n2;

/**
_e la vamos nos_
 */
import java.util.Scanner;
public class Exercicio_29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int i = 1 ;   
        for ( i = 1; i <=10; i++) {
              System.out.printf("--TABUADA-DE-%d--\n",i);
            for (int j = 0; j <= 10; j++) {
                   
                   System.out.printf("%d X %d = %d\n",i , j , i*j);
               }
        }
    }
}
