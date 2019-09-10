package aula_ads1;

import java.util.Scanner;
/**
 *
 * @author vovostudio
 */
public class Exercicio7 {

    /*
    7. Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
        A fórmula de conversão é: F = C*(9.0/5.0)+32.0,
        sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.    
     */
    public static void main(String[] args) {
        bora();
    }
    
    public static void bora(){
        // Variáveis	
      	double c, f;
        
      	Scanner sc = new Scanner(System.in);
      	
      	// Entrada
      	System.out.print("Digite uma temperatura em graus Celsius (°C): "); 
      	c = sc.nextDouble(); 
        
      	// Processamento
      	f = c * (9.0 / 5.0) + 32.0;
        
        // Saída
      	System.out.printf("%.1f°C correspondem a %.1f°F.\n", c, f);
        
    }
  
}
