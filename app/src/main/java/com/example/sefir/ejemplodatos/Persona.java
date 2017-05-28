package com.example.sefir.ejemplodatos;

/**
 * Created by Sefir on 16/05/2017.
 * En esta clase, se declaran 2 variables (nombre, telefono)
 * de tipo String, de los cuales se van a crear sus getter and setter,
 * y el constructor
 */

public class Persona
{
    private String nombre;
    private String telefono;

    public Persona(String nombre, String telefono)
    {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
}
