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
public class InterfaceComparador {

    private int edadAlumno;
    private double precioProducto;

    public InterfaceComparador() {
        this.edadAlumno = 0;
        this.precioProducto = 0;
    }

    public InterfaceComparador(int edadAlumno) {
        this.edadAlumno = edadAlumno;
    }

    public InterfaceComparador(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getEdadAlumno() {
        return edadAlumno;
    }
        

    public boolean igualQueAlumno(Alumno alumno) {
        Alumno alum = (Alumno)alumno;
        return  alum.getEdad()==this.edadAlumno;
    }
    
    public boolean mayorQueAlumno(Alumno alumno) {
        Alumno alum = (Alumno) alumno;
        return alum.getEdad() > this.edadAlumno;
    }

    public boolean menorQueAlumno(Alumno alumno) {
        Alumno alum = (Alumno) alumno;
        return alum.getEdad() < this.edadAlumno;
    }    
    
    public boolean mayorIgualQueAlumno(Alumno alumno) {
        Alumno alum = (Alumno)alumno;
        return alum.getEdad() >= this.edadAlumno;
    }     

    public boolean menorIgualQueAlumno(Alumno alumno) {
        Alumno alum = (Alumno) alumno;
        return alum.getEdad()<= this.edadAlumno;
    }
    
    

    public boolean igualQueProducto(Producto producto) {
        Producto produc = (Producto) producto;
        return produc.getPrecio() == this.precioProducto;
    }
    
    public boolean mayorQueProducto(Producto producto) {
        Producto produc = (Producto) producto;
        return produc.getPrecio() > this.precioProducto;
    }

    public boolean menorQueProducto(Producto producto) {
        Producto produc = (Producto) producto;
        return produc.getPrecio() < this.precioProducto;
    }    

    public boolean mayorIgualQueProducto(Producto producto) {
        Producto produc = (Producto) producto;
        return produc.getPrecio() >= this.precioProducto;
    }
    
    public boolean menorIgualQueProducto(Producto producto) {
        Producto produc = (Producto) producto;
        return produc.getPrecio() <= this.precioProducto;
    }

}
