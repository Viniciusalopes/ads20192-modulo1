/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasderepeticao;

import java.util.Random;

/**
 *
 * @author vovostudio
 */
public class LoopInfinito {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        String txt = "";
        Random gerador = new Random();
        int cont = 0;

        // Saída
        System.out.println();
        while (true) {
            if (cont == 20) {
                txt += "\n";
                //System.out.print("\n");
                cont = 0;
            }
            cont++;
            txt += Integer.toString(gerador.nextInt(999)) + "\t";
            System.out.print(Integer.toString(gerador.nextInt(999)) + "\t");
            System.out.print(txt);
        }

    }
}
