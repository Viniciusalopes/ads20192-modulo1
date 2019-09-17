/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 15/09/2019
 * Projeto   : TextWidth
 * Finalidade: Business Logic Layer
 * ---------------------------------------------------------------------------------------
 */
package bll;

import util.Util;
import app.App;

public class Bll {

    /**
     *
     * @param texto Texto a ser formatado
     * @param colunas Quantidade de colunas do texto de retorno
     * @return String Texto formatado com quebras na quantidade de colunas
     */
    public static String quebra_texto(String texto, int colunas) {
        // VARIÁVEIS

        // Retorno
        String ret = "";

        // Array de linhas do texto
        String linhas[] = texto.split("\n");

        for (String linha : linhas) {
            ret += quebra_linha(linha, colunas);
        }
        return ret;

    }

    private static String quebra_linha(String linha, int colunas) {
        // VARIÁVEIS

        // Retorno
        String ret = "", parte, nova_linha, proxima_linha;

        // Tamanho do texto da linha analisada
        int tamanho_do_texto = linha.length();

        // Posicao para a nova quebra de linha
        int quebra;

        if (tamanho_do_texto <= colunas) {
            // Mantém o texto como está
            ret = linha + "\n";
        } else {
            proxima_linha = linha;
            while (tamanho_do_texto > 0) {
                App.imprime_var("tamanho_do_texto", Integer.toString(tamanho_do_texto));
                if (tamanho_do_texto <= colunas) {
                    // Caso já tenham sido feitas todas as quebras
                    // nova_linha com tamanho <= colunas
                    nova_linha = proxima_linha.substring(0, proxima_linha.length());
                    System.out.println("menor-igual");
                    App.imprime_var("proxima_linha.length", Integer.toString(proxima_linha.length()));
                } else {
                    System.out.println("maior");
                    // Parte do texto na quantidade de colunas
                    parte = proxima_linha.substring(0, colunas);
                    App.imprime_var("parte", parte);

                    // Posição para quebra
                    quebra = espaco_anterior(parte);
                    App.imprime_var("quebra", Integer.toString(quebra));

                    // nova_linha com tamanho <= colunas
                    nova_linha = proxima_linha.substring(0, quebra);

                }

                App.imprime_var("nova_linha", nova_linha);
                // Acrescenta a nova_linha ao retorno
                ret += nova_linha + "\n";
                // Refaz a linha sem a nova_linha acrescentada no retorno
                proxima_linha = new String(proxima_linha.replaceAll(nova_linha, "")).trim();
                App.imprime_var("proxima_linha", proxima_linha);
                tamanho_do_texto = proxima_linha.length();
                System.out.println(Util.repete("-", colunas));
                geeksforgeeks.org  Guava char matcher
            }
        }

        return ret;
    }

    private static int espaco_anterior(String parte) {

        // VARIÁVEIS
        int posicao = parte.length() - 1;

        // Retorno
        int ret = posicao;

        // Array de caracteres da parte
        char[] caracteres = parte.toCharArray();

        // Busca a posição do primeiro espaço anterior
        if (caracteres[posicao] != ' ') {
            for (int p = posicao; p > 0; p--) {
                if (caracteres[p] == ' ') {
                    ret = p;
                    break;
                }
            }
        }
        return ret;
    }

}
