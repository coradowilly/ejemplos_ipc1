/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase6;

import java.io.Serializable;

/**
 *
 * @author William Corado
 */
public class Pokemon implements Serializable {
    
    int id;
    String tipo;
    String nombre;
    double vida;
    double puntos_ataque;
    boolean capturado;
    boolean estado;

    public Pokemon(int id, String tipo, String nombre, double vida, double puntos_ataque, boolean capturado, boolean estado) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.vida = vida;
        this.puntos_ataque = puntos_ataque;
        this.capturado = capturado;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getPuntos_ataque() {
        return puntos_ataque;
    }

    public void setPuntos_ataque(double puntos_ataque) {
        this.puntos_ataque = puntos_ataque;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
