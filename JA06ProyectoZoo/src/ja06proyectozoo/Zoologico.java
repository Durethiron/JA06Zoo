/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja06proyectozoo;

import java.util.ArrayList;

/**
 *
 * @author sportak
 */
public class Zoologico {

    ArrayList<Animal> listaAnimal;
//IM PORTANTISIMO

    public Zoologico() {
        listaAnimal = new ArrayList<Animal>();
    }
    //IM PORTANTISIMO

    public ArrayList<Animal> getLista() {
        return listaAnimal;
    }

    public ArrayList<Animal> getListaAnimal() {
        return listaAnimal;
    }

    public void setListaAnimal(ArrayList<Animal> listaAnimal) {
        this.listaAnimal = listaAnimal;
    }

    public Zoologico(ArrayList<Animal> listaAnimal) {
        this.listaAnimal = listaAnimal;
    }

    public void setLista(ArrayList<Animal> lista) {
        this.listaAnimal = lista;
    }

    public void añadeAnimal(Animal a) {
        listaAnimal.add(a);
    }

    public boolean existeAnimaldelPais(String p) {
        for (int i = 0; i < this.listaAnimal.size(); i++) {
            if (this.listaAnimal.get(i).paisOrigen.equalsIgnoreCase(p)) {
                return true;
            }
        }
        return false;
    }

    public int buscarAnimal(String nombre) {
        for (int i = 0; i < this.listaAnimal.size(); i++) {
            if (this.listaAnimal.get(i).nombre.equalsIgnoreCase(nombre)) {
                return i;
            }

        }
        return -1;
    }

    public int edadPromedio() {
        int suma = 0;
        int promedio;
        for (int i = 0; i < this.listaAnimal.size(); i++) {
            suma += this.listaAnimal.get(i).edad;

        }

        promedio = suma / this.listaAnimal.size();
        return promedio;
    }

    public void eliminaAnimalesDe(String p) {
        for (int i = 0; i < this.listaAnimal.size(); i++) {
            if (this.listaAnimal.get(i).paisOrigen.equalsIgnoreCase(p)) {
                this.listaAnimal.remove(i);
                System.out.println("Eliminado satisfactoriamente");

            }

        }
    }

    public int cuantosPesanMas(double p) {
        int conteo = 0;
        for (int i = 0; i < this.listaAnimal.size(); i++) {
            if (this.listaAnimal.get(i).peso > p) {
                conteo++;

            }
        }
        return conteo;
    }

    public boolean siEsta(Animal a) {
        if (this.listaAnimal.contains(a)) {
            return true;

        } else {
            return false;
        }

    }

    public void edadDelPrimero() {

        System.out.println("La edad del primer animal es " + this.listaAnimal.get(0).edad);

    }

    public void pesoDelUltimo() {
        System.out.println("El peso del ultimo es " + this.listaAnimal.get(this.listaAnimal.size()-1).peso);
    }

    public void reemplazaAnimal(Animal a, int pos) {
        this.listaAnimal.set(pos, a);

    }

    public void eliminaAnimal(int pos) {
        this.listaAnimal.remove(pos);
    }

    public void insertaAnimal(Animal a, int pos) {
        this.listaAnimal.add(pos, a);
    }

    public void clausuraZoologico() {
        this.listaAnimal.removeAll(listaAnimal);

    }

    public void mostrarZoologico() {

        for (int i = 0; i < this.listaAnimal.size(); i++) {
            System.out.println("*********************************************");
            System.out.println("Nombre del animal : " + this.listaAnimal.get(i).nombre);
            System.out.println("Pais de origen : " + this.listaAnimal.get(i).paisOrigen);
            System.out.println("Edad del animal : " + this.listaAnimal.get(i).edad);
            System.out.println("Peso del animal : " + this.listaAnimal.get(i).peso);
            System.out.println("*********************************************");
        }
    }

    public boolean zoologicoClausurado() {
        if (this.listaAnimal.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
