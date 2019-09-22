/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 22/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 41. Desenvolver um programa para calcular a conta da agua para a SANEAGO. O
 * custo da água varia dependendo do tipo de consumidor: residencial, comercial
 * ou industrial.
 */
// a. Residencial: R$ 5,00 de taxa mais R$ 0,05 por m3 gastos.
// b. Comercial  : R$ 500,00 para os primeiros 80m3 mais R$ 0,25 por m3 gastos acima dos 80m3.
// c. Industrial : R$ 800,00 para os primeiros 100m3 gastos mais R$ 0,04 por m3 gastos acima dos 100m3;
//
public class Exercicio41 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        String entrada, texto_saida, campo;
        char tipo;
        double consumo, taxa, m3, primeiros, conta;

        texto_saida = "";
        campo = "";

        try {
            // Entrada
            System.out.println();
            System.out.print("Tipo de consumidor [ R=Residencial, C=Comercial, I=Industrial ]: ");
            entrada = sc.next();

            texto_saida = "'" + entrada + "' não é uma opção.";

            if (entrada.length() == 1) {
                tipo = entrada.toLowerCase().charAt(0);
                if (tipo == 'c' || tipo == 'r' || tipo == 'i') {
                    // Nova Entrada
                    campo = "Consumo";
                    System.out.print("Consumo em m³: ");
                    consumo = sc.nextDouble();

                    // Processamento
                    if (tipo == 'r') {
                        // residencial
                        primeiros = 0;
                        taxa = 5.00;
                        m3 = 0.05;
                    } else if (tipo == 'c') {
                        // comercial
                        primeiros = 80.0;
                        taxa = 500.00;
                        m3 = 0.25;
                    } else {
                        // industrial
                        primeiros = 100.0;
                        taxa = 800.00;
                        m3 = 0.04;
                    }
                    // Cálculo da conta
                    conta = taxa + ((consumo > primeiros) ? consumo - primeiros : 0.0) * m3;
                    texto_saida = String.format("Valor total da conta de água: R$ %.2f", conta);
                }
            }

            // Saída
            System.out.println();
            System.out.println(texto_saida);
        } catch (InputMismatchException e) {
            System.out.println(campo + " inválido!\n(" + e + ")");
        }
    }
}
