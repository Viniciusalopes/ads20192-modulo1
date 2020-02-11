
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        
        if (cod == 1){System.out.printf("Total: R$ %.2f", (double)(qtd * 4.00));}
        else if (cod == 2){System.out.printf("Total: R$ %.2f", (double)(qtd * 4.50));}
        else if (cod == 3){System.out.printf("Total: R$ %.2f", (double)(qtd * 5.00));}
        else if (cod == 4){System.out.printf("Total: R$ %.2f", (double)(qtd * 2.00));}
        else if (cod == 5){System.out.printf("Total: R$ %.2f", (double)(qtd * 1.50));}
        
        
        
    }

}
