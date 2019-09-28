/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 28/09/2019
 * Projeto   : ExerciciosNiv
 * Finalidade: Exercícios de Nivelamento de Algorítimos e Lógica
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 *
 * @author vovostudio
 */
public class MaiorDeIdade {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        String nome, resultado;
        int idade;

        // Entrada
        System.out.println();
        System.out.print("Digite o nome: ");
        nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();

        // Processamento
        resultado = nome + " tem " + idade + " anos e ";
        if (idade >= 18) {
            resultado += "é";
        } else {
            resultado += "NÃO é";
        }
        resultado += " maior de idade.\n";
        
        // Saída
        System.out.println();
        System.out.println(resultado);
    }
}
