import java.util.Scanner;
public class questão1 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite 1- Nome Completo, 2- Idade ou 3- Altura: ");
        int controle = sc.nextInt();
        do{

            switch (controle) {
                case 0:
                System.out.println(" 1 -Digite Nome Completo: ");
                String nome = sc.nextLine();
                break;
                case 1:
                    System.out.println("2 - Digite Idade:");
                    int ida = sc.nextInt();
                    break;
                case 2:
                    System.out.println("3 - Digite Altura: ");
                    double alt = sc.nextDouble();
                    break;
            }
        } while (controle >= 0);




    }
}
