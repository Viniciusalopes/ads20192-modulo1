/*
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 11/09/2019
 * Projeto   : Aula_ADS1: Atividade 1 - Exercícios de Introdução
 * Finalidade: Exibir um menu com todos os exercícios da lista, seus enunciados e executar os exercícios.
 */
package aula_ads1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import util.Util;

public class Principal {

    Util util = new Util();
    
    // Lista de exercícios
    private static ArrayList<Exercicio> lista = new ArrayList<Exercicio>();

    // Cria objeto da classe Exercício
    private static Exercicio ex = new Exercicio();

    // Leitor do buffer de teclado
    private static Scanner sc = new Scanner(System.in);

    // Variável para respostas aos menus
    private static String resposta = "";

    // Prepara a lista e exibe o menu principal
    public static void main(String[] args) {

        // Inicia a lista de objetos de exercícios
        set_lista();

        // Exibe o menu principal
        menu();
    }



    private static void executa_exercicio(int numero) {
        do {
            // Não executar novamente
            resposta = "n";

            System.out.println(repete("-", 80));
            System.out.println("Executando exercício " + ex.getNumero() + "...\n");
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

            System.out.println(repete("-", 80));
            System.out.print("EXERCÍCIO " + ex.getNumero() + " finalizado.\n"
                    + "Deseja executar novamente [S/n]? ");
            resposta = sc.nextLine();

            if (resposta.intern() != "s".intern() && resposta.intern() != "n".intern()) {
                resposta = "n";
                System.out.println("Vou considerar isso como um NÃO.");
                System.out.print("Pressione [ENTER] para voltar ao menu...");
                sc.nextLine();
            }

        } while (resposta.intern() == "s".intern());

    }

    /**
     *
     * @param caractere Caratere que se repete
     * @param quantidade Vezes que o caractere será repetido
     * @return (String) caractere * quantidade
     */
    
    
    private static String quebra_texto(String texto, int colunas) {
        String retorno = "";
        String nova_linha = "";

        List<String> linhas = Arrays.asList(texto.split("\n"));     // String recebida, separada em linhas no List
        for (String linha : linhas) {                               // Para cada linha
            nova_linha = new String("");                                    // Inicia a nova linha em branco
            if (linha.length() <= colunas) {                        // Se a linha tiver a mesma quantidade de colunas ou menos
                retorno += linha + "\n";                            // Adiciona a linha ao retorno, e fim de papo =)
            } else {                                                // Senão, (a linha for maior que a quantidade de colunas)
                nova_linha = new String("");                                    // Inicia a nova linha em branco
                List<String> palavras = Arrays.asList(linha.split(" "));        // Lista de palavras da linha
                for (String palavra : palavras) {                               // Para cada palavra da nova_linha
                    int tamanho = nova_linha.length() + palavra.length();
                    if (tamanho > colunas) {                                    // Verifica se cabe a palavra na nova_linha observadas as colunas
                        retorno += nova_linha + "\n";                           // Retorno recebe nova_linha + quebra
                        nova_linha = new String(linha.replace(nova_linha, "")); // Atualiza a nova_linha excluindo o que foi adicionado ao retorno
                    } else {
                        nova_linha += palavra + " ";                            // Adiciona palavra na nova_linha e continua adicionando palavas
                    }
                }
            }
        }
        return retorno;
    }
}
