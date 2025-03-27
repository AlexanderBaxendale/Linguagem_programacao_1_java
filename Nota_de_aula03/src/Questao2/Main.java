package Questao2;

public class Main {
    public static void main(String[] args){

        Clinica clinica = new Clinica("Roberto",true,false);
        Cirugiao cirugiao = new Cirugiao("Roberto",true);

        System.out.println("O Doutor "+clinica.getNome()+" estar examinando o paciente!");
        cirugiao.tratarpaciente();
        System.out.println("Esperer sair os resultados do examens para verificarmos a sua condição");
        cirugiao.fazerincisao();
        System.out.println("Antes de marcamos a incisão, primeiro teremos que ver os horarios disponiveis com o doutor "+clinica.getNome()+" , e ele " +
                "apenas atende hospital ("+ clinica.isTrabalhanoHospital()+")");
    }
}
