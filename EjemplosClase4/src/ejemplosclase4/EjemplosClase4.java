/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase4;

/**
 *
 * @author William Corado
 */
public class EjemplosClase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setNombre("Dennis");
        Libro libro2 = new Libro();
        Libro libro3 = new Libro("GOT 1", 2002, "Santillana", 1335, "George RR Martin", 5973);
        Libro libro4 = new Libro("Manifiesto comunista", 1990, "Usac", 500, "Lic. Pedro", 9630);

        Libreria libreria = new Libreria(libro1, libro2, libro3, libro4);
        libreria.mostrar();
    }

}
