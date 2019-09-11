/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author vovostudio
 */
public class Util {
    private static String repete(String caractere, int quantidade) {
        String ret = "";
        for (int i = 0; i < quantidade; i++) {
            ret += caractere;
        }
        return ret;
    }
}
