/*
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 11/09/2019
 * Projeto   : Aula_ADS1: Atividade 1 - Exercícios de Introdução
 * Finalidade: BLL – Business Logic Layer
 */
package bll;

import app.App;
import dao.Dao;
import model.Exercicio;
import aula_ads1.Exercicio1;
import aula_ads1.Exercicio2;
import aula_ads1.Exercicio3;
import aula_ads1.Exercicio4;
import aula_ads1.Exercicio5;
import aula_ads1.Exercicio6;
import aula_ads1.Exercicio7;
import aula_ads1.Exercicio8;
import java.util.Scanner;

public class Bll {

    // Variável para respostas aos menus
    private static String resposta = "";

    // Leitor de buffer do teclado
    public static Scanner sc = new Scanner(System.in);

    // menu principal
    public static void menu() {
        do {
            // Valor inicial
            resposta = "";
            App.exibe_cabecalho();
            App.exibe_lista(Dao.get_lista());
            App.exibe_opcoes();
            resposta = sc.nextLine().toLowerCase();

            if (resposta.intern() != "s".intern()) {
                if (Dao.exercicio_valido(resposta)) {
                    Exercicio ex = Dao.get_exercicio(Integer.parseInt(resposta));
                    App.exibe_enunciado(ex);
                    resposta = sc.nextLine().toLowerCase();
                    if (resposta.intern() == "s".intern()) {
                        executa_exercicio(ex.getNumero());
                    } else {
                        if (resposta.intern() != "n".intern()) {
                            if (App.exibe_mensagem("opcao_desconhecida", resposta)) {
                                sc.nextLine();
                            }
                        }
                    }
                } else {
                    if (App.exibe_mensagem("opcao_invalida", resposta)) {
                        sc.nextLine();
                    }
                }
            }
        } while (resposta.intern() != "s".intern());
        App.exibe_mensagem("saida", "");
        System.exit(0);
    }

    private static void executa_exercicio(int numero) {
        do {
            // Não executar novamente
            resposta = "n";

            App.exibe_mensagem("executando", Integer.toString(numero));
            switch (numero) {
                case 1:
                    Exercicio1.agora_vai();
                    break;
                case 2:
                    Exercicio2.vamo();
                    break;
                case 3:
                    Exercicio3.foi();
                    break;
                case 4:
                    Exercicio4.vai_com_tudo();
                    break;
                case 5:
                    Exercicio5.arrocha();
                    break;
                case 6:
                    Exercicio6.rebenta();
                    break;
                case 7:
                    Exercicio7.bora();
                    break;
                case 8:
                    Exercicio8.avia_minino();
                    break;
            }
            App.exibe_mensagem("finalizado", Integer.toString(numero));
            resposta = sc.nextLine();

            if (resposta.intern() != "s".intern() && resposta.intern() != "n".intern()) {
                resposta = "n";
                if (App.exibe_mensagem("opcao_desconhecida", resposta)) {
                    sc.nextLine();
                }
            }

        } while (resposta.intern() == "s".intern());
    }
}
