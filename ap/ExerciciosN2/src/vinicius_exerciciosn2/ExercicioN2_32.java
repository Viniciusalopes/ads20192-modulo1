/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 28/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author vovox
 */
public class ExercicioN2_32 {

    public static void main(String[] args) {
        DecimalFormat p = new DecimalFormat(" #% ");
        Scanner desafio = new Scanner(System.in);
        // variavel de data de nascimento
        int dia_atual, mes_atual, ano_atual, idade = 0, homem = 0, mulher = 0, Outros_estados = 0;
        int cont_idade = 0, cont_mulher = 0, cont_fora_sp = 0, menores_de_25 = 0, cont_motorista = 0;
        

        // variavel de sexo
        // variavel de estado
        String Sao_paulo = "1", localidade, sexo, opcao = null;
        String data_nascimento = "";
        //entrada de dados 
        do {

            System.out.println();
            //data de nascimento
            System.out.println("======================================================================");
            System.out.println("--Departamento de Trânsito--");
            Calendar cal = GregorianCalendar.getInstance();
            dia_atual = cal.get(Calendar.DAY_OF_MONTH);
            mes_atual = cal.get(Calendar.MONTH);
            ano_atual = cal.get(Calendar.YEAR);
            System.out.println("Por favor insira a data de nascimento do usuario (dd/mm/aaaa):");
            data_nascimento = desafio.nextLine();
            
            // Integer.parseInt(string) = Converte uma string para inteiro
            // String.split(separador) = Cria um vetor com a string, delimitado pelo separador
            int dia_nasc = Integer.parseInt(data_nascimento.split("/")[0]);
            int mes_nasc = Integer.parseInt(data_nascimento.split("/")[1]);
            int ano_nasc = Integer.parseInt(data_nascimento.split("/")[2]);
            
            System.out.printf("A sua data de nascimento e %d/%d/%d \n", dia_nasc, mes_nasc, ano_nasc);
            idade = (ano_atual - ano_nasc);
            System.out.println("======================================================================");

            System.out.printf("O usuario tem %d anos de idade", idade);
            if (idade <= 25) {

                System.out.println(", o usuario e menor que 25");
                System.out.println("======================================================================");
                menores_de_25 = menores_de_25 + idade;

            } else {
                System.out.println(", o usuario e maior que 25");
                System.out.println("======================================================================");
            }
            //sexo do usuario       
            System.out.println();
            System.out.println("Por favor imforme o sexo do usuario : (mulher / homem)");
            sexo = desafio.nextLine();
            desafio.nextLine();
            if (sexo.equalsIgnoreCase("mulher")) {
                cont_mulher++;
            }

            cont_motorista++;

            //registro de localidade 
            System.out.println();
            System.out.println("De onde o usuario e ?(1 = Sao Paulo / 0 = outros estados");
            localidade = desafio.nextLine();

            if (localidade.equalsIgnoreCase("0")) {

                cont_fora_sp++;
            }

            //saida 
            System.out.println("Voce deseja continuar ?(sim/nao)");
            opcao = desafio.nextLine();

        } while (opcao.equalsIgnoreCase("sim"));
        System.out.println("Percentagem de motoristas com menos de 25 anos " + ((menores_de_25 / cont_motorista) * 100) + "%");
        System.out.println("Percentagem de mulheres " + ((cont_mulher / cont_motorista) * 100) + "%");
        System.out.println("Percentagem de motoristas com registro fora de São Paulo "
                + ((cont_fora_sp / cont_motorista) * 100) + "%");
        desafio.nextLine();
        System.out.println("======================================================================");
        System.out.println();
    }
}
