package Questao_3;

public class Produto {
    String nome;
    int quant;
    double preco;
    int quant1;

    public void adicionar(){
        System.out.println(nome);
    }

    public void vender(){

        double cliente = preco*quant1;
        System.out.println("Valor total: "+cliente);


    }


}

