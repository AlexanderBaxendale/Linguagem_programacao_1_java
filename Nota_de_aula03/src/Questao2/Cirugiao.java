package Questao2;

public class Cirugiao extends Medico{
    public Cirugiao(String nome, boolean trhospital) {
        super(nome, trhospital);
    }

    public void tratarpaciente(){
        System.out.println("O paciente terá que passar por uma Bateria de exames");
    }

    public void fazerincisao(){
        System.out.println("Devido ao resultado dos exames será nessecario uma incisão!");
    }
}
