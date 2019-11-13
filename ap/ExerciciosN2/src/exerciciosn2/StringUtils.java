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
 * Finalidade: Manipulação de strings
 * ------------------------------------------------------------------------------------------
 */
package exerciciosn2;

public class StringUtils {

    /**
     * Repete um texto n vezes.
     *
     * @param texto Texto a ser repetido
     * @param quantidade Quantidade de repetições do texto
     * @return texto * n
     */
    public static String repete(String texto, int quantidade) {
        String ret = "";
        for (int i = 0; i < quantidade; i++) {
            ret += texto;
        }
        return ret;
    }

    /**
     * Formata a string completando caracteres à esquerda
     *
     * @param texto String a ser formatada
     * @param caractere char de preenchimento à esquerda
     * @param tamanho Tamanho final da String de retorno
     * @return Texto formatado no tamanho
     */
    public static String pad_left(String texto, char caractere, int tamanho) {
        return repete(Character.toString(caractere), tamanho - (texto.trim().length())) + texto.trim();
    }

    /**
     * Formata a string completando caracteres à direita
     *
     * @param texto String a ser formatada
     * @param caractere char de preenchimento à direita
     * @param tamanho Tamanho final da String de retorno
     * @return Texto formatado no tamanho
     */
    public static String pad_right(String texto, char caractere, int tamanho) {
        return texto.trim() + repete(Character.toString(caractere), tamanho - (texto.trim().length()));
    }

    /**
     * Formata uma String centralizando o texto
     *
     * @param texto String a ser formatada
     * @param caractere char de preenchimento à esquerda e à direita
     * @param tamanho Tamanho final da string de retorno
     * @return texto formatado no tamanho e centralizado
     */
    public static String text_center(String texto, char caractere, int tamanho) {
        // Tamanho do texto do título a ser impresso
        texto = texto.trim();
        if (texto.length() > tamanho) {
            // Trunca o texto e acrescenta reticencias
            texto = texto.substring(0, texto.length() - 4) + "...";
        }

        int espacos = tamanho - texto.length();
        int ee, ed; // ee: espaços esquerda; ed: espaços direita
        ee = espacos / 2;
        ed = espacos - ee;

        return repete(" ", ee) + texto + repete(" ", ed);
    }

    /**
     * Formata texto com alinhamento
     *
     * @param texto Texto a ser formatado
     * @param caractere char de preenchimento até o tamanho
     * @param tamanho Tamanho final da string de retorno
     * @param alinhamento e=Esquerda, d=Direita, c ou ""= Centralizado
     * @return String alinhada de acordo com os parametros.
     */
    public static String alinha_texto(String texto, char caractere, int tamanho, char alinhamento) {
        if (alinhamento == 'e') {
            return pad_right(texto, caractere, tamanho);
        } else if (alinhamento == 'd') {
            return pad_left(texto, caractere, tamanho);
        } else {
            return text_center(texto, caractere, tamanho);
        }
    }
}
