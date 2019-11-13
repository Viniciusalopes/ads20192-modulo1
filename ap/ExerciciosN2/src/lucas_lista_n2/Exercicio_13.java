package lucas_lista_n2;

import java.util.Scanner;
public class Exercicio_13 {
  /*
  13. Solicite um número entre 1 e 5. Se a pessoa digitar um número fora deste intervalo, o
sistema deve escrever “Entrada Inválida” e solicitar o número novamente. Se digitar um
número válido, imprima “Parabéns! O número digitado foi ... “.
  */
  public static void main(String[]args) {
    Scanner entrada = new Scanner (System.in);
      int numero ;
      do{
         //entrada de dados 
         System.out.println("insira um numero , entre 1 a 5 ");
         numero = entrada.nextInt();
         if (numero <= 1 || numero >= 5) ; {
                System.out.println("Entrada Inválida!");
         }
      }while ( numero >= 1 || numero <= 5);
      System.out.println("Parabéns! O número digitado foi ..."+numero); 
  }
  }
  

