package Exemplo_pessoa_metodos_de_acesso;

public class Pessoa {
    private double peso;
    private double altura;
    private double imc;
    public double getImc() {
        return imc;
    }

    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;

    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public void calcular_imc(){
        imc = peso / (altura * altura);
    }

}
