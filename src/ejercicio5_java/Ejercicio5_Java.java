/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_java;

/**
 *
 * @author Victor Rosario
 */
public class Ejercicio5_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Videojuego videojuego1 = new Videojuego();
        
        videojuego1.setCompania("Play ground games");
        videojuego1.setGenero("Conduccion");
        videojuego1.setTitulo("Forza Horizon 4");
        
        videojuego1.ToString();
        
        Videojuego videojuego2 = new Videojuego("Doom Eternal", 25);
        videojuego2.setCompania("Bethesda");
        videojuego2.setGenero("Accion");
        
        videojuego2.ToString();
        
        Videojuego videojuego3 = new Videojuego("Ori and the will of the wisps", 20, "Plataformas", "Moon Studios");
        
        videojuego3.ToString();
    }
    
}
