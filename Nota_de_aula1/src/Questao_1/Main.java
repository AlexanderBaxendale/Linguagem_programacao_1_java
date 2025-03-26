package Questao_1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

// 1 - Defina uma classe Aluno que faça o cadastro do nome e das 3 notas e a operação do cálculo
//da média. Ao final, exiba (na classe principal) a média. Em seguida, informe se ele está
//aprovado, reprovado ou na final. Se a média for >= 70 está aprovado, abaixo de 40 está
//reprovado, senão, está na final.

    Scanner sc = new Scanner(System.in);
    Aluno al = new Aluno();
    String x;

   do {
       System.out.println("Digite o nome do Aluno:");
       al.nome = sc.next();
       System.out.println("Digite a primeira nota: ");
       al.n1 = sc.nextDouble();
       System.out.println("Digite a Secunda nota:");
       al.n2 = sc.nextDouble();
       System.out.println("Digite a Terceira nota:");
       al.n3 = sc.nextDouble();
       System.out.println("Nome do aluno: ");
       al.nome_aluno();
       System.out.println("Média : ");
       al.media();


       if(al.total >= 7){
           System.out.println("O Aluno esta Aprovado!");
       }else if(al.total > 4){
           System.out.println("Aluno esta na Final");
       }else{
           System.out.println("O aluno esta Reprovado!");
       }

    System.out.println("Gostaria de adicionar outro aluno, Digite s");
    x = sc.next();

   }while (x.equalsIgnoreCase("s"));




    }

}
