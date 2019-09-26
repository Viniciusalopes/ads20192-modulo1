package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio39mp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, ano, maior_dia = 31;
        String data = "    Data";

        System.out.println(data);

        System.out.println("Informe o Ano: ");
        ano = entrada.nextInt();

        if (ano <= 0) {
            System.out.println("Ano Ivalido");
        } else {
            System.out.println("Informe o Mês: ");
            mes = entrada.nextInt();
            if (mes > 0 && mes < 12) {
                System.out.println("Informe o Dia: ");
                dia = entrada.nextInt();
                switch (mes) {
                    case (1):
                        if (dia <= maior_dia && dia > 0) {
                            System.out.printf("Dia: %s, Mês: Janeiro e Ano: %s.\n", dia, ano);
                        } else {
                            System.out.println("Dia invalido!!!(Janeiro tem 31 dias.)");
                        }
                        break;
                    case (2):

                        if (ano % 400 == 0) {
                            if (dia <= 29 && dia > 0) {

                                System.out.printf("Dia: %s, Mês: Fevereiro e Ano: %s.\n", dia, ano);
                            } else {
                                System.out.println("Dia invalido!!! (Fevereiro de " + ano + " tem 29 dias.");
                            }
                        } else if (ano % 4 == 0 && ano % 100 != 0) {
                            if (dia <= 29 && dia > 0) {
                                System.out.printf("Dia: %s, Mês: Fevereiro e Ano: %s.\n", dia, ano);
                            } else {
                                System.out.println("Dia invalido!!! (Fevereiro de " + ano + " tem 29 dias.");
                            }
                        } else {

                            if (dia <= 28 && dia > 0) {

                                System.out.printf("Dia: %s, Mês: Fevereiro e Ano: %s.\n", dia, ano);
                            } else {
                                System.out.println("Dia invalido!!! (Fevereiro de " + ano + " tem 28 dias.");

                            }
                        }
                        break;
                    case (3):
                        if (dia <= maior_dia && dia > 0) {
                            System.out.printf("Dia: %s, Mês: Março e Ano: %s.\n", dia, ano);
                        } else {
                            System.out.println("Dia invalido!!!(Março tem 31 dias.)");
                        }
                        break;
                    case (4):
                        if (dia <= maior_dia - 1 && dia > 0) {
                            System.out.printf("Dia: %s, Mês: Abril e Ano: %s.\n", dia, ano);
                        } else {
                            System.out.println("Dia invalido!!!(Abril tem 30 dias)");
                        }
                        break;
                    case (5):
                        if (dia <= maior_dia && dia > 0) {

                            System.out.printf("Dia: %s, Mês: Maio e Ano: %s.\n", dia, ano);
                        } else {
                            System.out.println("Dia invalido!!!(Maio tem 31 dias.)");
                        }
                        break;
                    case (6):
                        if (dia <= maior_dia - 1 && dia > 0) {

                            System.out.printf("Dia: %s, Mês: Junho e Ano: %s.\n", dia, ano);
                        } else {
                            System.out.println("Dia invalido!!!(Junho tem 30 dias)");
                        }
                        break;
                    case (7):
                        if (dia <= maior_dia && dia > 0) {

                            System.out.printf("Dia: %s, Mês: Julho e Ano: %s.\n", dia, ano);

                        } else {
                            System.out.println("Dia invalido!!!(Julho tem 31 dias.)");
                        }
                        break;
                    case (8):
                        if (dia <= maior_dia && dia > 0) {

                            System.out.printf("Dia: %s, Mês: Agosto e Ano: %s.\n", dia, ano);

                        } else {
                            System.out.println("Dia invalido!!!(Agosto tem 31 dias.)");
                        }
                        break;
                    case (9):
                        if (dia <= maior_dia - 1 && dia > 0) {

                            System.out.printf("Dia: %s, Mês: Setembro e Ano: %s.\n", dia, ano);
                        } else {
                            System.out.println("Dia invalido!!!(Setembro tem 30 dias)");
                        }
                        break;
                    case (10):
                        if (dia <= maior_dia && dia > 0) {

                            System.out.printf("Dia: %s, Mês: Outubro e Ano: %s.\n", dia, ano);

                        } else {
                            System.out.println("Dia invalido!!!(Agosto tem 31 dias.)");

                        }
                        break;
                    case (11):
                        if (dia <= maior_dia - 1 && dia > 0) {

                            System.out.printf("Dia: %s, Mês: Novembro e Ano: %s.\n", dia, ano);

                        } else {
                            System.out.println("Dia invalido!!!(Novembro tem 30 dias)");
                        }
                        break;
                    case (12):
                        if (dia <= maior_dia && dia > 0) {

                            System.out.printf("Dia: %s, Mês: Dezembro e Ano: %s.\n", dia, ano);

                        } else {
                            System.out.println("Dia invalido!!!(Dezembro tem 31 dias.)");

                        }
                        break;
                    default:
                        System.out.printf("Mes invalido!!\n", dia, ano);

                        break;
                }
            } else {
                System.out.println("Mes invalido");

            }
        }
    }
}
