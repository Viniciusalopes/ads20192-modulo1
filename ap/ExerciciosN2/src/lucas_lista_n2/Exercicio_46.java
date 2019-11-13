/*
 Escreva um programa que armazene os 100 primeiros números pares em um vetor, e os
 200 primeiros números ímpares em outro vetor. Imprima os dois vetores em seguida.
 */
package lucas_lista_n2;


import java.util.Scanner;

public class Exercicio_46 {

    public static void main(String[] args) {
        //Scanner 
        Scanner entrada = new Scanner(System.in);
        //vetor par 
        int[] vetor_par = new int[100];
        //vetor impar
        int[] vetor_impar = new int[200];
        //cantdor de posiçoes pares
        int cont_par ;
        ///contador de pociçes impares
        int cont_impar;
        //inicialiando contadores
        cont_par = cont_impar = 0;
        //;100 pares e 100 impares
        for (int i = 0; i < 400; i++) {
            
            //verificaçao de numero par
            if (i % 2 == 0) {
                if (i < 200) {
                    //condiçao para parar quando numero chagar a 100
                vetor_par[cont_par] = i;
                cont_par++;
                }
            }else{
                //todos os nymeros impares entre 400 
                vetor_impar[cont_impar] = i;
                cont_impar++;
            }
        }
        //saida de dados que vai utilizar o metodo imprime vetor
          System.out.println("os valores de par sao :");
          imprimeVetor(vetor_par);
          System.out.println();
          System.out.println("\nos valores imapres sao :");
          imprimeVetor(vetor_impar);
        

    }

   
    public static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 25 ==0) {
                //quando completar 25 posiçoes o resultado ira quebrar em 25
                System.out.println("\n");
            }
            System.out.print(vetor[i] + "   ");
        }
    }

}
