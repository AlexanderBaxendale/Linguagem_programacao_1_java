package Exemplo_pessoa;

public class Pessoa {
    protected String nome;
    private String rg, email, cpf, telefone;
    protected int idade;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public void aniversario(){
        idade++;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade){
        this.idade = idade;

    }
    public int getIdade(){
        return idade;
    }
}
