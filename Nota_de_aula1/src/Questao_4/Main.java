package Questao_4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

// Elabore um programa que simule um sistema bancário de um cliente. Inicialmente o saldo
//está zerado, mas o cliente pode escolher qualquer uma das seguintes opções do menu:
// • Consultar saldo
// • Depositar
// • Sacar
// • Transferir
//Uma observação é que o cliente só pode sacar e transferir se o saldo da conta não estiver
//zerado.

    Scanner sc = new Scanner(System.in);
    Banco banco = new Banco();
    String r;
    do{
        System.out.println("Digite do 1 ao 4 para escolher sua operção | 1 - Consultar saldo 2 - Depositar 3 - Sacar 4 - Tranferir ");
        int x = sc.nextInt();
        switch(x){
            case 1:
            System.out.println("Consultar saldo");
            banco.consultar();
            break;
            case 2:
            System.out.println("Depositar: ");
            banco.receber = sc.nextDouble();
            banco.adicionar();
            break;
            case 3:
            System.out.println("Sacar");
            banco.sacar = sc.nextDouble();
            banco.tirar();
            break;
            case 4:
            System.out.println("Transferir");
            banco.trasferir = sc.nextDouble();
            banco.tirar();
            break;
        }
        System.out.println("Caso queira ver outra operação, Digite S");
        r = sc.next();
    }while(r.equalsIgnoreCase("S"));



    }
}
