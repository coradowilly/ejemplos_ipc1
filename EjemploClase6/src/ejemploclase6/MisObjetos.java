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
public class MisObjetos implements Serializable {
    int contadorPokemon;
    int contadorPokeball;
    public Pokemon [] pokemon = new Pokemon[150];
    public Pokeball [] pokeball = new Pokeball[20];
    
    public MisObjetos() {
        contadorPokemon = 0;
    }
    
    public void guardarPokeball(int id, String tipo){
        Pokeball nueva_pokeball = new Pokeball(id, tipo);
        pokeball[contadorPokeball] = nueva_pokeball;
        contadorPokeball++;
    }
    
    public void guardarPokemon(int id, String tipo, String nombre, double vida, double puntos_ataque, boolean capturado, boolean  estado){
        Pokemon nuevo_pokemon = new Pokemon(id,tipo,nombre,vida,puntos_ataque,capturado,estado);
        pokemon[contadorPokemon] = nuevo_pokemon;
        contadorPokemon++;
    }
    
    public void asignarPokemon(){
        Pokemon pokemon_asignable = getPokemon(150);
        Pokeball pokeball_asignable = getPokeball(20);
        
        pokeball_asignable.setPokemon(pokemon_asignable);
    }
    
    public Pokemon getPokemon(int id){
        for (int i = 0; i < pokemon.length; i++) {
            if(id == pokemon[i].getId()){
                return pokemon[i];
            }
        }
        return null;
    }
    
    public Pokeball getPokeball(int id){
        for (int i = 0; i < pokeball.length; i++) {
            if(id == pokeball[i].getId()){
                return pokeball[i];
            }
        }
        return null;
    }
}
