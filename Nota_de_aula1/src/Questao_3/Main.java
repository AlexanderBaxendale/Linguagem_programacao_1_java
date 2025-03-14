package Questao_3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

// 3 - Crie uma classe chamada "Produto" que representará um produto com os atributos nome,
//preço e quantidade em estoque. Implemente métodos para adicionar estoque e vender
//unidades do produto. Na classe principal, crie um objeto Produto, realize operações de:
// • Adicionar estoque
// • Vender produtos
// • Exibir o estoque.

    Scanner sc = new Scanner(System.in);
    Produto produto = new Produto();

    String r;

    do {
        System.out.println("Digite do 1 ao 3 para escolher sua operção | 1 - Adiconar Produto 2 - Vender Produto 3- Ver Estoque");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Digite um Novo Produto: ");
                produto.nome = sc.next();
                System.out.println("Digite o preço do produto: ");
                produto.preco = sc.nextDouble();
                System.out.println("Digite a Quantidade desse produto: ");
                produto.quant = sc.nextInt();
                System.out.println("Produto Adicionado:");
                produto.adicionar();
                break;

            case 2:
                System.out.println("Digite a Quantidade do produto que será vendido: ");
                produto.quant1 = sc.nextInt();
                System.out.println("Produto Vendido: "+produto.nome);
                System.out.println("Quantidade sugerida: "+produto.quant1);
                produto.vender();
                break;
            case 3:
                System.out.println("Exibir Estoque");
                System.out.println("Produto: "+ produto.nome+" | Quantidade: "+(produto.quant - produto.quant1));
                break;
        }
       System.out.println("Caso queira ver outra operação, Digite S");
        r = sc.next();
    }while(r.equalsIgnoreCase("S"));



    }
}
