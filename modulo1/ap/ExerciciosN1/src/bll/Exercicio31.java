/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 21/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 31. Faça um programa que leia uma letra e mostre se ela é uma vogal ou
 * consoante. Considere que poderão ser digitadas letras maiúsculas ou
 * minúsculas.
 */
public class Exercicio31 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        String entrada, texto_saida;
        char letra;

        texto_saida = "Digite apenas uma letra!";

        // Entrada
        System.out.println();
        System.out.print("Digite uma letra: ");
        entrada = sc.nextLine();

        // Processamento
        if (entrada.length() == 0) {
            texto_saida = "Você não digitou nenhuma letra.";
        } else if (entrada.length() == 1) {
            letra = entrada.toLowerCase().charAt(0);
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    texto_saida = "A letra '" + entrada.charAt(0) + "' é uma vogal.";
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    texto_saida = "'" + letra + "' é um número, e não uma letra.";
                    break;
                default:
                    texto_saida = "A letra '" + entrada.charAt(0) + "' é uma consoante.";
                    break;
            }
        }

        // Saída
        System.out.println();
        System.out.println(texto_saida);
    }
}
