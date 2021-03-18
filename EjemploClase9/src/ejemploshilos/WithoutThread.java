/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploshilos;

import com.sun.xml.internal.ws.client.ContentNegotiation;
import java.io.PrintWriter;

public class WithoutThread {

    static PrintWriter out = new PrintWriter(System.out, true);

    /*public static void main(String[] args) {
        RunnablePseudoIO pseudo = new RunnablePseudoIO();
        Thread hilo = new Thread(pseudo);
        hilo.start();
        showElapsedTime("Si otra tarea inicia");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            
        }
    }*/

    static long baseTime = System.currentTimeMillis();

    static void showElapsedTime(String message) {
        long elapsedTime = System.currentTimeMillis() - baseTime;
        System.out.println(message + " a los " + (elapsedTime / 1000) + " segundos");
    }

}

class RunnablePseudoIO implements Runnable {

    int data = -1;

    public RunnablePseudoIO() {
        WithoutThread.showElapsedTime("RunnablePseudoIO fue creado");
    }

    public void run() {
        WithoutThread.showElapsedTime("RunnablePseudoIO esta corriendo");
        try {
            Thread.sleep(5000);
            data = 999;
            WithoutThread.showElapsedTime("RunnablePseudoIO finalizo");
        } catch (InterruptedException e) {

        }
    }

}
