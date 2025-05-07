package Atividade_sistemas_operacionais_thread_java;


import java.util.Random;
public class Main {
    public static final int NUM_THREADS = 5;
    public static void main(String[] args){

        Random random = new Random();
        // Definindo o tamanho da array
        int[] array = new int[40];
        // Preenchendo a arrray com elementos randomizados, de valores entre 0 e 99
        for (int i = 0; i < 40; i++){
            array[i] = random.nextInt(100);
        }
        // Imprimindo os elementos da array
        System.out.print("Vetores -> [ ");
        for( int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i < array.length - 1){
                System.out.print(" - ");
            }
        }
        System.out.println("]");

        ThreadSum ts0 = new ThreadSum(0,array);
        ThreadSum ts = new ThreadSum(1,array);
        ThreadSum ts2 = new ThreadSum(2,array);
        ThreadSum ts3 = new ThreadSum(3,array);
        ThreadSum ts4 = new ThreadSum(4,array);


        System.out.println("Dados: ");
        ts0.run();
        ts.run();
        ts2.run();
        ts3.run();
        ts4.run();

        System.out.println("resultados da soma total: "+ ts.getSum());

    }
}

