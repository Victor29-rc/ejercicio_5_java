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
public class Videojuego {
    String titulo = "";
    double horasEstimadas = 10;
    boolean entregado = false;
    String genero = "";
    String compania = "";
    
    public Videojuego(){}
    
    public Videojuego(String titulo, double horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }
    
    public Videojuego(String titulo, double horasEstimadas, String genero, String compania){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }
    
    public String getTitulo(){ return titulo; }
    public double getHorasEstimadas(){ return horasEstimadas; }
    public String getGenero() { return genero; }
    public String getCompania() { return compania; }
     
    public void setTitulo(String titulo){ this.titulo = titulo; }
    public void setHorasEstimadas(double horasEstimadas){ this.horasEstimadas = horasEstimadas; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setCompania(String compania) { this.compania = compania; }
    
    public void ToString(){
         System.out.println
            ("Titulo: " + titulo + "\n" +
             "Horas Estimadas: " + horasEstimadas + "\n" +
             "Entregado: " + entregado + "\n" +
             "Genero: " + genero + "\n" + 
             "Compañia: " + compania + "\n"      
            );
    }
}
