/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase4;

import java.util.Scanner;

/**
 *
 * @author William Corado
 */
public class Libro {

    String nombre;
    private int anio;
    String editorial;
    int paginas;
    String autor;
    int isbn;

    public Libro() {
        //nombre = "Hola soy German";
    }

    public Libro(String nombre, int anio, String editorial, int paginas, String autor, int isbn) {
        nombre = nombre.toLowerCase();
        this.nombre = nombre;
        this.anio = anio;
        this.editorial = editorial;
        this.paginas = paginas;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}

/*
    1,2,3
    4,5,6
    7,8,9

    1,2,3 -> 1er Línea -> [1] [2] [3] ->  String.parseInt([1]);
 */
