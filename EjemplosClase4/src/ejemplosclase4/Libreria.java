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
public class Libreria {

    Libro[] estanteria = new Libro[4];

    public Libreria(Libro lib1, Libro lib2, Libro lib3, Libro lib4) {
        estanteria[0] = lib1;
        estanteria[1] = lib2;
        estanteria[2] = lib3;
        estanteria[3] = lib4;
    }
    
    public void mostrar (){
        for (int i = 0; i < 4; i++) {
            System.out.println("Estanteria pos: "+i+" "+estanteria[i].getNombre());
        }
    }
}
