/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovandoperu.ventas;

import com.innovandoperu.ventas.dao.ArticuloDao;
import com.innovandoperu.ventas.dao.ClienteDao;
import com.innovandoperu.ventas.dao.VentaDao;
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

            String menu = "======== Sistema de Ventas ========"
                    + "\n=====Menu de Información====="
                    + "\n1: Para Ver Articulos"
                    + "\n2: Para Ver Clientes"
                    + "\n: Para Realizar la venta"
                    + "\n0: Para Salir ";
            System.out.println(menu);

            opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1: {
                    do {
                        ArticuloDao articuloDao = new ArticuloDao();
                        System.out.println("===== Opcion de articulos ======");
                        System.out.println("1: Para Listar Articulos");
                        System.out.println("2: Para Registrar Articulos");
                        System.out.println("3: Para Buscar Articulos");
                        System.out.println("0: Para Regresar al menu anterior\n\n");

                        opcionArticulo = scanner.nextInt();
                        switch (opcionArticulo) {
                            case 1: {
                                System.out.println("====== Lista de articulos ======");
//                                if (!articuloList.isEmpty()) {
//
//                                    for (Articulo art : articuloList) {
//                                        // art = articuloList[i]
//                                        System.out.println(art.getNombre());
//                                        System.out.println(art.getPrecio());
//                                    }
//
//                                    for (int i = 0; i < articuloList.size(); i++) {
//                                        System.out.println("Impresion for clasico");
//                                        System.out.println(articuloList.get(i).toString());
//
//                                    }
//                                    System.out.println("");
//                                    System.out.println("");
//                                } else {
//                                    System.out.println("No hay articulos para mostra\n\n");
//                                }
                                articuloDao.reportarArticulo();
                            }
                            break;
                            case 2: {
                                // Creando Objeto art de tipo Articulo
//                                Articulo art = new Articulo();
//                                System.out.println("Ingrese Nombre");
//                                art.setNombre(scanner.next());
//
//                                System.out.println("Ingrese Precio");
//
//                                art.setPrecio(scanner.nextDouble());
                                articuloDao.registrarArticulo();
                            }
                            break;
                            case 3: {
                                System.out.println("Ingrese id Artuculo");
                                String idArticulo = scanner.next();
                                Articulo art = articuloDao.buscarArticulo(idArticulo);
                                System.out.println("Este es el ID");
                                System.out.println(art.getIdArticulo());
                                System.out.println("Este es el nobre");
                                System.out.println(art.getNombre());
                                System.out.println("este es el precio");
                                System.out.println(art.getPrecio());

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
                    int opcionCliente;
                    ClienteDao clienteDao = new ClienteDao();
                    do {
                        System.out.println("===== Opcion de Clientes ======");
                        System.out.println("1: Para Listar Clientes");
                        System.out.println("2: Para Registrar Clientes");
                        System.out.println("0: Para Regresar al menu anterior\n\n");
                        opcionCliente = scanner.nextInt();
                        switch (opcionCliente) {
                            case 1: {
                                clienteDao.reportarCliente();
                            }
                            break;
                            case 2: {
                                clienteDao.registrarCliente();
                            }
                            break;
                            case 3: {
                            }

                            break;
                            default:
                                break;
                        }

                    } while (opcionCliente != 0);

                }
                break;

                case 3: {
                    int opcionVenta;
                    VentaDao ventaDao = new VentaDao();
                    do {
                        System.out.println("===== Opcion de Venta ======");
                        System.out.println("1: Para Listar Ventas");
                        System.out.println("2: Para Registrar Venta");
                        System.out.println("0: Para Regresar al menu anterior\n\n");
                        opcionVenta = scanner.nextInt();
                        switch (opcionVenta) {
                            case 1: {

                            }
                            break;
                            case 2: {
                                ventaDao.realizarVenta();
                            }
                            break;
                            case 3: {
                            }

                            break;
                            default:
                                break;
                        }

                    } while (opcionVenta != 0);

                }
                break;
                default: {
                    System.out.println("No existe la opción");
                }
            }

        } while (opcionPrincipal != 0);

    }

}
