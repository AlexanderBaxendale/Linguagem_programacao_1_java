package Exemplo_pessoa_metodos_de_acesso;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite seu Peso: ");
        p.setPeso(sc.nextDouble());


        System.out.println("Digite sua Altura: ");
        p.setAltura(sc.nextDouble());
        p.calcular_imc();
        System.out.println("Seu IMC é: "+p.getImc());


    }
}
