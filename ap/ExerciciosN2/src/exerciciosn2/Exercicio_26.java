/*
 Faça um programa que receba duas notas de cada um dos 5 alunos de uma turma,
 calcule e imprima a média aritmética de cada aluno e imprima uma mensagem
 */
package exerciciosn2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");
        double media = 0, soma = 0, nota1, nota2;
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print(" Por favor insira a primeira nota dor aluno  ");
            nota1 = entrada.nextDouble();
            System.out.println(" Por favor insira a segunda nota dor aluno ");
            nota2 = entrada.nextDouble();

            soma = nota1 + nota2;
            media = soma / 2;
            System.out.printf(" a media do aluno e %.2f ", media);

            System.out.println();
        }
    }

}
