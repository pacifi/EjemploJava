/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovandoperu.ventas.modelo;

/**
 *
 * @author pacifi
 */
// Clase Dominio (TO, Modelo, Abstración del mundo real)
public class Articulo {

    public String idArticulo;
    public String nombre;
    public Double precio;

    public String getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

//    funcion que retorna el nombre del articulo
    public String getNombre() {
        return nombre;
    }

    //Funcion para cambiar el nombre del articulo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //funcion que retorna el precio del articulo
    public Double getPrecio() {
        return precio;
    }

    // funcion que cambia el precio del articulo
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

}
