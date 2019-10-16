/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 15/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;
import static exerciciosn2.ExercicioN2_20.repete;
import static exerciciosn2.ExercicioN2_46.pad_left;
import static exerciciosn2.ExercicioN2_47.imprime_vetor;

import java.util.InputMismatchException;

/**
 * 52. Uma empresa possui ônibus com 48 lugares (24 nas janelas e 24 no corredor). Faça um
 * programa que utilize dois vetores para controlar as poltronas ocupadas no corredor e na
 * janela. Considere que zero representa poltrona desocupada e um representa poltrona
 * ocupada. Janela [ 0 1 0 0 . . . 1 0 0 ] Corredor [ 0 0 0 1 . . . 1 0 0 ] Esse programa
 * deve controlar a venda de passagens da seguinte maneira: - o cliente informa se deseja
 * poltrona no corredor ou na janela e, depois, o programa deve informar quais poltronas
 * estão disponíveis para a venda; - quando não existirem poltronas livres no corredor,
 * nas janelas ou, ainda, quando o ônibus estiver completamente cheio, deve ser mostrada
 * uma mensagem.
 */
public class ExercicioN2_52 {

    public static void main(String[] args) {
        // Declaração de variáveis
        int janela[], corredor[];
        String posicao;
        int opcao, poltronas_disponiveis[], poltrona;
        boolean voltar;

        // Inicialização de variáveis
        janela = new int[24];
        corredor = new int[24];
        poltronas_disponiveis = new int[2];
        voltar = false;

        for (int i = 0; i < janela.length; i++) {
            janela[i] = 0;
            corredor[i] = 0;
        }

        do {
            // Entrada
            opcao = menu_principal();

            switch (opcao) {
                case 1:
                    // Escolher lugar

                    posicao = escolher_posicao();
                    System.out.println();
                    poltrona = escolher_poltrona(janela, corredor, posicao);

                    if (posicao.equalsIgnoreCase("j")) {
                        janela[poltrona] = 1;
                    } else {
                        corredor[poltrona] = 1;
                    }
                    imprime_vetor("Janela = ", janela);

                    break;

                case 2:
                    // Ver lugares disponíveis
                    break;
                default: // case 0:  Sair
                    System.out.println(repete("-", 30) + "\nAté breve!");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
    }

    /**
     * Menu principal
     *
     * @return Inteiro para execução de uma função chamada no main
     */
    public static int menu_principal() {
        Scanner sc = new Scanner(System.in);
        String opcao = "";

        do {
            System.out.print(" Viação PAU-DE-ARARA\n"
                    + repete("-", 30) + "\n"
                    + " Menu de Opções:\n"
                    + repete("-", 30) + "\n"
                    + " 1 - Escolher lugar\n"
                    + " 2 - Ver lugares disponíveis\n"
                    + " 0 - Sair\n"
                    + repete("-", 30) + "\n"
                    + "Digite uma opção do menu: ");
            opcao = sc.next();

            if (!opcao_valida_menu(opcao, 0, 2)) {
                System.out.printf("Opa! '%s' não é uma opção. Tente outra vez...\n\n", opcao);
                System.out.println(repete("-", 60));
            }
        } while (!opcao_valida_menu(opcao, 0, 2));

        return Integer.parseInt(opcao);
    }

    /**
     * Entrada para escolha de posição no ônibus.
     *
     * @return "J" para Janela, "C" para Corredor
     */
    public static String escolher_posicao() {

        Scanner sc = new Scanner(System.in);
        String opcao;

        do {
            System.out.print("\nPosiçao da poltrona (J-Janela, C-Corredor): ");
            opcao = sc.next();

            if (!posicao_valida(opcao)) {
                System.out.printf("'%s' não é uma opção. Tente outra vez...\n", opcao);
            }
        } while (!posicao_valida(opcao));

        return opcao;
    }

    public static int escolher_poltrona(int[] janela, int[] corredor, String posicao) {

        Scanner sc = new Scanner(System.in);
        String numero;
        int poltrona, indice;

        boolean poltrona_belesma, poltrona_livre;
        do {

            do {
                get_poltronas_disponiveis(janela, corredor, posicao);

                System.out.print("Poltronas LIVRES estão com números.\n"
                        + "Digite o número da poltrona desejada: ");
                numero = sc.next();
                poltrona_belesma = poltrona_valida(numero, posicao, janela.length * 2);

                if (!poltrona_belesma) {
                    System.out.printf("\nOPA! Número de poltrona inválido.\n"
                            + "Poltronas n%spares.\n"
                            + "Tente outra vez...\n\n",
                            (posicao.equalsIgnoreCase("j"))
                            ? "a Janela são números ím"
                            : "o Corredor, são números ");
                }

            } while (!poltrona_belesma);

            poltrona = Integer.parseInt(numero);
            indice = (poltrona - ((posicao.equalsIgnoreCase("j")) ? 1 : 3)) / 2;
            poltrona_livre = poltrona_disponivel(posicao, indice, janela, corredor);

            if (!poltrona_livre) {
                System.out.printf("OPA! A poltrona %d já está ocupada por outro cidadão de bem.\n"
                        + "Escolha outra poltrona, por obséquio.\n\n", (poltrona));
            }
        } while (!poltrona_livre);

        return indice;
    }

    /**
     * Valida a opção informada pelo usuário num intervalo de inteiros (menor <= opcao >=
     * maior); Próprio para menus numéricos
     *
     * @param opcao Opção informada pelo usuário
     * @param menor Menor valor inteiro
     * @param maior Maior valor inteiro
     * @return true=Opção válida, false= fora do intervalo
     */
    public static boolean opcao_valida_menu(String opcao, int menor, int maior) {
        if (inteiro_valido(opcao)) {
            if (Integer.parseInt(opcao) >= menor
                    && Integer.parseInt(opcao) <= maior) {
                return true;
            }
        }
        return false;
    }

    /**
     * Testa se a uma String pode ser convertida em um número inteiro válido.
     *
     * @param numero String com o número
     * @return true=Belesma, false=Faiô
     */
    public static boolean inteiro_valido(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Valida posicao de janela ou corredor
     *
     * @param opcao
     * @return
     */
    public static boolean posicao_valida(String opcao) {
        if (!opcao.equalsIgnoreCase("j") && !opcao.equalsIgnoreCase("c")) {
            return false;
        }
        return true;
    }

    /**
     * Exibe informações sobre a quantidade de poltronas disponíveis no ônibus.
     *
     * @param janela Vetor com a informação de ocupação de poltronas na janela
     * @param corredor Vetor com a informação de ocupação de poltronas na janela
     * @param opcao String "j" ou "c" para consulta de poltronas na janela ou no corredor
     */
    public static void get_poltronas_disponiveis(int[] janela, int[] corredor, String opcao) {

        // Processamento
        int poltronas_disponiveis[] = {0, 0, 0};    // sendo [0]=janela, [1]=corredor, [2]=total

        // Identifica os poltronas disponíveis
        for (int i = 0; i < janela.length; i++) {
            if (janela[i] == 0) {
                poltronas_disponiveis[0]++;   // janela disponível
            }
            if (corredor[i] == 0) {
                poltronas_disponiveis[1]++;   // corredor disponível
            }
        }

        // Calcula total de poltronas disponíveis
        poltronas_disponiveis[2] = poltronas_disponiveis[0] + poltronas_disponiveis[1];

        // Verificando poltronas disponíveis
        if (poltronas_disponiveis[2] == 0) {
            System.out.println("O ônibus está completamente cheio.\n");
        } else {
            if (opcao.equalsIgnoreCase("j")) {
                // janela
                if (poltronas_disponiveis[0] == 0) {
                    System.out.println("Não existem poltronas livres na Janela.\n");
                } else {
                    exibe_poltronas_disponiveis(janela, "j");
                }
            } else {
                System.out.println();
                // corredor
                if (poltronas_disponiveis[1] == 0) {
                    System.out.println("Não existem poltronas livres no Corredor.\n");
                } else {
                    exibe_poltronas_disponiveis(corredor, "c");
                }
            }
        }
    }

    /**
     * Exibe as poltronas disponíveis para venda.
     *
     * @param vetor int[] Vetor, com as informações sobre a ocupação de poltronas
     * @param opcao String "j" ou "c" para consulta de poltronas na janela ou no corredor
     */
    public static void exibe_poltronas_disponiveis(int[] vetor, String opcao) {
        String posicao, poltronas;

        int numero = 0;
        poltronas = "";
        posicao = (opcao.equalsIgnoreCase("j")) ? " Janela :" : "Corredor:";

        ExercicioN2_47.imprime_vetor("vetor = ", vetor);
        for (int i = 0; i < vetor.length; i++) {
            poltronas += "[";

            if (vetor[i] == 0) {    // Verifica se está disponível

                // Números pares, janela; números ímpares, corredor.
                if (opcao.equalsIgnoreCase("j")) {
                    numero = 2 * i + 1;
                } else if (opcao.equalsIgnoreCase("c")) {
                    numero = 2 * i + 3;
                }

                // Compõe ret
                // Formata o alinhamento dos números dos poltronas
                poltronas += String.format("%s",
                        (pad_left((vetor[i] == 0) ? Integer.toString(numero) : "", ' ', 2)));

            }
            poltronas += "] ";

        }
        System.out.println(posicao + poltronas);
    }

    public static boolean poltrona_valida(String numero, String opcao, int lugares) {
        if (inteiro_valido(numero)) {
            int indice = Integer.parseInt(numero);
            if (opcao.equalsIgnoreCase("j")
                    && indice % 2 != 0
                    && indice < lugares) {
                return true;
            } else if (opcao.equalsIgnoreCase("c")
                    && indice % 2 == 0
                    && indice < lugares) {
                return true;
            }

        }
        return false;
    }

    public static boolean poltrona_disponivel(String posicao, int indice, int[] janela, int[] corredor) {
        if (posicao.equalsIgnoreCase("j") && janela[indice] == 0) {
            return true;
        } else if (posicao.equalsIgnoreCase("c") && corredor[indice] == 0) {
            return true;
        } else {
            return false;
        }
    }

}
