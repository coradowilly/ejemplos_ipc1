/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploshilos;

import java.io.PrintWriter;

/**
 *
 * @author William Corado
 */
public class MethodTest {

    static PrintWriter out = new PrintWriter(System.out, true);

//    public static void main(String arg[]) {
//        FirstThread first = new FirstThread();
//        SecondThread second = new SecondThread();
//        first.start();
//        second.start();
//        
//        try {
//            System.out.println("Esperando que el primer hilo termine ");
//            first.join();
//            System.out.println(" Esperando que empiece el segundo hilo ");
//            synchronized (second) {
//                second.notify();
//            }
//            
//            System.out.println("Esperando que termine el segundo hilo");
//            second.join();
//        } catch (InterruptedException e){
//            System.out.println("Estoy listo para terminar tambien");
//        }
//    }

}

class FirstThread extends Thread {

    public void run() {
        try {
            MethodTest.out.println(" El primer hilo está corriendo");
            sleep(10000);
            MethodTest.out.println(" El primer hilo dejo de correr");
        } catch (InterruptedException e) {

        }
    }
}

class SecondThread extends Thread {

    public void run() {
        try {
            MethodTest.out.println(" El segundo hilo está corriendo");
            MethodTest.out.println(" El segundo esta suspendido");
            wait();
            MethodTest.out.println(" El segundo hilo empezo a correr de nuevo y termino");
        } catch (InterruptedException e) {

        }
    }
}
