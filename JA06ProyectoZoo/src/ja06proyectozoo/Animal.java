/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja06proyectozoo;

/**
 *
 * @author sportak
 */
public class Animal {
    String nombre;
    String paisOrigen;
    double peso;
    int edad;

    public Animal(String nombre, String paisOrigen, double peso, int edad) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.peso = peso;
        this.edad = edad;
    }

    Animal() {
        
    }

    public String getNombre() {
        return nombre;
    }
    public void mostrarAnimal(){
        System.out.println(this.getNombre());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
