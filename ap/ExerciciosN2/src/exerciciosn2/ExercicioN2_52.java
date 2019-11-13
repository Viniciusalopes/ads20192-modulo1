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
    // #naoTemNadaAverComOpi ;)
    // #nemLembreiDoPi :p
    // #falsidade XD

    public static void main(String[] args) {

        // Declaração de variáveis
        int janela[], corredor[];
        String posicao;
        int opcao, poltrona, indice_poltrona;

        // Inicialização de variáveis
        janela = new int[3]; // PARA TESTES
//        janela = new int[24];
        corredor = new int[janela.length]; // PARA TESTES

        do {
            // Entrada
            System.out.println();
            opcao = menu_principal(janela, corredor);

            switch (opcao) {
                case -1:
                    exibe_poltronas_disponiveis(janela, "j");
                    exibe_poltronas_disponiveis(corredor, "c");
                    System.out.println("O ônibus está completamente cheio.\n");
                    return;
                case 1:
                    // Escolher lugares
                    posicao = escolher_posicao(janela, corredor);
                    System.out.println();
                    poltrona = escolher_poltrona(janela, corredor, posicao);
                    if (poltrona >= 0) {
                        // Reserva a poltrona
                        indice_poltrona = get_indice_da_poltrona(poltrona, posicao);
                        if (posicao.equalsIgnoreCase("j")) {
                            janela[indice_poltrona] = 1;
                        } else {
                            corredor[indice_poltrona] = 1;
                        }

                        System.out.printf("A poltrona %d foi reservada.\n", poltrona);
                    }
                    break;

                case 2:
                    // Ver lugares disponíveis
                    System.out.println("\nPoltronas LIVRES estão com números.");
                    exibe_poltronas_disponiveis(janela, "j");
                    exibe_poltronas_disponiveis(corredor, "c");
                    break;
                default: // case 0:  Sair
                    System.out.println(repete("-", 30) + "\nAté breve!");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
    }

    /**
     * Menu Principal
     *
     * @param janela Vetor de lugares na janela
     * @param corredor Vetor de lugares no corredor
     * @return Inteiro para execução de comandos no main
     */
    public static int menu_principal(int[] janela, int[] corredor) {
        Scanner sc = new Scanner(System.in);
        String opcao = "-1";
        String menu = "";
        int lugares[] = get_lugares(janela, corredor);

        // Imprime menu
        menu += " Viação PAU-DE-ARARA\n"
                + repete("-", 30) + "\n"
                + " Menu de Opções:\n"
                + repete("-", 30) + "\n";

        if (lugares[2] > 0) {
            menu += " 1 - Escolher lugares\n";
        }

        menu += " 2 - Ver lugares disponíveis\n"
                + " 0 - Sair\n"
                + repete("-", 30) + "\n"
                + "Digite uma opção do menu: ";

        System.out.print(menu);

        if (lugares[2] > 0) { // Ainda existem lugares livres?
            do {

                opcao = sc.next();

                if (!opcao_valida_menu(opcao, 0, 2) || !inteiro_valido(opcao)) {
                    System.out.printf("Opa! '%s' não é uma opção. Tente outra vez...\n", opcao);
                    System.out.println(repete("-", 60));
                    System.out.print("Digite uma opção do menu: ");
                }
            } while (!opcao_valida_menu(opcao, 0, 2));
        }

        return Integer.parseInt(opcao);
    }

    /**
     * Escolha da posição no ônibus (Janela/Corredor)
     *
     * @param janela Vetor de lugares na janela
     * @param corredor Vetor de lugares no corredor
     * @return String "J" para Janela, "C" para Corredor
     */
    public static String escolher_posicao(int[] janela, int[] corredor) {

        Scanner sc = new Scanner(System.in);
        String opcao;
        int lugares[] = get_lugares(janela, corredor);

        if (lugares[0] == 0) {
            opcao = "c";
        } else if (lugares[1] == 0) {
            opcao = "j";
        } else {
            do {
                System.out.print("\nPosiçao da poltrona (J-Janela, C-Corredor): ");
                opcao = sc.next();

                if (!posicao_valida(opcao)) {
                    System.out.printf("'%s' não é uma opção. Tente outra vez...\n", opcao);
                }
            } while (!posicao_valida(opcao));
        }
        return opcao;
    }

    /**
     * Escolha do número da poltrona
     *
     * @param janela Vetor de lugares na janela
     * @param corredor Vetor de lugares no corredor
     * @param posicao Posição no ônibus ("J" para Janela, "C" para Corredor)
     * @return Inteiro do número da poltrona
     */
    public static int escolher_poltrona(int[] janela, int[] corredor, String posicao) {

        Scanner sc = new Scanner(System.in);
        String numero;
        int poltrona, indice;

        boolean poltrona_belesma, poltrona_livre;

        if (get_poltronas_disponiveis(janela, corredor, posicao)) {
            do {

                do {
                    System.out.print("Digite o número da poltrona desejada (C-Cancela): ");
                    numero = sc.next();
                    if (numero.equalsIgnoreCase("c")) {
                        return -2; // Usuário cancelou
                    }

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
                indice = get_indice_da_poltrona(poltrona, posicao);
                poltrona_livre = poltrona_disponivel(posicao, indice, janela, corredor);

                if (!poltrona_livre) {
                    System.out.printf("OPA! A poltrona %d já está ocupada por outro cidadão de bem.\n"
                            + "Escolha outra poltrona, por obséquio.\n\n", (poltrona));
                }
            } while (!poltrona_livre);

            return poltrona;
        }
        return -1; // não há poltronas disponíveis
    }

    /**
     * Exibe informações sobre a quantidade de poltronas disponíveis no ônibus.
     *
     * @param janela Vetor com a informação de ocupação de poltronas na janela
     * @param corredor Vetor com a informação de ocupação de poltronas na janela
     * @param opcao String "j" ou "c" para consulta de poltronas na janela ou no corredor
     * @return boolean false=janela, corredor ou ambos sem lugares, true=há lugares
     */
    public static boolean get_poltronas_disponiveis(int[] janela, int[] corredor, String opcao) {

        String nadinha = String.format("Não existem poltronas livres n%s.",
                (opcao.equalsIgnoreCase("j") ? "a Janela" : "o Corredor"));

        // Processamento
        int poltronas_disponiveis[] = get_lugares(janela, corredor);

        // Verificando poltronas disponíveis
        if (poltronas_disponiveis[2] == 0) {
            System.out.println("O ônibus está completamente cheio.\n");
            return false;
        } else {
            if (opcao.equalsIgnoreCase("j")) {
                // janela
                exibe_poltronas_disponiveis(janela, "j");
                if (poltronas_disponiveis[0] == 0) {
                    System.out.println(nadinha);
                    return false;
                }
            } else {
                System.out.println();
                // corredor
                exibe_poltronas_disponiveis(corredor, "c");
                if (poltronas_disponiveis[1] == 0) {
                    System.out.println(nadinha);
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Quantidades de lugares disponíveis sendo, v[0]=janela, v[1]=corredor, v[2]=total
     *
     * @param janela Vetor de lugares na janela
     * @param corredor Vetor de lugares no corredor
     * @return Vetor de inteiros com as quantidades de lugares disponíveis
     */
    public static int[] get_lugares(int[] janela, int[] corredor) {
        int lugares[] = {0, 0, 0};  // sendo [0]=janela, [1]=corredor, [2]=total

        // Identifica os poltronas disponíveis
        for (int i = 0; i < janela.length; i++) {
            if (janela[i] == 0) {
                lugares[0]++;   // janela disponível
            }
            if (corredor[i] == 0) {
                lugares[1]++;   // corredor disponível
            }
        }

        // Calcula total de poltronas disponíveis
        lugares[2] = lugares[0] + lugares[1];
        return lugares;
    }

    /**
     * Exibe as poltronas disponíveis para venda.
     *
     * @param vetor int[] Vetor, com as informações sobre a ocupação de poltronas
     * @param opcao String "j" ou "c" para consulta de poltronas na janela ou no corredor
     */
    public static void exibe_poltronas_disponiveis(int[] vetor, String opcao) {
        String texto_posicao, poltronas;

        int numero = 0;
        poltronas = "";
        texto_posicao = (opcao.equalsIgnoreCase("j")) ? " Janela :" : "Corredor:";

        for (int i = 0; i < vetor.length; i++) {
            poltronas += "[";

            if (vetor[i] == 0) {    // Verifica se está disponível

                numero = get_poltrona_do_indice(i, opcao);

                // Compõe ret
                // Formata o alinhamento dos números dos poltronas
                poltronas += pad_left(Integer.toString(numero), ' ', 2);
            } else {
                poltronas += "--";
            }
            poltronas += "] ";

        }
        System.out.println(texto_posicao + poltronas);
    }

    /**
     * Verifica se o número da poltrona é válido.
     *
     * @param numero String Número da poltrona
     * @param opcao String Posição da poltrona ("J" para Janela, "C" para Corredor)
     * @param lugares int Total de lugares
     * @return true=válido, false=fora do intervalo
     */
    public static boolean poltrona_valida(String numero, String opcao, int lugares) {
        if (inteiro_valido(numero)) {
            int numero_poltrona = Integer.parseInt(numero);
            if (opcao.equalsIgnoreCase("j")
                    && numero_poltrona % 2 != 0
                    && numero_poltrona <= lugares) {
                return true;
            } else if (opcao.equalsIgnoreCase("c")
                    && numero_poltrona % 2 == 0
                    && numero_poltrona <= lugares) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica se a poltrona está disponível.
     *
     * @param posicao String Posição da poltrona ("J" para Janela, "C" para Corredor)
     * @param indice int da posição da poltrona no vetor
     * @param janela Vetor de lugares na janela
     * @param corredor Vetor de lugares no corredor
     * @return true=v[indice] == 0 (disponivel); false=v[indice]==1 (ocupado)
     */
    public static boolean poltrona_disponivel(String posicao, int indice, int[] janela, int[] corredor) {
        if (posicao.equalsIgnoreCase("j") && janela[indice] == 0) {
            return true;
        } else if (posicao.equalsIgnoreCase("c") && corredor[indice] == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Índice do número da poltrona no vetor.
     *
     * @param poltrona Inteiro número da poltrona
     * @param posicao String Posição da poltrona ("J" para Janela, "C" para Corredor)
     * @return Inteiro do índice da poltrona
     */
    public static int get_indice_da_poltrona(int poltrona, String posicao) {
        return (poltrona - ((posicao.equalsIgnoreCase("j")) ? 1 : 2)) / 2;
    }

    /**
     * Número da poltrona equivalente ao índice.
     *
     * @param indice Inteiro do índice no vetor
     * @param posicao String Posição da poltrona ("J" para Janela, "C" para Corredor)
     * @return Inteiro do número da poltrona
     */
    public static int get_poltrona_do_indice(int indice, String posicao) {
        // Números pares, janela; números ímpares, corredor.
        return 2 * indice + ((posicao.equalsIgnoreCase("j")) ? 1 : 2);
    }

    /**
     * Valida a opção informada pelo usuário num intervalo de inteiros
     *
     * (menor <= opcao >= maior); Próprio para menus numéricos
     *
     * @param opcao String da opção informada pelo usuário
     * @param menor Menor valor inteiro
     * @param maior Maior valor inteiro
     * @return true=Opção válida, false=fora do intervalo
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
     * @param opcao String "J" para Janela, "C" para Corredor
     * @return true=válida, false=inválida
     */
    public static boolean posicao_valida(String opcao) {
        if (!opcao.equalsIgnoreCase("j") && !opcao.equalsIgnoreCase("c")) {
            return false;
        }
        return true;
    }
}
