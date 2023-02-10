
package com.mycompany.ventadeautos;

public class Cliente {
    private String nombre;
    private String direccion;
    private int edad;
    private Auto[] automovil;

    public Cliente() {
    }

    public Cliente(String nombre, String direccion, int edad, Auto[] automovil) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.automovil = automovil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Auto[] getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Auto[] automovil) {
        this.automovil = automovil;
    }
    
    
    
    
}
