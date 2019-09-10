package aula_ads1;

import java.util.Scanner;
/**
 *
 * @author vovostudio
 */
public class Exercicio6 {

    /*
    6. Escreva um programa que pergunte o nome e a idade de um indivíduo e imprima
    (aproximadamente) quantos dias de vida ele possui. Considere que o ano tem 365 dias.
    
     */
    public static void main(String[] args) {
        rebenta();
    }
    
    public static void rebenta(){
        // Variáveis	
      	int idade, dias;
        
      	Scanner sc = new Scanner(System.in);
      	
      	// Entradas
      	System.out.print("Qual é o seu nome? "); 
      	String nome = sc.nextLine(); 
        System.out.print("Qual é a sua idade? "); 
      	idade = sc.nextInt();
      
      	// Processamento
      	dias = idade * 365;
        
        // Saída
      	System.out.printf("%s, você tem aproximadamente %d dias.\n", nome, dias);
        
    }
  
}
