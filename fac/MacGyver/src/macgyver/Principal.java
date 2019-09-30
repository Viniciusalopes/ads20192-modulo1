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
        char[] combina_numeros = Permutacoes.permuta(numeros);
        char[] combina_simbolos = Permutacoes.permuta(simbolos);


    }
}
