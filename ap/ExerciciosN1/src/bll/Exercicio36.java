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
 * 36. Um comerciante calcula o valor da venda, tendo em vista a tabela a
 * seguir. Escreva um programa que leia o valor da compra e imprima o valor da
 * venda do produto.
 */
//  VALOR DA COMPRA                 VALOR DA VENDA
//  Valor < R$ 10,00                Lucro de 70%
//  R$ 10,00 <= Valor < R$ 30,00    Lucro de 50%
//  R$ 30,00 <= Valor < R$ 50,00    Lucro de 40%
//  Valor >= R$ 50,00               Lucro de 30%
//
public class Exercicio36 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double compra, venda;

        // Entrada
        System.out.println();
        System.out.print("Valor da compra: ");
        compra = sc.nextDouble();

        // Processamento
        if (compra < 10.0) {
            venda = compra * 1.7;
        } else if (compra >= 10.0 && compra < 30.0) {
            venda = compra * 1.5;
        } else if (compra >= 30.0 && compra < 50.0) {
            venda = compra * 1.4;
        } else {
            venda = compra * 1.3;
        }

        // Saída
        System.out.printf("Valor da venda.: %.2f\n", venda);
    }
}
