/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase6;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author William Corado
 */
public class Menu {

    MisObjetos misobjetos;

    public Menu() {
        misobjetos = new MisObjetos();
    }

    public void mostrarmenu() throws IOException, ClassNotFoundException {
        int opcion = 0;
        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Cargar Pokemon");
            System.out.println("2. Cargar Pokeball");
            System.out.println("3. Guardar Serializable");
            System.out.println("4. Cargar Serializable");
            System.out.println("5. Mostar los primeros valores");
            System.out.println("6. Salir");
            Scanner sc = new Scanner(System.in);
            Scanner scline = new Scanner(System.in);
            opcion = sc.nextInt();
            String linea = "";
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese Pokemon: ");
                    linea = scline.nextLine();
                    String rs[] = linea.split(",");
                    misobjetos.guardarPokemon(Integer.parseInt(rs[0]), rs[1], rs[2], Double.parseDouble(rs[3]), Double.parseDouble(rs[4]), rs[5].equals("capturado") ? true : false, rs[6].equals("vivo") ? true : false);
                    System.out.print("Se asigno el pokemon: ");
                    System.out.println(misobjetos.pokemon[0].getNombre());
                    break;
                case 2:
                    System.out.println("Ingrese Pokeball: ");
                    linea = scline.nextLine();
                    String rsP[] = linea.split(",");
                    misobjetos.guardarPokeball(Integer.parseInt(rsP[0]), rsP[1]);
                    System.out.print("Se asigno la pokeball: ");
                    System.out.println(misobjetos.pokeball[0].getId());
                    break;
                case 3:
                    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("misobjetos.bin"));
                    os.writeObject(misobjetos);  // this es de tipo DatoUdp
                    os.close();
                    break;
                case 4:
                    ObjectInputStream oi = new ObjectInputStream(new FileInputStream("misobjetos.bin"));
                    misobjetos = (MisObjetos) oi.readObject();
                    break;
                case 5:
                    System.out.print("Se asigno el pokemon: ");
                    System.out.println(misobjetos.pokemon[0].getNombre());
                    System.out.print("Se asigno la pokeball: ");
                    System.out.println(misobjetos.pokeball[0].getId());
                    break;
                case 6:
                    System.out.println("Gracias, vuelva pronto");
                    break;
                default:
                    System.out.println("Eligue una opcion correcta");
                    break;
            }
        } while (opcion != 6);
    }
}
