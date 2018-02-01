/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja06proyectozoo;

import java.util.Scanner;

/**
 *
 * @author sportak
 */
public class AplicacionZoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal1 = null;
        Zoologico listaZoologico = new Zoologico();
        String nombre, paisOrigen;
        double peso;
        int opcion, edad;
        Scanner teclado = new Scanner(System.in);
        do {
            mostrarMenu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    animal1 = new Animal();

                    System.out.println("Introduzca nombre del animal");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    animal1.setNombre(nombre);
                    System.out.println("Introduzca pais de origen del animal");
                    paisOrigen = teclado.nextLine();
                    animal1.setPaisOrigen(paisOrigen);
                    System.out.println("Introduzca peso del animal");
                    peso = teclado.nextDouble();
                    animal1.setPeso(peso);
                    System.out.println("Introduzca edad del animal");
                    edad = teclado.nextInt();
                    animal1.setEdad(edad);
                    listaZoologico.añadeAnimal(animal1);
                    System.out.println("Animal creado y añadido satisfactoriamente en ArrayList");

                    break;
                case 2:
                    System.out.println("Introduzca pais de origen a buscar");
                    teclado.nextLine();
                    paisOrigen = teclado.nextLine();
                    if (listaZoologico.existeAnimaldelPais(paisOrigen)) {
                        System.out.println("Existe");
                    } else {
                        System.out.println("No existe");
                    }
                    break;
                case 3:
                    System.out.println("El promedio es " + listaZoologico.edadPromedio());
                    break;
                case 4:
                    System.out.println("Introduzca pais de origen");
                    teclado.nextLine();
                    paisOrigen = teclado.nextLine();
                    listaZoologico.eliminaAnimalesDe(paisOrigen);
                    break;
                case 5:
                    System.out.println("Introduzca un peso");
                    peso = teclado.nextDouble();
                    System.out.println(listaZoologico.cuantosPesanMas(peso));
                    break;
                case 6:
                    System.out.println("Introduzca nombre del animal");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    if (listaZoologico.buscarAnimal(nombre) != -1) {
                        System.out.println("El animal existe en la lista");
                    } else {
                        System.out.println("No esta en la lista");
                    }
                    break;
                case 7:
                    listaZoologico.edadDelPrimero();
                    break;
                case 8:
                    listaZoologico.pesoDelUltimo();
                    break;
                case 9:
                    animal1 = new Animal();
                    System.out.println("Introduzca nombre del animal");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    animal1.setNombre(nombre);
                    System.out.println("Introduzca pais de origen del animal");
                    paisOrigen = teclado.nextLine();
                    animal1.setPaisOrigen(paisOrigen);
                    System.out.println("Introduzca peso del animal");
                    peso = teclado.nextDouble();
                    animal1.setPeso(peso);
                    System.out.println("Introduzca edad del animal");
                    edad = teclado.nextInt();
                    animal1.setEdad(edad);
                    System.out.println("Introduzca posicion concreta de donde quiere que se agregue");
                    int pos = teclado.nextInt();
                    listaZoologico.reemplazaAnimal(animal1, pos);
                    break;
                case 10:
                    System.out.println("Introduzca nombre del animal");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    if (listaZoologico.buscarAnimal(nombre) != -1) {
                        System.out.println("El animal existe y es borrado");
                        listaZoologico.eliminaAnimal(listaZoologico.buscarAnimal(nombre));
                    } else {
                        System.out.println("No esta en la lista por lo que no se puede borrar");
                    }
                    break;
                case 11:
                    animal1 = new Animal();
                    System.out.println("Introduzca nombre del animal");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    animal1.setNombre(nombre);
                    System.out.println("Introduzca pais de origen del animal");
                    paisOrigen = teclado.nextLine();
                    animal1.setPaisOrigen(paisOrigen);
                    System.out.println("Introduzca peso del animal");
                    peso = teclado.nextDouble();
                    animal1.setPeso(peso);
                    System.out.println("Introduzca edad del animal");
                    edad = teclado.nextInt();
                    animal1.setEdad(edad);
                    System.out.println("Introduzca posicion concreta de donde quiere que se agregue");
                    pos = teclado.nextInt();
                    listaZoologico.insertaAnimal(animal1, pos);
                    System.out.println("Insertado exitosamente");
                    break;
                case 12:
                    listaZoologico.clausuraZoologico();
                    System.out.println("El zoo fue clausurado");
                    break;
                case 13:
                    listaZoologico.zoologicoClausurado();
                    break;
                default:
                    System.out.println("Introduciste una opcion incorrecta o de salida");
                    break;

            }

        } while (opcion != 0);

    }

    public static void mostrarMenu() {
        System.out.println("1.-Para añadir un nuevo animal");
        System.out.println("2.-Comprobar si existe un animal de un pais especifico");
        System.out.println("3.-Calcular la edad promedio de todos los animales en el zoo");
        System.out.println("4.-Eliminar a los animales que sean procedentes de un pais");
        System.out.println("5.-Cuantos animales pesan mas de un x");
        System.out.println("6.-Comprobar si el animal esta en la lista");
        System.out.println("7.-Comprobar la edad del primer animal insertado");
        System.out.println("8.-Comprobar el peso del ultimo animal insertado");
        System.out.println("9.-Reemplazar un animal en una posicion concreta");
        System.out.println("10.-Eliminar un animal");
        System.out.println("11.-Insertar un animal");
        System.out.println("12.-Clausurar zoologico");
        System.out.println("13.-El zoologico fue clausurado exitosamente?");

    }

}
