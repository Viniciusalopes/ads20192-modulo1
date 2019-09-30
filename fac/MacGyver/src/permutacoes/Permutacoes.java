/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutacoes;

/**
 *
 * FONTE:
 * https://www.devmedia.com.br/permutacoes-de-objetos-um-algoritmo-recursivo-em-java/27512
 */
/**
 * Esta classe gera e imprime as diferentes permutações de n objetos
 *
 */
public class Permutacoes {

    //numero da permutacao atual
    private static int cont = 0;

    //armazena a permutacao corrente
    private static char[] p;

    /**
     * metodo principal: recebe o vetor cujos elementos que serao permutados
     *
     * @param vet
     */
    public static char[] permuta(char[] vet) {

        p = new char[vet.length];
        permuta(vet, 0);
        return p;
    }

    /**
     * método recursivo que implementa as permutacoes
     *
     * @param vet
     * @param n
     */
    private static char[] permuta(char[] vet, int n) {

        if (n == vet.length) {
            cont++;
            //imprime();

        } else {

            for (int i = 0; i < vet.length; i++) {

                boolean achou = false;

                for (int j = 0; j < n; j++) {

                    if (p[j] == vet[i]) {
                        achou = true;
                    }
                }

                if (!achou) {

                    p[n] = vet[i];
                    permuta(vet, n + 1);
                }

            } //--for

        } //--if/else
        return p;

    } //--permuta

    /**
     * imprime a permutacao corrente
     */
    private static void imprime() {

        System.out.println();
        System.out.print("(" + cont + ") : ");
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + " ");
        }

    } //--imprime
    
    
    /**
     * metodo principal para teste da classe
     */
//    public static void main(String[] args) {
//
//        char v[] = {'A', 'B', 'C', 'D'};
//        Permutacoes.permuta(v);
//    }
}
