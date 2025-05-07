package Nota_de_aula02.src;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //    Utilizando conceitos de orientação a objetos, métodos e modificadores de acesso, crie:
//
//     Um sistema para controle de um produto com atributos código, nome, tamanho/peso, cor, valor e quantidade
//     no estoque.O sistema deve permitir o cadastro dos dados, além de realizar a venda e fazer o controle do
//     estoque.
//
//    Para o pagamento, temos os seguintes benefícios:
//      Pix, Espécie, Transferência ou Débito, 5 % de desconto.
//      Crédito, parcelar em 3 x sem juros.
//
//      Observação:Espécie, caso o valor pago seja maior que o valor do produto, informar o troco.

        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        String l;
        do{
            System.out.println("Menu de Funções: ");
            System.out.println("1 - Cadastro de Dados do Produto | 2 - Realizar Compra | 3 - Exibir Estoque");

            int x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Digite o nome do produto:");
                    produto.setNome(sc.next());
                    System.out.println("Digite código do produto:");
                    produto.setCodigo(sc.nextInt());
                    System.out.println("Digite tamanho/peso do produto");
                    produto.setPeso(sc.nextDouble());
                    System.out.println("Digite a cor do produto:");
                    produto.setCor(sc.next());
                    System.out.println("Digite o valor da unidade do  produto:");
                    produto.setValor(sc.nextDouble());
                    System.out.println("Digite a quantidade do produto: ");
                    produto.setQuantiade(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Qual a quantidade de produtos você deseja?:");
                    produto.setQuant_cliente(sc.nextInt());
                    System.out.println("Temos beneficios dependendo o tipo de pagamento, para compras no Pix, Espécie, Transferência ou Débito, 5 % de desconto " +
                            "e no crédito dividimos em 3x sem juros");
                    System.out.println("Qual a forma de pagamento: ");
                    System.out.println("1 - Pix | 2 - Débito | 3 - Transferência | 4 - Espécie | 5 - Crédito");
                    int pagamento = sc.nextInt();
                    if(pagamento >= 1 && pagamento < 4){
                        double desconto = (produto.getValor() - (produto.getValor()*0.05));
                        System.out.println("Cada unidade do produto sairá por "+desconto+" reais");
                        System.out.println("Valor total será de: "+desconto * produto.getQuant_cliente()+" reais");
                    }else if(pagamento == 5){
                        System.out.println("Cada parcela do produto sairá por "+(produto.getQuant_cliente() * produto.getValor())/3);

                    }else if (pagamento == 4){
                        System.out.println("Valor do Cliente: ");
                        double valor_cliente = sc.nextDouble();
                        double total = produto.getValor() * produto.getQuant_cliente();
                        if(valor_cliente > total){
                            System.out.println("Seu troco será de: "+(valor_cliente - total));
                        }else if(valor_cliente == total){
                            System.out.println("Compra finalizada");
                        }else{
                            System.out.println("Valor insuficiente");
                        }

                    }else {
                        System.out.println("Algo deu errado, tente novamente");
                    }
                    break;
                case 3:
                    produto.cliente();
                    System.out.println("Produto : "+produto.getNome()+" |  Quantidade: "+ produto.getQuantiade());
        }
        System.out.println("Caso deseja volta para o  menu digite v");
            l = sc.next();
        }while (l.equalsIgnoreCase("v"));
    }
}

