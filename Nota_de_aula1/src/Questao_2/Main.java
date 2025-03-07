package Questao_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

// 2 - Defina um sistema onde o usuário informe (na classe principal, através do teclado) qual
//opção deseja visualizar. Caso informe 1 ele vai ver a soma de dois números. Caso informe
//2, vai ver a subtração, 3 divisão e 4 multiplicação. Observação: Estas operações deverão
//ser realizadas em uma classe chamada Matemática.

        Scanner sc = new Scanner(System.in);
        Matematica mat = new Matematica();
        System.out.println("Super Calculadora");
        System.out.println("\nDigite o primeiro número: ");
        mat.n1 = sc.nextInt();
        System.out.println("Digite o Segundo Número: ");
        mat.n2 = sc.nextInt();

        System.out.println("Digite de 1 a 4 para realizar as operações aritimétrica");
        System.out.println("1 - Soma | 2 - Subtração | 3 - Multiplicação | 4 - Divisão");
        int x = sc.nextInt();
        switch(x){
            case 1:
                System.out.println("A soma de "+mat.n1+" + "+mat.n2+" é");
                mat.soma();
                break;
            case 2:
                System.out.println("A subtração de "+mat.n1+" - "+mat.n2+" é");
                mat.sub();
                break;
            case 3:
                System.out.println("A multiplicação de "+mat.n1+" * "+mat.n2+" é");
                mat.mult();
                break;
            case 4:
                System.out.println("A Divisão de "+mat.n1+" /"+mat.n2+" é");
                mat.div();
                break;
            default:
                System.out.println("Opção inválida");

        }
    }
}
