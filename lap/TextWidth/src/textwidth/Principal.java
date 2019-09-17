/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 15/09/2019
 * Projeto   : TextWidth
 * Finalidade: Execução principal
 * ---------------------------------------------------------------------------------------
 */

package textwidth;

import bll.Bll;
import dao.Dao;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Bll.quebra_texto(Dao.getTexto(), 40));
    }
    
}
