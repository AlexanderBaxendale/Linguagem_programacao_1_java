package Atividade_sistemas_operacionais_thread_java;


public class ThreadSum implements Runnable{
    private int threadId;
    private int start;
    private int end;
    private static int[] array;
    private static int sum = 0;
    private static Object lock = new Object();

    public ThreadSum(int threadId, int[] array) {
        this.threadId = threadId;
        this.array = array;
        int arraySize = array.length;
        this.start = threadId * (arraySize / Main.NUM_THREADS);
        this.end = start + (arraySize / Main.NUM_THREADS);
    }

    @Override
    public void run() {

        int localSum = 0;
        System.out.print("ID do Thread: "+threadId+" -> [ ");
        for (int i = start; i < end; i++){
            localSum += array[i];
            System.out.print(array[i]);
            if(i < array.length - 1 ){
                System.out.print(" ");
            }
        }
        System.out.println(" ]  A soma dos elementos que cada Thread = "+ localSum);


        synchronized (lock) {
            sum += localSum;
        }

    }
    public static int getSum(){
        return sum;
    }
}
