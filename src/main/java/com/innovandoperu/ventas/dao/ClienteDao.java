/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovandoperu.ventas.dao;

import com.innovandoperu.ventas.data.AppCrud;
import com.innovandoperu.ventas.modelo.Articulo;
import com.innovandoperu.ventas.modelo.Cliente;
import com.innovandoperu.ventas.utils.LeerArchivo;
import com.innovandoperu.ventas.utils.LeerTeclado;

/**
 *
 * @author pacifi
 */
public class ClienteDao extends AppCrud {

    Cliente cliente;
    LeerArchivo lar;
    LeerTeclado lte = new LeerTeclado();

    public Object[][] registrarCliente() {
        cliente = new Cliente();
        lar = new LeerArchivo("Cliente.txt");
        cliente.setIdCliente(generarId(lar, 0, "Cl", 1));
        cliente.setNombre(lte.leer("", "Ingrese nombre Cliente:"));
        cliente.setApellidos(lte.leer("", "Ingrese apellidos Cliente:"));
        cliente.setNumeroDocumento(lte.leer("", "Ingrese Número Documento  del Cliente:"));
        cliente.setDireccion(lte.leer("", "Ingrese Dirección Cliente:"));

        return agregarContenido(lar, cliente);
    }

    public void reportarCliente() {
        lar = new LeerArchivo("Cliente.txt");
        imprimirLista(listarContenido(lar));
    }

    public Cliente clientebyNumeroDocumento(String numeroDocumento) {
        Cliente cliente = new Cliente();
        Object[][] dataP = buscarContenido(lar, 3, numeroDocumento);
        cliente.setIdCliente(String.valueOf(dataP[0][0]));
        cliente.setNombre(String.valueOf(dataP[0][1]));
        cliente.setDireccion(String.valueOf(dataP[0][1]));

        return cliente;
    }
}
