/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author William Corado
 */
public class EjemplosClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // IF SIMPLE, IF-ELSE, IF ANIDADO -> Estructura condicional 
        if (4 < 3) {
            System.out.println("Si entra es falso");
        } else if (!true) {
            System.out.println("Si entra es falso en else if 1");
        } else if ("Hola" == "Adios") {
            System.out.println("Si entra es falso en else if 2");
        } else {
            System.out.println("Todas las anteriores son falsas");
        }

        // SWITCH -> Estructura condicional 
        switch ("z") {
            case "h":
                System.out.println("Es h");
                break; // <- Estructura de salto
            case "o":
                System.out.println("Es o");
                break;
            default:
                System.out.println("No es ninguna de la anteriores");
                break;
        }

        // TERNARIO O CONDICIONAL -> Estructura condicional 
        boolean flag = 5 > 4 ? true : false;
        String txt = 5 > 4 ? "Si es verdadero" : "Si es falso";
        System.out.println(txt);

        // Estructura repetitiva (bucle)
        int i = 0;
        System.out.println("While");
        while (i < 10) {
            System.out.println(i);
            i++; // i = i + 1;
        }

        i = 0;
        do {
            System.out.println("Do - While");
            System.out.println(i);
        } while (i < 0);

        i = 2;
        System.out.println("For");
        for (int j = 1; j <= 7; j++) {

            System.out.println("Valor de j:"+j);
            
            if (2 == j) {
                continue;
            }

            System.out.println("Dia " + j);
        }
        
        procedimiento();
        int valorsuma = suma(2);
        
        System.out.println("valorsuma: "+valorsuma);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option = Integer.parseInt(br.readLine());

    }
    
    public static void procedimiento(){
        System.out.println("Esto es un procedimiento");
        System.out.println("no retorna nada");
    }
    
    public static int suma(int val1, int val2){
        System.out.println("Esto es una funcion");
        System.out.println("retorna una suma");
        return val1+val2;
    }
    
    public static int suma(int val2){ // Sobre carga de métodos
        System.out.println("Esto es una funcion");
        System.out.println("retorna una suma");
        return 5+val2;
    }

}
