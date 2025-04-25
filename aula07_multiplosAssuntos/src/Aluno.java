public final class Aluno extends Pessoa {
    private String matricula;
    public Cargo cargo;

    public Aluno(String nome, int idade, Cargo cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() +  "Aluno{" +
                "matricula ='" + matricula + '\'' +
                '}';
    }

    @Override
    public void quemSouEu() {
        System.out.println("meu nome é "+nome+" e sou um aluno");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Estou estundado Java");


    }
}
