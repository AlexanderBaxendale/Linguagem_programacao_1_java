import java.util.Scanner;
public class Main{
    public static void main(String[]args) {

        int x = 1;
        int repetir = 0;
        do {
            System.out.println("caso escolha.....");
            switch (x) {
                case 0:
                    System.out.println("Opção 0 escolhido");
                    break;
                case 1:
                    System.out.println("opção 2 escolhida");
                    break;
                case 2:
                    System.out.println("Opação 3 escolhida");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
            System.out.print("para repetir,digite 0");
        }while(repetir == 0);
    }
}

