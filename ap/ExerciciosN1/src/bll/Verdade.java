/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 22/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

/**
 * @author vovolinux
 */
public class Verdade {

    public static void main(String[] args) {
        // Variáveis
        boolean copiar, aprender;

        copiar = false;

        // Entrada
        copiar = sua_atitude();

        // Processamento
        if (copiar) {
            aprender = false;
        } else {
            aprender = true;
        }
    }

    public static void kiss() {
        boolean aprender = !copiar();
    }

    public static boolean sua_atitude() {
        return copiar();
    }

    public static boolean copiar() {
        // return true;
        return false;
    }

}
