/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 15/09/2019
 * Projeto   : TextWidth
 * Finalidade: Business Logic Layer
 * ---------------------------------------------------------------------------------------
 */
package bll;

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
        String ret = "", parte, nova_linha;

        // Tamanho do texto da linha analisada
        int tamanho_do_texto = linha.length();

        // Posicao para a nova quebra de linha
        int quebra;

        if (tamanho_do_texto < colunas) {
            // Mantém o texto como está
            ret = linha + "\n";
        } else {
            for (int p = 0; p < colunas; p += colunas) {
                // Parte do texto na quantidade de colunas
                parte = linha.substring(p, p + colunas);
                
                // Posição para quebra
                quebra = espaco_anterior(parte);
                
                // nova_linha com tamanho <= colunas
                nova_linha = new String(linha.substring(p, quebra) + "\n");
                
                // Acrescenta a nova_linha no retorno
                ret += nova_linha + "\n";
                
                // Refaz a linha sem a nova_linha acrescentada no retorno
                linha = new String(linha.replace(nova_linha, ""));
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
