package Calculadora;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Escolhas dois numeros para a calculadora!");
        System.out.println("Número 1:");
        n1 = sc.nextInt();
        System.out.println("Número 2:");
        n2 = sc.nextInt();

        System.out.println("Digite 0 - Soma | 1 - Multiplicação | 2 - Subtração | 3 - Divisão");
        int x = sc.nextInt();
            switch(x){
                case 0:
                    System.out.println(c.somar(n1,n2));
                    break;
                case 1:
                    System.out.println("\nResultado da Multiplicação: "+c.mult(n1,n2));
                    break;
                case 2:
                    System.out.println("\nResultado da Subtração: "+ c.sub(n1,n2));
                    break;
                case 3:
                    System.out.println("Resultado da Divisão: "+c.divisao(n1,n2));
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
            System.out.println("para Repetir digite S");
            String y = sc.next();
        



    }
}
