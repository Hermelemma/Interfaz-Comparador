/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaNumero8;

/**
 *
 * @author em47a90
 */
public class Alumno {
    
    private String carne;
    private String nombre;
    private int edad;

    public Alumno(String carne, String nombre, int edad) {
        this.carne = carne;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCarne() {
        return carne;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "carne=" + carne + ", nombre=" + nombre + ", edad=" + edad + '}';
    } 
    
}