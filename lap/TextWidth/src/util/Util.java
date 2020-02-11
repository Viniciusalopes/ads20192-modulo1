/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 16/09/2019
 * Projeto   : TextWidth
 * Finalidade: Utilitários
 * ---------------------------------------------------------------------------------------
 */
package util;

/**
 *
 * @author vovostudio
 */
public class Util {

    /**
     *
     * @param caractere Caratere que se repete
     * @param quantidade Vezes que o caractere será repetido
     * @return (String) caractere * quantidade
     */
    public static String repete(String caractere, int quantidade) {
        String ret = "";
        for (int i = 0; i < quantidade; i++) {
            ret += caractere;
        }
        return ret;
    }
}
