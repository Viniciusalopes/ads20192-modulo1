/*
 30. Faça um programa que calcule se um número lido pelo usuário é perfeito. Um número
 X é perfeito se a soma dos seus divisores, exceto ele mesmo, é igual a X. Por exemplo,
 6 é perfeito visto que 1+2+3 = 6.
 */
package lucas_lista_n2;

import java.util.Scanner;

public class Exercicio_30 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variavel que dara entrada na verificaçao se o numero e perfeito ou nao
        int num = 0, soma = 0, cont = 0;

        System.out.printf("Por favor insira o numero ");
        num = entrada.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0 && i != num) {
            soma = soma + num;    
            cont++;
            }
        }
        if (soma == num && cont > 0) {
            System.out.println("e perfeito");
            
        }else{
            System.out.println("nao e perfeito");
        }
        
    }
}
