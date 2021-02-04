/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocase3;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author William Corado
 */
public class ejemplos {

    int[] arr = new int[3];
    int[][] arr2 = new int[3][3];
    String[][] arr3 = new String[3][5];
    // 0 - 2 

    public ejemplos() throws IOException {
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        System.out.println("Vector");
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }

        arr2[0][0] = 5;
        arr2[0][1] = 10;
        arr2[0][2] = 15;
        arr2[1][0] = 20;
        arr2[1][1] = 25;
        arr2[1][2] = 30;
        arr2[2][0] = 35;
        arr2[2][1] = 40;
        arr2[2][2] = 45;

        System.out.println("\nMatriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[j][i] + "\t");
            }
            System.out.println("");
        }

        arr3[0][0] = "Pedro";
        arr3[1][0] = "Juanita";
        arr3[2][0] = "Pablo";

        arr3[0][1] = "10";
        arr3[1][1] = "7";
        arr3[2][1] = "8";

        arr3[0][2] = "17";
        arr3[1][2] = "11";
        arr3[2][2] = "20";

        for (int i = 0; i < 3; i++) {
            arr3[i][3] = Integer.parseInt(arr3[i][1]) + Integer.parseInt(arr3[i][2]) + "";
            arr3[i][4] = ((Integer.parseInt(arr3[i][1]) + Integer.parseInt(arr3[i][2])) / 2) + "";
        }

        System.out.println("\nMatriz de Nombres - Notas");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[j][i] + "\t");
            }
            System.out.println("");
        }

//        int d = 5;
//        System.out.println((double)d);
//        System.out.println("\\Hola\\");
//        System.out.println("\"Hola\"");
        // ARCHIVOS 
        String pathFile = "C:\\Users\\William Corado\\Desktop\\Prueba.txt";

        File f = new File(pathFile);

        if (!Desktop.isDesktopSupported()) {
            System.out.println("No soportado");
            return;
        }

        Desktop dkp = Desktop.getDesktop();
        if (f.exists()) {
//            dkp.open(f);
        }

        System.out.println("Usando FileInputStream");
        FileInputStream fis = new FileInputStream(f);
        int r = 0;
        while ((r = fis.read()) != -1) {
            System.out.print((char) r);
        }
        System.out.println("\n");

        System.out.println("Usando BufferedReader");
        BufferedReader br = new BufferedReader(new FileReader(f));
        r = 0;
        while ((r = br.read()) != -1) {
            System.out.print((char) r);
        }
        System.out.println("\n");
        
        System.out.println("Usando FileReader");
        FileReader fr = new FileReader(pathFile);
        r = 0;
        while ((r = fr.read()) != -1) {
            System.out.print((char) r);
        }
        System.out.println("\n");
        
        System.out.println("Usando Scanner");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        System.out.println("");
    }

}
