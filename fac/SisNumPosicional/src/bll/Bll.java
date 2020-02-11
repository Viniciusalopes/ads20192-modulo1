/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import app.App;
import dao.*;

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
                        ret += Dao.get_base_nome(2) + ": " + numero + "(2)\n";

                        ret += "Para " + Dao.get_base_nome(8) + "\t: "
                                + numero + "(" + 2 + ") = " + de2para8(numero) + "(8)\n";

                        ret += "Para " + Dao.get_base_nome(10) + "\t: "
                                + numero + "(" + 2 + ") = " + deNpara10(numero, 2) + "(10)\n";

                        ret += "Para " + Dao.get_base_nome(16) + ": "
                                + numero + "(" + 2 + ") = " + de2para16(numero) + "(16)\n";
                        break;
                    case 8:
                        ret += Dao.get_base_nome(8) + ": " + numero + "(8)\n";

                        ret += "Para " + Dao.get_base_nome(2) + "\t: "
                                + numero + "(" + 8 + ") = " + de8para2(numero) + "(2)\n";

                        ret += "Para " + Dao.get_base_nome(10) + "\t: "
                                + numero + "(" + 8 + ") = " + deNpara10(numero, 8) + "(10)\n";

                        ret += "Para " + Dao.get_base_nome(16) + ": "
                                + numero + "(" + 8 + ") = " + de8para16(numero) + "(16)\n";
                        break;
                    case 10:
                        ret += Dao.get_base_nome(10) + ": " + numero + "(10)\n";

                        ret += "Para " + Dao.get_base_nome(2) + "\t: "
                                + numero + "(" + 10 + ") = " + de10paraN(numero, 2) + "(2)\n";

                        ret += "Para " + Dao.get_base_nome(8) + "\t: "
                                + numero + "(" + 10 + ") = " + de10paraN(numero, 8) + "(8)\n";

                        ret += "Para " + Dao.get_base_nome(16) + ": "
                                + numero + "(" + 10 + ") = " + de10paraN(numero, 16) + "(16)\n";
                        break;

                    case 16:
                        ret += Dao.get_base_nome(16) + ": " + numero + "(16)\n";

                        ret += "Para " + Dao.get_base_nome(2) + "\t: "
                                + numero + "(" + 16 + ") = " + de16para2(numero) + "(2)\n";

                        ret += "Para " + Dao.get_base_nome(8) + "\t: "
                                + numero + "(" + 16 + ") = " + de16para8(numero) + "(8)\n";

                        ret += "Para " + Dao.get_base_nome(10) + "\t: "
                                + numero + "(" + 16 + ") = " + deNpara10(numero, 16) + "(10)\n";
                        break;
                    default:
                        break;
                }
            } else {
                ret += "O número '" + numero + "' não é válido no sistema de base " + Dao.get_base_nome(Dao.base_id[i]) + ".\n";
            }
            ret += "\n";

        }
        return ret;
    }

    public static String de2para8(String numero) {
        String trios, convertido;
        convertido = "";

        // Completa zeros à esquerda para formar trios completos
        trios = App.repete('0', 3 - (numero.length() % 3)) + numero;

        for (int i = 0; i < trios.length(); i++) {
            if (i % 3 == 0) { // Só em multiplos de 3 para andar de 3 em 3
                // adiciona o octal correspondente ao trio binário
                convertido += deNpara10(trios.substring(i, i + 3), 2);
            }
        }
        return convertido;
    }

    public static String de2para16(String numero) {
        String quartetos, convertido;
        convertido = "";
        int decimal;
        // Completa zeros à esquerda para formar quartetos completos
        quartetos = App.repete('0', 4 - (numero.length() % 4)) + numero;

        for (int i = 0; i < quartetos.length(); i++) {
            if (i % 4 == 0) { // Só em multiplos de 4 para andar de 4 em 4
                decimal = Integer.parseInt(deNpara10(quartetos.substring(i, i + 4), 2));
                // adiciona o hexadecimal correspondente ao quarteto binário
                if (decimal > 9) {
                    convertido += Character.toString(Dao.base16[decimal]);
                } else {
                    convertido += Integer.toString(decimal);
                }
            }
        }
        return convertido;
    }

    public static String de8para2(String numero) {
        //  1 000 000 001 001 000 001 001 001 000 001
        //001 000 000 001 001 000 001 001 001 000 001 
        String convertido, digito, binario;
        convertido = "";

        for (int i = 0; i < numero.length(); i++) {
            digito = numero.substring(i, i + 1);
            binario = de10paraN(digito, 2);
            convertido += App.repete('0', 3 - binario.length()) + de10paraN(digito, 2) + " ";
        }
        return convertido;
    }

    public static String de8para16(String numero) {
        String convertido = deNpara10(numero, 8);
        return de10paraN(convertido, 16);
    }

    public static String de16para2(String numero) {
        //    1 0000 0000 0001 0001 0000 0001 0001 0001 0000 0001
        // 0001 0000 0000 0001 0001 0000 0001 0001 0001 0000 0001 
        String convertido = "";
        for (int i = 0; i < numero.length(); i++) {
            for (int j = 0; j < Dao.base16.length; j++) {
                if (numero.charAt(i) == Dao.base16[j]) {
                    convertido += Dao.binario_hexadecimal[j] + " ";
                }
            }
        }
        return convertido;
    }

    public static String de16para8(String numero) {
        // 20002100210401
        String convertido = de16para2(numero).replace(" ", "");
        return de2para8(convertido);
    }

    public static String deNpara10(String numero, int N) {
        long posicao, valor, soma;
        posicao = numero.length() - 1;
        soma = 0;

        for (int i = 0; i < numero.length(); i++) {
            if (N == 16) { // Base 16 tem letras
                valor = Dao.get_valor_do_hexadecimal(numero.charAt(i));
            } else {
                valor = Character.getNumericValue(numero.charAt(i));
            }
            // soma = N*charAt(i)^posicao
            soma += valor * Math.pow(N, posicao);
            posicao--; // Decrementa posicao
        }
        return Long.toString(soma);
    }

    public static String de10paraN(String numero, int N) {
        String convertido;
        long resto, dividendo;
        convertido = "";

        dividendo = Long.parseLong(numero); // string para long

        if (dividendo == 0) {
            // Se numero == "0"
            convertido = "0";
        } else {

            while (dividendo > 0) {
                resto = (long) dividendo % N;
                // Adiciona digito ao início da string convertido
                if (N == 16) { // Base 16 tem letras
                    convertido = Character.toString(Dao.base16[(int) resto]) + convertido;
                } else {
                    convertido = Integer.toString((int) resto) + convertido;
                }

                dividendo /= N; // dividendo = resultado da divisão
            }
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
