/*
 16. Escreva um programa que receba vários números inteiros, calcule e mostre: 
 a) a soma dos números digitados;
 b) a quantidade de números digitados;
 c) a média dos números digitados; 
 d) o maior número digitado;
 e) o menor número digitado; 
 f) a média dos números pares;
 g) a percentagem dos números ímpares entre todos os números digitados.
 Finalize a entrada de dados com a digitação do número 0.
 */
package exerciciosn2;

import java.util.Scanner;

public class Exercicio_16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaraçao de variaveis 
        int numero, soma, soma_pares, numeros_digitados, numeros_pares, numeros_impares, maior_numero, menor_numero;
        double media, media_pares, percent_impares;

        //inicializaçao de variaveis 
        soma = numeros_digitados = maior_numero = menor_numero = soma_pares = numeros_impares = numeros_pares = 0;

        //entrada de dados
        do {
            System.out.print("por favor digite um numero ");
            numero = entrada.nextInt();
            //limpesa do buffer
            entrada.nextLine();

            //processamento
            //a) a soma dos números digitados;
            soma = soma + numero;

            //b) a quantidade de números digitados;
            numeros_digitados++;

            /*
             d) o maior número digitado;
             e) o menor número digitado;
             */
            if (numeros_digitados == 1) {
                //entao e o primeiro numero digitado
                maior_numero = numero;
                menor_numero = numero;
            } else {
                //se nao , procurar o maior e o menor
                if (numero > maior_numero) {
                    maior_numero = numero;
                }
                if (numero < menor_numero) {
                    menor_numero = numero;
                }
            }
           // ctrl + espaço , abre lista de opçoes 

            // f) a média dos números pares
            //g) a percentagem dos números ímpares entre todos os números digitados.
            if (numero % 2 == 0) {
                // entao o numero e par 
                soma_pares = soma_pares + numero;
                numeros_pares++;
            } else {
                //entao o numero e impar
                numeros_impares++;
            }

        } while (numero != 0);

        /*
         c) a média dos números digitados; 
         f) a média dos números pares;
         g) a percentagem dos números ímpares entre todos os números digitados.
         */
        //c) a média dos números digitados;
        media = soma / numeros_digitados;

        //f) a média dos números pares;
        media_pares = soma_pares / numeros_pares;
        
        //g) a percentagem dos números ímpares entre todos os números digitados.
        percent_impares = numeros_impares / numeros_digitados * 100;
        //para saber o percentual de uma parte em relaçao ao conjunto todo :
        //parte / todo * 100 (formula)
        
        
        //esse modo nao tera a importancia da letra  maiuscula ou minuscula
        System.out.println();
        System.out.println("===================================================");
        System.out.printf(" a soma dos números digitados e :%d\n",soma);
        System.out.printf("a quantidade de números digitados %d\n",numeros_digitados);
        System.out.printf("a média dos números digitados e %.2f\n",media);
        System.out.printf("o maior número digitado e%d\n",maior_numero);
        System.out.printf("o menor número digitado e %d\n",menor_numero);
        System.out.printf("a média dos números pares e %.2f\n",media_pares);
        System.out.printf("o percentual de numeros impares e %.2f\n",percent_impares);
        System.out.println("===================================================");
        System.out.println();
    }
}
