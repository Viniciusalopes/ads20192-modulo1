/*
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 11/09/2019
 * Projeto   : Aula_ADS1: Atividade 1 - Exercícios de Introdução
 * Finalidade: Exibir mensagens no console.
 */
package app;

import model.Exercicio;
import util.Util;
import java.util.ArrayList;

public class App {

    public static void exibe_cabecalho() {
        System.out.println(Util.repete("-", 80));
        System.out.println(
                Util.repete(" ", 12)
                + "Aula_ADS1: Atividade 1 - Exercícios de Introdução"
        );
        System.out.println(Util.repete("-", 80));
    }

    public static void exibe_lista(ArrayList<Exercicio> lista) {

        System.out.println("LISTA DE EXERCÍCIOS:");
        for (Exercicio obj : lista) {
            System.out.println("\t" + obj.getNumero() + ". " + obj.getTitulo());
        }
    }

    public static void exibe_opcoes() {
        System.out.print("\nOPÇÕES:\n"
                + "  De 1 a 8 - Executa um exercício\n"
                + "         S - Sair"
                + "\n\nDigite uma opção e pressione [ENTER]: ");
    }

    /**
     *
     * @param tipo Tipo de Mensagem
     * @param mensagem Mensagem ou complemento da mensagem
     * @return boolean aguarda, para esperar pelo usuário
     */
    public static boolean exibe_mensagem(String tipo, String mensagem) {
        String msg = "\n";
        String tecle_enter = "";
        boolean aguarda = false;

        switch (tipo) {
            case "saida":
                msg += "Saída pela direita...\n";
                break;

            case "opcao_invalida":
                msg += "Opa! \"" + mensagem + "\" não é uma opção!" + tecle_enter;
                tecle_enter = "\nPressione [ENTER] para ver o menu novamente...";
                aguarda = true;
                break;

            case "opcao_desconhecida":
                msg += "Opa! Vou considerar isso como um NÃO.\n"
                        + "Pressione [ENTER] para voltar ao menu...";
                aguarda = true;
                break;

            case "executando":
                msg += Util.repete("-", 80)
                        + "\nExecutando exercício " + mensagem + "...\n";
                break;

            case "finalizado":
                msg += Util.repete("-", 80)
                        + "\nEXERCÍCIO " + mensagem + " finalizado.\n"
                        + "Deseja executar novamente [S/n]? ";
                break;
        }

        System.out.print(msg);
        return aguarda;
    }

    public static void exibe_enunciado(Exercicio ex) {
        System.out.println(Util.repete("-", 80));
        System.out.println("EXERCÍCIO " + ex.getNumero() + ":\n" + ex.getEnunciado());
        System.out.print("\nExecutar agora [S/n]? ");
    }

}
