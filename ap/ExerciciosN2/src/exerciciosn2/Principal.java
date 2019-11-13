/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosn2;

import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vai();
    }

    private static void vai() {
        Scanner sc = new Scanner(System.in);
        String num;
        int n;
        boolean sair = false;

        do {
            System.out.print("\n"
                    + StringUtils.repete("-", 60)
                    + "\nExercícios N2 [1 ~ 61]\n"
                    + "Digite o número de um exercício ou 0 para sair > "
            );
            num = sc.nextLine();

            if (ValidaInput.int_no_intervalo(num, 0, 61)) {
                n = Integer.parseInt(num);
                if (n == 0) {
                    sair = true;
                }
                if (n > 0) {
                    executa(n);
                }
            } else {
                System.out.printf("'%s' não é uma opção. Tente outra vez...", num);
            }

        } while (!sair);
    }

    private static void executa(int exercicio) {
        String[] args = new String[0];

        switch (exercicio) {
            case 1:
                ExercicioN2_01.main(args);
                break;
            case 2:
                ExercicioN2_02.main(args);
                break;
            case 3:
                ExercicioN2_03.main(args);
                break;
            case 4:
                ExercicioN2_04.main(args);
                break;
            case 5:
                ExercicioN2_05.main(args);
                break;
            case 6:
                ExercicioN2_06.main(args);
                break;
            case 7:
                ExercicioN2_07.main(args);
                break;
            case 8:
                ExercicioN2_08.main(args);
                break;
            case 9:
                ExercicioN2_09.main(args);
                break;
            case 10:
                ExercicioN2_10.main(args);
                break;
            case 11:
                ExercicioN2_11.main(args);
                break;
            case 12:
                ExercicioN2_12.main(args);
                break;
            case 13:
                ExercicioN2_13.main(args);
                break;
            case 14:
                ExercicioN2_14.main(args);
                break;
            case 15:
                ExercicioN2_15.main(args);
                break;
            case 16:
                ExercicioN2_16.main(args);
                break;
            case 17:
                ExercicioN2_17.main(args);
                break;
            case 18:
                ExercicioN2_18.main(args);
                break;
            case 19:
                ExercicioN2_19.main(args);
                break;
            case 20:
                ExercicioN2_20.main(args);
                break;
            case 21:
                ExercicioN2_21.main(args);
                break;
            case 22:
                ExercicioN2_22.main(args);
                break;
            case 23:
                ExercicioN2_23.main(args);
                break;
            case 24:
                ExercicioN2_24.main(args);
                break;
            case 25:
                ExercicioN2_25.main(args);
                break;
            case 26:
                ExercicioN2_26.main(args);
                break;
            case 27:
                ExercicioN2_27.main(args);
                break;
            case 28:
                ExercicioN2_28.main(args);
                break;
            case 29:
                ExercicioN2_29.main(args);
                break;
            case 30:
                ExercicioN2_30.main(args);
                break;
            case 31:
                ExercicioN2_31.main(args);
                break;
            case 32:
                ExercicioN2_32.main(args);
                break;
            case 33:
                ExercicioN2_33.main(args);
                break;
//            case 34: ExercicioN2_34.main(args); break;
//            case 35: ExercicioN2_35.main(args); break;
//            case 36: ExercicioN2_36.main(args); break;
//            case 37: ExercicioN2_37.main(args); break;
//            case 38: ExercicioN2_38.main(args); break;
//            case 39: ExercicioN2_39.main(args); break;
//            case 40: ExercicioN2_40.main(args); break;
//            case 41: ExercicioN2_41.main(args); break;
//            case 42: ExercicioN2_42.main(args); break;
            case 43:
                ExercicioN2_43.main(args);
                break;
            case 44:
                ExercicioN2_44.main(args);
                break;
            case 45:
                ExercicioN2_45.main(args);
                break;
            case 46:
                ExercicioN2_46.main(args);
                break;
            case 47:
                ExercicioN2_47.main(args);
                break;
            case 48:
                ExercicioN2_48.main(args);
                break;
            case 49:
                ExercicioN2_49.main(args);
                break;
            case 50:
                ExercicioN2_50.main(args);
                break;
            case 51:
                ExercicioN2_51.main(args);
                break;
            case 52:
                ExercicioN2_52.main(args);
                break;
            case 53:
                ExercicioN2_53.main(args);
                break;
            case 54:
                ExercicioN2_54.main(args);
                break;
            case 55:
                ExercicioN2_55.main(args);
                break;
            case 56:
                ExercicioN2_56.main(args);
                break;
            case 57:
                ExercicioN2_57.main(args);
                break;
            case 58:
                ExercicioN2_58.main(args);
                break;
            case 59:
                ExercicioN2_59.main(args);
                break;
            case 60:
                ExercicioN2_60.main(args);
                break;
            case 61:
                ExercicioN2_61.main(args);
                break;
            default:
                System.out.println("O exercício não foi desenvolvido.");
        }
    }
}
