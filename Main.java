package homework12WorkerLambda;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listener2 = System.out::println;

        Worker worker = new Worker(listener,listener2);
        //Worker worker2 = new Worker(listener2);
        worker.start();
        //worker2.start2();
    }
}
