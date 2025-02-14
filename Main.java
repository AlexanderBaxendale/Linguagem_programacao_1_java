public class Main {
   public static void main(String[] args) {

       int num1 = 2;
       int num2 = 10;
       int soma;
       int sub;
       int mult;
       int div;


       sub = num1 - num2;
       mult = num1*num2;
       div = num2/num1;
       soma = num1+num2;


       System.out.println(soma);
       System.out.println(sub);
       System.out.println(mult);
       System.out.println(div);
       System.out.println("-----------------------------");

       if (num1>num2) {
           System.out.println("é menor");
       } else if(num1==num2) {
           System.out.println("é igual");
       }else{
           System.out.println("é maior");
       }
       System.out.println("-----------------------------");
       System.out.println("-----------------------------");
       System.out.println("exercicios aula 1");
       //questão 1
       int h_trabalhado = 15;
       int total_horas = 40;
       int salario = h_trabalhado*total_horas;

       System.out.println(salario);

        //questão 2

       int val1 = 35;
       int val2 = 20;

       if (val1>val2){
           System.out.println("é maior");
       }else if (val1==val2){
           System.out.println("é igual");
       }else{
           System.out.println("é menor");
       }

       //questão 3

       int nota1 = 10;
       int nota2 = 10;
       int nota3 = 6;
       int media_final = (nota1+nota2+nota3)/3;

       System.out.println(media_final);

        if (media_final>=7){
            System.out.println("Aprovado");
        }else {
            System.out.println("reprovado");
        }





   }
}
