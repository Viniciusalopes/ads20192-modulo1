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
        
        String[] combina_numeros = Permutacoes.permuta(numeros);
        String base = "%@#&";
        String strA = "%@#%";
        String strB = "###&";
        String strAB = "%&#&%";
        String strAux = "";
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
            strAux = deNpara10(strAux, 4);
            intA = Integer.parseInt(strAux);

            strAux = strB;
            for (int j = 0; j < numeros.length; j++) {
                strAux = strAux.replace(simbolos[j], numeros[j]);
            }
            strAux = deNpara10(strAux, 4);
            intB = Integer.parseInt(strAux);

            strAux = strAB;
            for (int j = 0; j < numeros.length; j++) {
                strAux = strAux.replace(simbolos[j], numeros[j]);
            }
            strAux = deNpara10(strAux, 4);
            intAB = Integer.parseInt(strAux);

            if (intA + intB == intAB) {
                System.out.println("Opa... MacGyver is here!");
                System.out.println();
                System.out.println(combina_numeros[i]);
                for(int k = 0; k < numeros.length; k++){
                    if(numeros[k] == combina_numeros[i].charAt(k)){
                        //simbolos[k]
                    }
                }
                System.out.println();
                System.out.println(intA);
                System.out.println(intB);
                System.out.println(intAB);
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
