/*
Faça um programa que leia dois números inteiros, o primeiro é o valor inicial de um
contador, e o segundo é o valor final do contador (testar se o valor inicial fornecido é
inferior ao valor final). Usando o comando While, escreva na tela uma contagem que
comece no primeiro número lido, escreva os números seguintes colocando sempre
apenas um número em cada nova linha da tela, e terminando a contagem quando chegar
ao valor final indicado.
 */

package lucas_lista_n2;
import java.util.Scanner;
public class Exercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int  num , cont_1 = 0, cont_2 = 0 ;
            //entrada de dados 
        System.out.println();
        System.out.println("Informe o primeiro valor : ");
        cont_1 = entrada.nextInt();
        System.out.println("Informe o segundo valor : ");
        cont_2 = entrada.nextInt();
       //processamento de dados
        while(cont_1 >= cont_2){
            cont_1++;
        }  
           while(cont_1 <= cont_2){ 
            if (cont_1 <= cont_2) {
                
                System.out.println("o valor inicial tem que ser inferior ao menor ");
            }
            else{
                System.out.println("valor valido");
            }
           }
            
    
    }
}