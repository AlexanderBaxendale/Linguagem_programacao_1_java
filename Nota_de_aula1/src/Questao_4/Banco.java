package Questao_4;

 public class Banco {
    double saldo = 0;
    double receber;
    double sacar;
    double trasferir;
    double valor;


public void consultar(){

    System.out.println(valor);
}
 public void adicionar(){
     valor = receber + valor;


 }
 public void tirar(){
    if(valor > 0){
      valor = valor - sacar;

    }else{
        System.out.println("\nDesculpe, Saldo insuficinete");
    }

 }
}

