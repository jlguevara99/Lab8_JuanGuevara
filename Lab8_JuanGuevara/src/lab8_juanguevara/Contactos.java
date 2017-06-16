/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_juanguevara;

/**
 *
 * @author HP
 */
public class Contactos {
private String nombre;
private int edad;
private int numero;  
private String correo;  
private String direccion;
private String genero;

    public Contactos(String nombre, int edad, int numero, String correo, String direccion, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
        this.correo = correo;
        this.direccion = direccion;
        this.genero = genero;
    }

    public Contactos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
