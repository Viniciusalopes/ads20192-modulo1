/*
 Faça um programa para realização do login em um sistema. O algoritmo deverá receber
 um login (cadeia de caracteres) e uma senha baseada em números inteiros. Em seguida
 o algoritmo deverá verificar a senha digitada, caso ela esteja correta o sistema deverá
 mostrar a seguinte mensagem: “BEM-VINDO AO SISTEMA, login”. Caso a senha
 esteja incorreta a seguinte mensagem deverá ser apresentada: “SENHA INCORRETA,
 TENTE NOVAMENTE”. Foi estipulado um limite de 3 tentativas para digitação da
 senha, caso o usuário ultrapasse esse limite, o sistema deverá bloquear o acesso com a
 seguinte mensagem: “ACESSO BLOQUEADO, PROCURE UM MODERADOR!”.
 */
package exerciciosn2;

import java.util.Scanner;

public class Exercicio_20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String login;
        int senha1, senha2, tentativa;
        //iniciando variaveis
        tentativa = 0;
        //cadastro do login
        System.out.print(" Porfavor insira o seu login: ");
        login = entrada.nextLine();
        //cadastro de senha  
        System.out.print(" senha: ");
        senha1 = entrada.nextInt();
        do {    // } while (senha1 != senha2 && tentativas < 3);
            // Entrada da senha2
            System.out.print(" Digite a senha novamente: ");
            senha2 = entrada.nextInt();
            if (senha1 != senha2) {
                // Senha incorreta
                System.out.println(" SENHA INCORRETA, TENTE NOVAMENTE.");
                tentativa++;
            } else {
                // Saída senha correta
                System.out.printf(" BEM-VINDO AO SISTEMA, %s.\n", login);
            }

            if (tentativa == 3) {
                System.out.println(" ACESSO BLOQUEADO, PROCURE UM MODERADOR!");
            }
        } while (senha1 != senha2 && tentativa < 3);
    }
}
