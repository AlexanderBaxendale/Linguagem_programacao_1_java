package aula03.src.Exemplo_pessoa_comHeranca;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno a = new Aluno("João", 1123);
        Aluno a2 = new Aluno("Maria", 1223, 1,1);

        System.out.println("Nome:"+a2.getNome());
        System.out.println("Matricula"+a2.getMatricula());
        System.out.println("nota 1: "+a2.getNota1());
        System.out.println("nota 2");

        int x = sc.nextInt();
        System.out.println("Para Cadastra um Aluno, digite 1 | Caso queira Cadastra Professor digite 2 | Caso queira cadastra outra Pessoa digite 3");
        switch(x){
            case 1:
                System.out.println("Digite seu Nome:");
                a.setNome(sc.next());
                System.out.println("Nome:"+a.getNome());
                System.out.println("Digite seu rg:");
                a.setRg(sc.next());
                System.out.println("RG"+a.getRg());
                System.out.println("Digite Seu email:");
                a.setEmail(sc.next());
                System.out.println(a.getEmail());
                System.out.println("Digite Seu cpf:");
                a.setCpf(sc.next());
                System.out.println(a.getCpf());
                System.out.println("Digite Seu Telefone:");
                a.setTelefone(sc.next());
                System.out.println(a.getTelefone());
                System.out.println("Digite Sua idade:");
                a.setIdade (sc.nextInt());
                System.out.println(a.getIdade());
                System.out.println("Digite a primeira nota");
                a.setNota1(sc.nextDouble());
                System.out.println("Digite a Segunda nota");
                a.setNota2(sc.nextDouble());
                System.out.println("Digite a Terceira nota");
                a.setNota3(sc.nextDouble());
                System.out.println("A Media do aluno foi: ");
                a.calcularMedia();

            case 2:
                System.out.println("Nome:");
                a.setNome(sc.next());
                System.out.println(a.getNome());
                System.out.println("rg:");
                a.setRg(sc.next());
                System.out.println(a.getRg());
                System.out.println("email:");
                a.setEmail(sc.next());
                System.out.println(a.getEmail());
                System.out.println("cpf:");
                a.setCpf(sc.next());
                System.out.println(a.getCpf());
                System.out.println("Telefone:");
                a.setTelefone(sc.next());
                System.out.println(a.getTelefone());
                System.out.println("idade:");
                a.setIdade (sc.nextInt());
                System.out.println(a.getIdade());

            case 3:
                System.out.println("Nome:");
                a.setNome(sc.next());
                System.out.println(a.getNome());
                System.out.println("rg:");
                a.setRg(sc.next());
                System.out.println(a.getRg());
                System.out.println("email:");
                a.setEmail(sc.next());
                System.out.println(a.getEmail());
                System.out.println("cpf:");
                a.setCpf(sc.next());
                System.out.println(a.getCpf());
                System.out.println("Telefone:");
                a.setTelefone(sc.next());
                System.out.println(a.getTelefone());
                System.out.println("idade:");
                a.setIdade (sc.nextInt());
                System.out.println(a.getIdade());

        }



      }
    }