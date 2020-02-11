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
 * 30.Incremente o programa anterior onde caso a pessoa seja maior de idade
 * verifique se ela tem mais de 65 anos, ou caso seja menor de idade verifique
 * se ela é menor de 12 anos.
 */
public class Exercicio30 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        String nome, texto_saida;
        int idade;

        texto_saida = "pode ser considerado(a) maior de 18 anos de idade, por ter 18 anos";

        // Entrada
        System.out.println();
        System.out.print("Digite o seu nome.: ");
        nome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();

        // Processamento
        if (idade < 18) {
            texto_saida = "é menor de 18 anos de idade";
            if (idade < 12) {
                texto_saida += ", e menor de 12 anos de idade";
            }
        } else if (idade > 18) {
            texto_saida = "é maior de 18 anos de idade";
            if (idade > 65) {
                texto_saida += ", e maior de 65 anos de idade";
            }
        }

        // Saída
        System.out.println();
        System.out.printf("%s %s.\n", nome, texto_saida);
    }
}
