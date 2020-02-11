/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 22/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 34. O IMC – Índice de Massa Corporal é um critério da Organização Mundial de
 * Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A
 * fórmula é IMC = peso / (altura)² . Elabore um algoritmo que leia o peso e a
 * altura de um adulto e mostre sua condição.
 */
//  IMC em adultos      Condição
//  abaixo de 18.5      abaixo do peso
//  entre 18.5 e 25     peso normal
//  entre 25 e 30       acima do peso
//  acima de 30         obeso
//
public class Exercicio34 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;
        String condicao;

        // Entrada
        System.out.println();
        System.out.print("Digite o seu peso..: ");
        peso = sc.nextDouble();

        System.out.print("Digite a sua altura: ");
        altura = sc.nextDouble();

        // Processamento
        condicao = "obeso";

        imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            condicao = "abaixo do peso";
        } else if (imc < 25) {
            condicao = "com o peso normal";
        } else if (imc < 30) {
            condicao = "acima do peso";
        }

        // Saída
        System.out.println();
        System.out.printf("Seu IMC: %.2f\nVocê está %S.\n", imc, condicao);
    }
}
