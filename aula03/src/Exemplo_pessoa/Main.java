package aula03.src.Exemplo_pessoa;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.println("nome:");
        p.nome = sc.next();

        System.out.println("idade:");
        p.idade = sc.nextInt();


        System.out.println(p.idade);
        System.out.println(p.nome);


      }
    }