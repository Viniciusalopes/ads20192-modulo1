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
 * 39. Faça um programa que leia uma data (dia, mês e ano, em uma variável
 * inteira cada), e escreva a mesma data no formato dia de (mês por extenso) de
 * ano.
 */
public class Exercicio39 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano, ultimo_dia;
        String mmmm, texto_saida;
        boolean bisexto = false;

        // Entrada
        System.out.println();
        System.out.print("Digite o ano com 4 dígitos: ");
        ano = sc.nextInt();

        // Processamento com novas entradas
        if (ano < 1) {
            texto_saida = "Ano inválido!";
        } else {
            System.out.print("Digite o mês: ");
            mes = sc.nextInt();
            if (mes < 1 || mes > 12) {
                texto_saida = "Mês inválido!";
            } else {
                System.out.print("Digite o dia: ");
                dia = sc.nextInt();

                ultimo_dia = 31;
                mmmm = "dezembro";

                switch (mes) {
                    case 1:
                        mmmm = "janeiro";
                        break;
                    case 2:
                        if (ano % 400 == 0) {
                            bisexto = true;
                        } else if (ano % 4 == 0 && ano % 100 != 0) {
                            bisexto = true;
                        }
                        ultimo_dia = (bisexto) ? 29 : 28;
                        mmmm = "fevereiro";
                        break;
                    case 3:
                        mmmm = "março";
                        break;
                    case 4:
                        ultimo_dia -= 1;
                        mmmm = "abril";
                        break;
                    case 5:
                        mmmm = "maio";
                        break;
                    case 6:
                        ultimo_dia -= 1;
                        mmmm = "junho";
                        break;
                    case 7:
                        mmmm = "julho";
                        break;
                    case 8:
                        mmmm = "agosto";
                        break;
                    case 9:
                        ultimo_dia -= 1;
                        mmmm = "setembro";
                        break;
                    case 10:
                        mmmm = "outubro";
                        break;
                    case 11:
                        ultimo_dia -= 1;
                        mmmm = "novembro";
                        break;
                }
                if (dia < 1 || dia > ultimo_dia) {
                    texto_saida = "Dia inválido!";
                } else {
                    texto_saida = "Dia " + dia + " de " + mmmm + " de " + ano + ".";
                }
            }
        }

        // Saída
        System.out.println();
        System.out.println(texto_saida);
    }
}
