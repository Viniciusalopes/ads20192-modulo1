/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import app.App;
import dao.Dao;
import static dao.Dao.base16;
import static dao.Dao.base8;
import static dao.Dao.base_id;
import static dao.Dao.base_nome;
import static dao.Dao.binario_hexadecimal;
import static dao.Dao.binario_octal;

/**
 *
 * FONTES:
 * https://dicasdeprogramacao.com.br/as-10-conversoes-numericas-mais-utilizadas-na-computacao/
 */
public class Bll {

    public static String converte(String numero) {
        // Variáveis
        String ret, base_origem;
        ret = "";

        for (int i = 0; i < Dao.base_id.length; i++) {      // i == base_origem
            if (digitos_validos(numero, Dao.base_id[i])) {
                switch (Dao.base_id[i]) {
                    case 2:
                        base_origem = Dao.get_base_nome(2);
                        ret += base_origem + ": " + numero + "(2)\n";

                        ret += base_origem + " para " + Dao.get_base_nome(8) + "\t: "
                                + numero + "(" + 2 + ") = " + de2para8(numero) + "(8)\n";

                        ret += base_origem + " para " + Dao.get_base_nome(10) + "\t: "
                                + numero + "(" + 2 + ") = " + deNpara10(numero, 2) + "(10)\n";

                        ret += base_origem + " para " + Dao.get_base_nome(16) + "\t: "
                                + numero + "(" + 2 + ") = " + de2para16(numero) + "(16)\n";
                        break;
                    case 8:
                        base_origem = Dao.get_base_nome(8);
                        ret += base_origem + ": " + numero + "(8)\n";

                        ret += base_origem + " para " + Dao.get_base_nome(2) + "\t: "
                                + numero + "(" + 8 + ") = " + de8para2(numero) + "(2)\n";

                        ret += base_origem + " para " + Dao.get_base_nome(10) + "\t: "
                                + numero + "(" + 8 + ") = " + deNpara10(numero, 8) + "(10)\n";

                        ret += base_origem + " para " + Dao.get_base_nome(16) + "\t: "
                                + numero + "(" + 8 + ") = " + de8para16(numero) + "(16)\n";
                        break;
                    case 10:
                        base_origem = Dao.get_base_nome(10);
                        ret += base_origem + ": " + numero + "(10)\n";

                        ret += base_origem + " para " + Dao.get_base_nome(2) + "\t\t: "
                                + numero + "(" + 10 + ") = " + de10paraN(numero, 2) + "(2)\n";

                        ret += base_origem + " para " + Dao.get_base_nome(8) + "\t\t: "
                                + numero + "(" + 10 + ") = " + de10paraN(numero, 8) + "(8)\n";

                        ret += base_origem + " para " + Dao.get_base_nome(16) + "\t: "
                                + numero + "(" + 10 + ") = " + de10paraN(numero, 16) + "(16)\n";
                        break;

                    case 16:
                        base_origem = Dao.get_base_nome(16);
                        ret += base_origem + ": " + numero + "(16)\n";

                        ret += base_origem + " para " + Dao.get_base_nome(2) + "\t: "
                                + numero + "(" + 16 + ") = " + de16para2(numero) + "(2)\n";

                        ret += base_origem + " para " + Dao.get_base_nome(8) + "\t\t: "
                                + numero + "(" + 16 + ") = " + de16para8(numero) + "(8)\n";

                        ret += base_origem + " para " + Dao.get_base_nome(16) + "\t: "
                                + numero + "(" + 16 + ") = " + deNpara10(numero, 16) + "(10)\n";
                        break;
                    default:
                        break;
                }
            } else {
                ret += "O número '" + numero + "' não é válido na base " + Dao.base_id[i] + ".\n";
            }
        }

        return ret;
    }

    public static String de2para8(String numero) {
        String binario_em_trios, convertido;
        convertido = "";

        // Completa zeros à esquerda para formar trios completos
        binario_em_trios = App.repete('0', (int) (numero.length() % 3)) + numero;

        for (int i = 0; i < binario_em_trios.length(); i++) {
            if (i % 3 == 0) { // Só em multiplos de 3 para andar de 3 em 3
                // adiciona o octal correspondente ao trio binário
                convertido += Dao.get_octal(binario_em_trios.substring(i, 3));
            }
        }

        return convertido;
    }

    public static String de2para16(String numero) {
        String binario_em_quartetos, convertido;
        convertido = "";

        // Completa zeros à esquerda para formar quartetos completos
        binario_em_quartetos = App.repete('0', (int) (numero.length() % 4)) + numero;

        for (int i = 0; i < binario_em_quartetos.length(); i++) {
            if (i % 4 == 0) { // Só em multiplos de 4 para andar de 4 em 4
                // adiciona o hexadecimal correspondente ao quarteto binário
                convertido += Dao.get_hexadecimal(binario_em_quartetos.substring(i, 4));
            }
        }

        return convertido;
    }

    public static String de8para2(String numero) {
        String convertido = "";
        for (int i = 0; i < numero.length(); i++) {
            convertido += de10paraN(numero.substring(i, 1), 2);
        }
        return convertido;
    }

    public static String de8para16(String numero) {
        String convertido = deNpara10(numero, 8);
        return de10paraN(convertido, 16);
    }

    public static String de16para2(String numero) {
        String convertido = deNpara10(numero, 16);
        return de10paraN(convertido, 2);
    }

    public static String de16para8(String numero) {
        String convertido = deNpara10(numero, 16);
        return de10paraN(convertido, 8);
    }

    public static String deNpara10(String numero, int N) {
        int posicao, valor, soma;
        posicao = numero.length() - 1;
        soma = 0;

        for (int i = 0; i < numero.length(); i++) {
            if (N == 16) { // Base 16 tem letras
                valor = Dao.get_valor_do_hexadecimal(numero.charAt(i));
            } else {
                valor = Character.getNumericValue(numero.charAt(i));
            }
            // soma = N*charAt(i)^posicao
            soma += (int) N * Math.pow(valor, posicao);
            posicao--; // Decrementa posicao
        }
        return Integer.toString(soma);
    }

    public static String de10paraN(String numero, int N) {
        String convertido;
        int resto, dividendo;
        convertido = "";
        dividendo = Integer.parseInt(numero); // string para int

        while (dividendo > 0) {
            resto = dividendo % N;
            // Adiciona digito ao início da string convertido
            if (N == 16) { // Base 16 tem letras
                convertido += Character.toString(Dao.base16[resto]);
            } else {
                convertido += Integer.toString(resto) + convertido;
            }
            dividendo /= N; // dividendo = resultado da divisão
        }
        return convertido;
    }

    public static boolean digitos_validos(String numero, int base) {
        boolean encontrei;
        char[] digitos;
        switch (base) {
            case 2:
                digitos = Dao.base2;
                break;
            case 8:
                digitos = Dao.base8;
                break;
            case 10:
                digitos = Dao.base10;
                break;
            default: //case 16:
                digitos = Dao.base16;
                break;
        }
        for (int i = 0; i < numero.length(); i++) {
            encontrei = false;
            for (int j = 0; j < digitos.length; j++) {
                if (numero.charAt(i) == digitos[j]) {
                    encontrei = true;
                }
            }
            if (!encontrei) {
                // Retorna false caso um dígito não exista no array de dígitos da base
                return false;
            }
        }
        return true;
    }

}
