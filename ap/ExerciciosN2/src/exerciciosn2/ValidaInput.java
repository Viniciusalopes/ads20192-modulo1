/*
 * A licença MIT
 *
 * Copyright 2019 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>.
 *
 * É concedida permissão, gratuitamente, a qualquer pessoa que obtenha uma cópia
 * deste software e dos arquivos de documentação associados (o "Software"), para
 * negociar o Software sem restrições, incluindo, sem limitação, os direitos de uso,
 * cópia, modificação e fusão, publicar, distribuir, sublicenciar e/ou vender cópias
 * do Software, e permitir que as pessoas a quem o Software é fornecido o façam,
 * sujeitas às seguintes condições:
 *
 * O aviso de copyright acima e este aviso de permissão devem ser incluídos em
 * todas as cópias ou partes substanciais do Software.
 *
 * O SOFTWARE É FORNECIDO "NO ESTADO EM QUE SE ENCONTRA", SEM NENHUM TIPO DE GARANTIA,
 * EXPRESSA OU IMPLÍCITA, INCLUINDO, MAS NÃO SE LIMITANDO ÀS GARANTIAS DE COMERCIALIZAÇÃO,
 * ADEQUAÇÃO A UM FIM ESPECÍFICO E NÃO VIOLAÇÃO. EM NENHUMA CIRCUNSTÂNCIA, OS AUTORES
 * OU PROPRIETÁRIOS DE DIREITOS DE AUTOR PODERÃO SER RESPONSABILIZADOS POR QUAISQUER
 * REIVINDICAÇÕES, DANOS OU OUTRAS RESPONSABILIDADES, QUER EM AÇÃO DE CONTRATO,
 * DELITO OU DE OUTRA FORMA, DECORRENTES DE, OU EM CONEXÃO COM O SOFTWARE OU O USO
 * OU OUTRAS NEGOCIAÇÕES NO PROGRAMAS.
 * ------------------------------------------------------------------------------------------
 * Projeto   : ValidaInput
 * Criado em : 01/11/2019
 * Autor     : Viniciusalopes (Vovolinux) <suporte@viniciusalopes.com.br>
 * Finalidade: Validar Strings por tipo de variável, validar menus de opções em um vetor e
 *             validar entradas numéricas em um determinado intervalo.
 * ------------------------------------------------------------------------------------------
 */
package exerciciosn2;

public class ValidaInput {

    /**
     * Verifica se o texto é uma string vazia (Sem caracteres válidos).
     *
     * O caractere de espaço ' ' _é considerado inválido.
     *
     * @param texto Texto a ser analisado.
     * @return true: string vazia; false: string não-vazia.
     */
    public static boolean string_vazia(String texto) {

        texto = texto.trim();

        if (texto.length() == 0) {
            return true;
        }
        return false;
    }

    /**
     * Verifica se o texto é uma string não-vazia com tamanho válido.
     *
     * @param texto Texto a ser analisado.
     * @param tamanho_minimo Menor tamanho válido.
     * @param tamanho_maximo Maior tamanho válido.
     * @return true: válida; false: inválida.
     */
    public static boolean string_valida(String texto, int tamanho_minimo, int tamanho_maximo) {

        texto = texto.trim();

        if (string_vazia(texto)) {
            return false;
        }

        if (texto.length() < tamanho_minimo || texto.length() > tamanho_maximo) {
            return false;
        }

        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia com tamanho válido, e se é uma opção
     * válida.
     *
     * @param texto Texto a ser analisado.
     * @param tamanho_minimo Menor tamanho válido.
     * @param tamanho_maximo Maior tamanho válido.
     * @param opcoes Vetor de opções válidas.
     * @param case_sensitive true: compara maiúsculas e minúsculas; false: ignora case.
     * @return true: opção válida; false: opção inválida.
     */
    public static boolean string_opcao_valida(String texto, int tamanho_minimo, int tamanho_maximo, String[] opcoes, boolean case_sensitive) {

        if (!string_valida(texto, tamanho_minimo, tamanho_maximo)) {
            return false;
        }

        if (opcoes.length > 0) {
            for (int i = 0; i < opcoes.length; i++) {
                if (case_sensitive) {
                    if (texto.equals(opcoes[i])) {
                        return true;
                    }
                } else {
                    if (texto.equalsIgnoreCase(opcoes[i])) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia, com apenas uma posição (1 caractere).
     *
     * @param texto Texto a ser analisado.
     * @return true: válido; false: inválido.
     */
    public static boolean char_valido(String texto) {

        texto = texto.trim();

        if (string_vazia(texto)) {
            return false;
        }

        if (texto.length() != 1) {
            return false;
        }

        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia, com uma posição, e se é uma opção
     * válida.
     *
     * @param texto Texto a ser analisado.
     * @param opcoes Vetor de opções válidas.
     * @param case_sensitive true: compara maiúsculas e minúsculas; false: ignora case.
     * @return true: opção válida; false: opção inválida.
     */
    public static boolean char_opcao_valida(String texto, char[] opcoes, boolean case_sensitive) {

        if (!char_valido(texto)) {
            return false;
        }

        if (opcoes.length > 0) {
            for (int i = 0; i < opcoes.length; i++) {
                if (case_sensitive) {
                    if (texto.charAt(0) == opcoes[i]) {
                        return true;
                    }
                } else {
                    if (texto.toLowerCase().charAt(0) == opcoes[i]
                            || texto.toUpperCase().charAt(0) == opcoes[i]) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia que possa ser convertida para um número
     * inteiro válido.
     *
     * @param texto Texto a ser analisado.
     * @return true: válido; false: inválido.
     */
    public static boolean int_valido(String texto) {

        texto = texto.trim();

        if (string_vazia(texto)) {
            return false;
        }

        try {
            Integer.parseInt(texto);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia que possa ser convertido para um número
     * inteiro, e se é uma opção válida.
     *
     * @param texto Texto a ser analisado.
     * @param opcoes Vetor de opções válidas.
     * @return true: opção válida; false: opção inválida.
     */
    public static boolean int_opcao_valida(String texto, int[] opcoes) {

        if (!int_valido(texto)) {
            return false;
        }

        if (opcoes.length > 0) {
            for (int i = 0; i < opcoes.length; i++) {
                if (Integer.parseInt(texto) == opcoes[i]) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia que possa ser convertido para um número
     * inteiro, e se o valor está contido em um intervalo.
     *
     * @param texto Texto a ser analisado.
     * @param minimo Menor valor válido.
     * @param maximo Maior valor válido.
     * @return true: no intervalo; false: fora do intervalo.
     */
    public static boolean int_no_intervalo(String texto, int minimo, int maximo) {

        if (!int_valido(texto)) {
            return false;
        }

        if (Integer.parseInt(texto) < minimo || Integer.parseInt(texto) > maximo) {
            return false;
        }

        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia que possa ser convertida para um número
     * decimal válido do tipo double.
     *
     * @param texto Texto a ser analisado.
     * @return true: válido; false: inválido.
     */
    public static boolean double_valido(String texto) {

        texto = texto.trim();

        if (string_vazia(texto)) {
            return false;
        }

        try {
            Double.parseDouble(texto);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia que possa ser convertida para um número
     * decimal válido do tipo double, e se o valor está contido em um intervalo.
     *
     * @param texto
     * @param minimo Menor valor válido.
     * @param maximo Maior valor válido.
     * @return true: no intervalo; false: fora do intervalo.
     */
    public static boolean double_no_intervalo(String texto, double minimo, double maximo) {

        if (!double_valido(texto)) {
            return false;
        }

        if (Double.parseDouble(texto) < minimo || Double.parseDouble(texto) > maximo) {
            return false;
        }

        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia que possa ser convertida para um número
     * decimal válido do tipo float.
     *
     * @param texto Texto a ser analisado.
     * @return true: válido; false: inválido.
     */
    public static boolean float_valido(String texto) {

        texto = texto.trim();

        if (string_vazia(texto)) {
            return false;
        }

        try {
            Float.parseFloat(texto);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    /**
     * Verifica se o texto é uma string não-vazia que possa ser convertida para um número
     * decimal válido do tipo float, e se o valor está contido em um intervalo.
     *
     * @param texto
     * @param minimo Menor valor válido.
     * @param maximo Maior valor válido.
     * @return true: no intervalo; false: fora do intervalo.
     */
    public static boolean float_no_intervalo(String texto, float minimo, float maximo) {

        if (!float_valido(texto)) {
            return false;
        }

        if (Float.parseFloat(texto) < minimo || Float.parseFloat(texto) > maximo) {
            return false;
        }

        return true;
    }
}
