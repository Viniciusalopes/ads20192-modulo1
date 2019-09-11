/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author vovostudio
 * app == interface == telas do sistema
 */
public class App {
    private static void exibe_cabecalho() {
        System.out.println(repete("-", 80));
        System.out.println(
                repete(" ", 12)
                + "Aula_ADS1: Atividade 1 - Exercícios de Introdução"
        );
        System.out.println(repete("-", 80));
    }

    private static void exibe_lista() {
        System.out.println("LISTA DE EXERCÍCIOS:");
        for (Exercicio obj : lista) {
            System.out.println("\t" + obj.getNumero() + ". " + obj.getTitulo());
        }

    }

    private static void exibe_opcoes() {
        System.out.print("\nOPÇÕES:\n"
                + "  De 1 a 8 - Executa um exercício\n"
                + "         S - Sair"
                + "\n\nDigite uma opção e pressione [ENTER]: ");
    }

    private static void exibe_mensagem(String tipo, String mensagem) {
        String msg = "Saída pela direita...\n";
        String tecle_enter = "\nPressione [ENTER] para ver o menu novamente...";
        boolean aguarda = false;

        if (tipo == "opcao_invalida") {
            msg = "Opa! \"" + mensagem + "\" não é uma opção!" + tecle_enter;
            aguarda = true;
        }
        System.out.print(msg);
        if (aguarda) {
            sc.nextLine();
        }
    }

    private static void exibe_enunciado() {
        System.out.println(repete("-", 80));
        System.out.println("EXERCÍCIO " + ex.getNumero() + ":\n" + ex.getEnunciado());
//        System.out.println("EXERCÍCIO " + ex.getNumero() + ":\n" + quebra_texto(ex.getEnunciado(), 80));
        System.out.print("\nExecutar agora [S/n]? ");

        resposta = sc.nextLine().toLowerCase();
        if (resposta.intern() == "s".intern()) {
            executa_exercicio(ex.getNumero());
        } else {
            if (resposta.intern() != "n".intern()) {
                System.out.println("Vou considerar isso como um NÃO.");
            }
            System.out.print("Pressione [ENTER] para voltar ao menu...");
            sc.nextLine();
        }
    }
}
