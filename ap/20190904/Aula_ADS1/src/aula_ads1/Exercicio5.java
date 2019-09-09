//package aula_ads1;

import java.util.Scanner;
/**
 *
 * @author vovostudio
 */
public class Exercicio5 {

    /*
    5. Escreva um programa que leia dois números e apresente a soma e a subtração entre eles para o usuario.
    
     */
    public static void main(String[] args) {
        arrocha();
    }
    
    public static void arrocha(){
  		// Variáveis	
      	int numero1, numero2, soma, subtracao1, subtracao2;
      	Scanner sc = new Scanner(System.in);
      	
      	// Entradas
      	System.out.print("Digite um número INTEIRO: "); 
      	numero1 = sc.nextInt(); 
        System.out.print("Digite um outro número INTEIRO: "); 
      	numero2 = sc.nextInt();
      
      	// Processamento
      	soma = numero1 + numero2;
      	subtracao1 = numero1 - numero2;
      	subtracao2 = numero2 - numero1;
      	
        // Saída
      	System.out.println(numero1 + " + " + numero2 + " = " +  soma);
        System.out.println(numero1 + " - " + numero2 + " = " +  subtracao1);
        System.out.println(numero2 + " - " + numero1 + " = " +  subtracao2);
        
    }
  
}
