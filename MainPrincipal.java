/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaNumero8;

import java.util.Scanner;

/**
 *
 * @author em47a90
 */
public class MainPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite el nombre del alumno");
        String nombre2 = ent.nextLine();
        System.out.println("Digite el carnet del alumno");
        String carnet = ent.nextLine();
        System.out.println("Digite la edad del alumno");
        int edad = ent.nextInt();
        System.out.println("Digite otra edad para hacer una comparacion");
        int edadComparacion = ent.nextInt();
        
        Alumno alumno = new Alumno(nombre2, carnet, edad);
        InterfaceComparador comparador2= new InterfaceComparador(edadComparacion);
        
        if (comparador2.igualQueAlumno(alumno) == true) {
            System.out.println(edad + " es igual a " + edadComparacion);
        }
        
        if (comparador2.mayorQueAlumno(alumno) == true) {
            System.out.println(edad + " es mayor que " + edadComparacion);
        }

        if (comparador2.menorQueAlumno(alumno) == true) {
            System.out.println(edad + " es menor que " + edadComparacion);
        }        

        if (comparador2.mayorIgualQueAlumno(alumno) == true) {
            System.out.println(edad + " es mayor o igual que " + edadComparacion);
        }       

        if (comparador2.menorIgualQueAlumno(alumno) == true) {
            System.out.println(edad + " es menor o igual que " + edadComparacion);
        }
        
        System.out.println("----------------------------------------------");

        System.out.println("Digite el id de su producto");
        int id = ent.nextInt();
        ent.nextLine();
        System.out.println("Digite el nombre de su producto");
        String nombre1 = ent.nextLine();
        System.out.println("Digite el precio de su producto");
        double precio = ent.nextDouble();
        System.out.println("Digite otro precio para hacer una comparacion");
        double precioComparacion = ent.nextDouble();

        Producto producto = new Producto(id, nombre1, precio);

        InterfaceComparador comparador1 = new InterfaceComparador(precioComparacion);

        if (comparador1.igualQueProducto(producto) == true) {
            System.out.println(precio + " es igual a " + precioComparacion);
        }
        
        if (comparador1.mayorQueProducto(producto) == true) {
            System.out.println(precio + " es mayor que " + precioComparacion);
        }

        if (comparador1.menorQueProducto(producto) == true) {
            System.out.println(precio + " es menor que " + precioComparacion);
        }        

        if (comparador1.mayorIgualQueProducto(producto) == true) {
            System.out.println(precio + " es mayor o igual que " + precioComparacion);
        }

        if (comparador1.menorIgualQueProducto(producto) == true) {
            System.out.println(precio + " es menor o igual que " + precioComparacion);
        }
    }
}
