/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import bll.Bll;
import dao.Dao;
import java.util.Scanner;

/**
 *
 * @author vovostudio
 */
public class App {

    public static void menu_principal() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        String str_numero, conversoes;

        String titulo = " SISTEMAS DE NUMERAÇÃO POSICIONAIS ";
        System.out.print(titulo + "\n"
                + repete('-', titulo.length()) + "\n"
                + "Bases:\n");


        for (int i = 0; i < Dao.base_id.length; i++) {
            System.out.print(Dao.base_id[i] + "\t" + Dao.base_nome[i] + "\n");
        }

        // Entrada
        System.out.print("\nNúmero a ser convertido: ");
        str_numero = sc.nextLine();

        // Processamento
        conversoes = Bll.converte(str_numero);

        // Saída
        System.out.println();
        System.out.println(conversoes);
    }

    public static String repete(char caractere, int vezes) {
        String ret = "";
        for (int i = 0; i < vezes; i++) {
            ret += caractere;
        }
        return ret;
    }
}
