/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 12/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 30. Faça um programa que calcule se um número lido pelo usuário é perfeito. Um número X
 * é perfeito se a soma dos seus divisores, exceto ele mesmo, é igual a X. Por exemplo, 6
 * é perfeito visto que 1+2+3 = 6.
 */
public class ExercicioN2_30 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int n, soma, cont;
        String divisores, saida;

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        soma = cont = 0;
        divisores = saida = "";

        // Entrada
        System.out.print("Digite um número: ");
        n = sc.nextInt();

        // Processamento
        // Inicia composição do texto de saída
        saida = String.format("O número %d ", n);

        for (int i = 1; i < n; i++) {
            if (n % i == 0 && i != n) {
                divisores += (i == 1) ? Integer.toString(i) : ("+" + Integer.toString(i));
                soma += i;
                cont++;
            }
        }

        // Verifica se é perfeito
        if (soma == n && cont > 0) {
            saida += "é";
        } else {
            saida += "NÃO é";
        }

        saida += " PERFEITO, visto que ";
        if (cont <= 1) {  // para 0 e 1
            if (n == 0) {
                saida += "não existe divisão por 0 (zero).";
            } else {
                saida += String.format("%d só é divisível por ele mesmo.", n);
            }
        } else {
            saida += String.format("%s = %d.", divisores, soma);
        }

        // Saída
        System.out.println(saida + "\n");
    }
}
