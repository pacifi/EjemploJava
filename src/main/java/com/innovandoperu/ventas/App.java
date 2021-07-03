/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovandoperu.ventas;

import com.innovandoperu.ventas.modelo.Articulo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pacifi
 */
public class App {

    public static void main(String args[]) {

        List<Articulo> articuloList = new ArrayList<Articulo>();

        Scanner scanner = new Scanner(System.in);
        int opcionPrincipal;
        int opcionArticulo;
        do {
            System.out.println("======== Sistema de Ventas ========");
            System.out.println("=====Menu de Información=====");
            System.out.println("1: Para Ver Articulos");
            System.out.println("2: Para Realizar la venta");
            System.out.println("0: Para Salir ");
            opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1: {
                    do {
                        System.out.println("===== Opcion de articulos ======");
                        System.out.println("1: Para Listar Articulos");
                        System.out.println("2: Para Registrar Articulos");
                        System.out.println("0: Para Regresar al menu anterior\n\n");

                        opcionArticulo = scanner.nextInt();
                        switch (opcionArticulo) {
                            case 1: {
                                System.out.println("====== Lista de articulos ======");
                                if (!articuloList.isEmpty()) {
                                    for (Articulo art : articuloList) {
                                        System.out.println(art.toString());
                                        System.out.println("");
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.println("No hay articulos para mostra\n\n");
                                }
                            }
                            break;
                            case 2: {
                                Articulo articulo = new Articulo();
                                System.out.println("Ingrese Nombre");
//                                articulo.setNombre(scanner.next());
                                articulo.nombre = scanner.next();
                                System.out.println("Ingrese Precio");
                                articulo.precio = scanner.nextDouble();
//                                articulo.setPrecio(scanner.nextDouble());
                                articuloList.add(articulo);

                            }
                            break;
                            default: {

                            }
                            break;
                        }

                    } while (opcionArticulo != 0);

                }
                break;
                case 2: {

                }
                break;
                default: {
                    System.out.println("No existe la opción");
                }
            }

        } while (opcionPrincipal != 0);

    }

}
