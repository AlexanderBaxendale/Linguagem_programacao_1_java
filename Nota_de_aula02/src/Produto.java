public class Produto {


    private String nome,cor;
    private int codigo, quantiade, quant_cliente;

    private double peso,valor;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantiade() {
        return quantiade;
    }

    public void setQuantiade(int quantiade) {
        this.quantiade = quantiade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setQuant_cliente(int quant_cliente){
        this.quant_cliente = quant_cliente;
    }
    public int getQuant_cliente(){
        return quant_cliente;
    }

    public void cliente(){
        quantiade -= quant_cliente;
    }
}


