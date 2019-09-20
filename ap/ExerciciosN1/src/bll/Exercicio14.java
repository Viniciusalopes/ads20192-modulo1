/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 20/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 14. Numa certa loja de eletrodomésticos, o comerciário encarregado da seção
 * de televisores recebe, mensalmente, um salário fixo (que representa
 * 2*salarioMinimo) mais a comissão. Essa comissão é calculada em relação ao
 * número de televisores vendidos por mês de cada um dos tipos de TV, obedecendo
 * as seguintes especificações:
 *
 * TV LCD R$ 50,00 de comissão por unidade vendida
 *
 * TV LED R$ 60,00 de comissão por unidade vendida
 *
 * TV Plasma R$ 75,00 de comissão por unidade vendida
 *
 * Sabendo que o salário total é calculado a partir do salário fixo + a
 * comissão, escreva um programa que calcule e escreva o salário final do
 * empregado, considerando que o usuário vai informar a quantidade de TVs
 * vendidas de cada tipo e o salário mínimo atual.
 */
public class Exercicio14 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int lcd, led, plasma;
        double salario_minimo, salario_fixo,
                comissao_lcd, comissao_led, comissao_plasma,
                total_comissao_lcd, total_comissao_led, total_comissao_plasma,
                total_comissao, salario_final;
        String linha = "------------------------------------------------------";

        comissao_lcd = 50.0;
        comissao_led = 60.0;
        comissao_plasma = 75.0;

        // Entrada
        System.out.println(linha);

        System.out.print("Quantidade de TVs LCD vendidas...: ");
        lcd = sc.nextInt();

        System.out.print("Quantidade de TVs LED vendidas...: ");
        led = sc.nextInt();

        System.out.print("Quantidade de TVs PLASMA vendidas: ");
        plasma = sc.nextInt();

        System.out.print("Salário Mínimo atual.............: ");
        salario_minimo = sc.nextDouble();

        // Processamento
        total_comissao_lcd = lcd * comissao_lcd;
        total_comissao_led = led * comissao_led;
        total_comissao_plasma = plasma * comissao_plasma;
        total_comissao = total_comissao_lcd + total_comissao_led + total_comissao_plasma;

        salario_fixo = salario_minimo * 2;
        salario_final = salario_fixo + total_comissao;

        // Saída
        System.out.printf(
                linha + "\n"
                + "Comissão sobre vendas de TVs LCD...: %.2f\n"
                + "Comissão sobre vendas de TVs LED...: %.2f\n"
                + "Comissão sobre vendas de TVs PLASMA: %.2f\n"
                + "Total das comissões................: %.2f\n"
                + "Salário Fixo.......................: %.2f\n"
                + linha + "\n"
                + "Salário final......................: %.2f\n",
                total_comissao_lcd,
                total_comissao_led,
                total_comissao_plasma,
                total_comissao,
                salario_fixo,
                salario_final
        );
    }
}
