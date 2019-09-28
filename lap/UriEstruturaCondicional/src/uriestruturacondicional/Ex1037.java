/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uriestruturacondicional;

 import java.util.Scanner;
/**
 *
 * @author vovostudio
 * Intervalos [0,25], (25,50], (50,75], (75,100]
 */
public class Ex1037 {

    public static void main(String[] args) {
        vai();
    }
    
    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        String saida;
        
        if (valor < 0.0 || valor > 100.0) {
            saida = "Fora de intervalo";
        } else if(valor < 25.0){
            
        } else if(valor < 50.0){
            
        } else if(valor < 75.0){
            
        }

        // Entrada
        System.out.println();

        // Processamento
        // Saída
        System.out.println();
    }    
}
