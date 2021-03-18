/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploshilos;

/**
 *
 * @author William Corado
 */
public class SimpleThread extends Thread {
    
    private int countDown = 5;
    private int threadNumber; 
    private static int threadCount = 0;

    public SimpleThread() {
        threadNumber = ++threadCount;
        System.out.println("Haciendo "+threadNumber);
    }
    
    public void run () {
        while(true){
            System.out.println("Thread " +
                    threadNumber + "(" + countDown + ")");
            if(--countDown == -1) return;
        }
    }
    
//    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 5; i++) {
//            SimpleThread s = new SimpleThread();
//            s.start();
//            s.join();
//        }
//        System.out.println("Todos los hilos iniciados");
//    }
//    
}
