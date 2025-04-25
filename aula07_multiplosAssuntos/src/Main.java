import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Disciplina d = new Disciplina();
        Professor p = new Professor("alexander",30,"Pro");
        Aluno a = new Aluno("Carlos",14,"2050");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Disciplinar: ");
        d.setNome(sc.next());

        d.cadastraAluno(a);
        d.ministraDisciplina(p);

        System.out.println("informações da Disciplina: ");
        System.out.println(d);

        System.out.println("\nInformação do Aluno:\n");
        a.quemSouEu();
        a.minhaAtividade();
        System.out.println("\nInformação do professor:\n");
        p.quemSouEu();
        p.minhaAtividade();

        p.setCargo(Cargo.Professor);
        System.out.println(p.getCargo());

        System.out.println("Informação do Salário professor:");
        p.calcularSalario();
        System.out.println("Informação do Salário com bônus do professor:");
        p.aplicarBonus();

    }
}
