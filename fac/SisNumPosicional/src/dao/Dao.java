/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author vovostudio
 */
public class Dao {

    // Variáveis ---------------------------------------------------------------
    // Lista de bases
    public static int[] base_id = {2, 8, 10, 16};
    public static String[] base_nome = {"Binária", "Octal", "Decimal", "Hexadecimal"};

    // Valores das bases
    public static char[] base2 = {'0', '1'};
    public static char[] base8 = {'0', '1', '2', '3', '4', '5', '6', '7'};
    public static char[] base10 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static char[] base16 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    // Conversões diretas de binário para octal/hexadecimal
    public static String[] binario_octal = {"000", "001", "010", "011", "100", "101", "110", "111"};
    public static String[] binario_hexadecimal = {
        "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
        "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    // Funçoes -----------------------------------------------------------------
    public static String get_octal(String binario) {
        String ret = "";
        for (int i = 0; i < binario_octal.length; i++) {
            if (binario_octal[i].equals(binario)) {
                ret = Character.toString(base8[i]);
                break;
            }
        }
        return ret;
    }

    public static int get_valor_do_hexadecimal(char hexadecimal) {
        int ret = 0;
        for (int i = 0; i < Dao.base16.length; i++) {
            if (Dao.base16[i] == hexadecimal) {
                ret = i;
                break;
            }
        }
        return ret;
    }

    public static String get_hexadecimal(String binario) {
        String ret = "";
        for (int i = 0; i < binario_hexadecimal.length; i++) {
            if (binario_hexadecimal[i].equals(binario)) {
                ret = Character.toString(base16[i]);
                break;
            }
        }

        return ret;
    }

    public static String get_base_nome(int id) {
        String ret = "";
        for (int i = 0; i < base_id.length; i++) {
            if (base_id[i] == id) {
                ret = base_nome[i];
                break;
            }
        }
        return ret;
    }

}
