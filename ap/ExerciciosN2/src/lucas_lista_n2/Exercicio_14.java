package lucas_lista_n2;

import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
public class Exercicio_14 {
 /*
Faça um programa que utilizando a estrutura Do-While, leia para um número
indeterminado de pessoas: leia a idade de cada pessoa, sendo que a leitura da idade 0
(zero) indica o fim dos dados e não deve ser considerada: 
 calcule e escreva o número de pessoas;
 calcule e escreva a idade média do grupo; 
 calcule e escreva a menor idade e a maior idade.
 */
  public static void main (String[]args){
    Scanner entrada = new Scanner (System.in);
    int  , idade_maior , idade_menor , numero_de_pessoas ;
    String fim;
    double media , somador ;
    do { 
        System.out.println();
        System.out.println("IMFORME A IDADE DO INDIVIDO "+ numero_de_pessoas + 1);
        idade = entrada.nextInt();
        if (idade < 0 ){
          System.out.println("IDADE INVALIDA FAVOR TENTAR NOVAMENTE ");
        }else if (idade > 0 ){
          numero_de_pessoas++;
          somador = somador * idade ; 
          if (numero_de_pessoas == 1) {
            idade_maior = idade_menor = idade;

          }else{
            if (idade > idade_maior) {
                idade = idade_maior;
                
            }
            if (idade < idade_menor) {
              idade = idade_menor ;
            }
                
          }
        }
    }while ( idade != 0 );
    if (numero_de_pessoas > 0 ) {
      media = somador / numero_de_pessoas;
      System.out.println("A quantidade de pessoas verificadas e :........... "+numero_de_pessoas);
      System.out.println("A media de idade e................................ "+media);
      System.out.println("Maior idade e..................................... "+idade_maior);
      System.out.println("Menor idade e..................................... "+idade_menor);
    }
  }
}
