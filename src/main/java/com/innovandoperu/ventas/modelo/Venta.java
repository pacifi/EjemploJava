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
public class Venta {

    public String idVenta;
    // Datos del Vendedor
    public String empresa;
    public String direccionEmpresa;
    public String rucEmpresa;
    // Fin datos Vendedor

    // Datos del Comprobante
    public String numeroSerie;
    public String numeroComprobante;
    public String fecha;
    public Double igvTotal;
    public Double baseImponoble; // netoTotal
    public Double total;
    // Fin datos Comprobante

    // Datos Cliente;
    public String direccionCliente;
    public String numeroDocumentoCliente;
    public String nombreCliente;

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getRucEmpresa() {
        return rucEmpresa;
    }

    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getIgvTotal() {
        return igvTotal;
    }

    public void setIgvTotal(Double igvTotal) {
        this.igvTotal = igvTotal;
    }

    public Double getBaseImponoble() {
        return baseImponoble;
    }

    public void setBaseImponoble(Double baseImponoble) {
        this.baseImponoble = baseImponoble;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getNumeroDocumentoCliente() {
        return numeroDocumentoCliente;
    }

    public void setNumeroDocumentoCliente(String numeroDocumentoCliente) {
        this.numeroDocumentoCliente = numeroDocumentoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

}
