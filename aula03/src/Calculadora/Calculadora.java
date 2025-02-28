package Calculadora;

public class Calculadora {
    int total;

    public int somar(int n1, int n2){
        total = n1+n2;
        return total;

    }
    public int mult(int n3, int n4){
        total = n3*n4;
        return total;
    }

    public int sub(int n1, int n2){
        total = n1-n2;
        return total;
    }

    public int divisao(int n1, int n2){
        total = n1/n2;
       return total;
    }
}
