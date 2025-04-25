public final class Professor extends Pessoa implements Remuneravel{
    private String especialidade;
    public Cargo cargo;


    public Professor(String nome, int idade, Cargo cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Professor(String nome, int idade, String especialidade){
        super(nome,idade);
        this.especialidade = especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    @Override
    public String toString() {
        return super.toString()+"Professor{" +
                "especialidade = '" + especialidade + '\'' +
                '}';
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Meu nome é "+nome+" Sou um Professor");
    }

    @Override
    public void quemSouEu() {
        System.out.println("Estou ensinando Java para meus alunos");
    }

    @Override
    public void calcularSalario() {
        System.out.println("R$ 1.900");
    }

    @Override
    public void aplicarBonus() {
        System.out.println("R$ 2050");
    }
}
