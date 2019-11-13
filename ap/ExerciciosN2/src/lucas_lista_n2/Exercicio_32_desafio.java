/*
 32. O Departamento de Trânsito do Estado de São Paulo compilou dados de acidentes de
 tráfego no Estado no último ano. Para cada motorista envolvido num acidente, uma
 entrada de dados foi preparada com as seguintes informações:
 - ano de nascimento do motorista (numérico) ;
 - sexo (1-mulher, 2-homem);
 - código de registro (1 para São Paulo e 0 para qualquer outro registro ).
 Preparar um programa para ler um conjunto de dados e imprimir a seguinte estatística
 de motoristas envolvidos em acidentes:
 a) Percentagem de motoristas com menos de 25 anos;
 b) Percentagem de mulheres;
 c) Percentagem de motoristas com registro fora de São Paulo.
 */
package lucas_lista_n2;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * em desafios que se vence o mundo!
 */
public class Exercicio_32_desafio {

    public static void main(String[] args) {
        DecimalFormat p = new DecimalFormat(" #% ");
        Scanner desafio = new Scanner(System.in);
        // variavel de data de nascimento
        int dia_atual, mes_atual, ano_atual, idade = 0, homem = 0, mulher = 0, Outros_estados = 0;
        int cont_idade = 0, cont_mulher = 0, cont_estado = 0;
        // variavel de sexo
        // variavel de estado
        String Sao_paulo = "1", localidade, sexo, opcao = null;
        //entrada de dados 
        do {

            System.out.println();
            //data de nascuimento
            System.out.println("======================================================================");
            System.out.println("--Departamento de Trânsito--");
            Calendar cal = GregorianCalendar.getInstance();
            dia_atual = cal.get(Calendar.DAY_OF_MONTH);
            mes_atual = cal.get(Calendar.MONTH);
            ano_atual = cal.get(Calendar.YEAR);
            System.out.println("Por favor insira o dia , mes e ano do nascimento do usuario :");
            int dia_nasc = desafio.nextInt();
            int mes_nasc = desafio.nextInt();
            int ano_nasc = desafio.nextInt();
            System.out.printf("A sua data de nascimento e %d/%d/%d \n", dia_nasc, mes_nasc, ano_nasc);
            idade = (ano_atual - ano_nasc);
            System.out.println("======================================================================");

            System.out.printf("O usuario tem %d anos de idade", idade);
            if (idade <= 25) {

                System.out.println(", o usuario e menor que 25");
                System.out.println("======================================================================");

                cont_idade++;
            } else {
                System.out.println(", o usuario e maior que 25");
                System.out.println("======================================================================");
            }
            //sexo do usuario       
            System.out.println();
            System.out.println("Por favor imforme o sexo do usuario : (mulher / homem)");
            sexo = desafio.nextLine();
            desafio.nextLine();
            if (sexo.equalsIgnoreCase("homem")) {

            } else {
                cont_mulher++;
            }
            //registro de localidade 
            System.out.println();
            System.out.println("De onde o usuario e ?(1 = Sao Paulo / 0 = outros estados");
            localidade = desafio.nextLine();
            if (localidade.equalsIgnoreCase("1")) {

            }
            if (localidade.equalsIgnoreCase("0")) {

                cont_estado++;
            }

            //saida 
            System.out.println("Voce deseja continuar ?(sim/nao)");
            opcao = desafio.nextLine();

        } while (opcao.equalsIgnoreCase("sim"));
        System.out.println("Percentagem de motoristas com menos de 25 anos " + cont_idade + "%");
        System.out.println("Percentagem de mulheres " + cont_mulher + "%");
        System.out.println("Percentagem de motoristas com registro fora de São Paulo " + cont_estado + "%");
        desafio.nextLine();
        System.out.println("======================================================================");
        System.out.println();

    }
}
