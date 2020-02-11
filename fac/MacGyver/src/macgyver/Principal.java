/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macgyver;

import permutacoes.Permutacoes;

/**
 *
 * @author vovomint
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //    % @ # %
        //    # # # &
        //  ---------
        //  % & # & %

        char numeros[] = {'0', '1', '2', '3'};
        char simbolos[] = {'%', '@', '#', '&'};
        char[] simbolos_valores = new char[4];

        String[] combina_numeros = Permutacoes.permuta(numeros);
        String base = "%@#&";
        String strA = "%@#%";
        String strB = "###&";
        String strAB = "%&#&%";
        String strAux = "";
        String a4, b4, ab4;
        a4 = b4 = ab4 = "";

        int intA, intB, intAB;
        intA = intB = intAB = 0;

        for (int i = 0; i < combina_numeros.length; i++) { // para cada combinação
            strAux = base;
            // Substitui sequencia de numeros pela combinacao[i]
            for (int j = 0; j < combina_numeros[i].length(); j++) {
                numeros[j] = combina_numeros[i].charAt(j);
            }

            // decode
            strAux = strA;
            for (int j = 0; j < numeros.length; j++) {
                strAux = strAux.replace(simbolos[j], numeros[j]);
            }
            a4 = strAux;
            strAux = deNpara10(strAux, 4);
            intA = Integer.parseInt(strAux);

            strAux = strB;
            for (int j = 0; j < numeros.length; j++) {
                strAux = strAux.replace(simbolos[j], numeros[j]);
            }
            b4 = strAux;
            strAux = deNpara10(strAux, 4);
            intB = Integer.parseInt(strAux);

            strAux = strAB;
            for (int j = 0; j < numeros.length; j++) {
                strAux = strAux.replace(simbolos[j], numeros[j]);
            }
            ab4 = strAux;
            strAux = deNpara10(strAux, 4);
            intAB = Integer.parseInt(strAux);

            if (intA + intB == intAB) {
                System.out.println("Opa... MacGyver is here!");
                System.out.println();
                //System.out.println(combina_numeros[i]);
                //System.out.println(base);
                //System.out.println();

                // Ordena simbolos
                for (int j = 0; j < combina_numeros[i].length(); j++) {
                    int indice = Character.getNumericValue(combina_numeros[i].charAt(j));
                    simbolos_valores[indice] = simbolos[j];
                }

                // Imprime na ordem
                for (int j = 0; j < simbolos_valores.length; j++) {
                    System.out.println(simbolos_valores[j] + " = " + j);
                }
                //    % @ # %
                //    # # # &
                //  ---------
                //  % & # & %       
                // Exibe contas
                System.out.println();
                System.out.println("MacGyver\tbase(4)\t\tDecimal");
                System.out.println("  % @ # %\t "+a4+"\t\t" + intA);
                System.out.println("  # # # &\t "+b4+"\t\t" + intB + " + ");
                System.out.println("  -------\t-----\t\t" + "-----");
                System.out.println("% & # & %\t"+ab4+"\t\t" + intAB);
                break;
            }

        }

    }

    public static String deNpara10(String numero, int N) {
        long posicao, valor, soma;
        posicao = numero.length() - 1;
        soma = 0;

        for (int i = 0; i < numero.length(); i++) {
            valor = Character.getNumericValue(numero.charAt(i));
            // soma = N*charAt(i)^posicao
            soma += valor * Math.pow(N, posicao);
            posicao--; // Decrementa posicao
        }
        return Long.toString(soma);
    }
}
