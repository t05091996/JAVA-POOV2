/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.epe2_tamara_benaldo;

/**
 *
 * 
 */
class DatosFactura {
    //propiedades de la clase
    public String nombreCliente;
    public String apellidosCliente;
    public int edadCliente;
    public String rutCliente;
    public String nombreEmpresa;
    public String rutEmpresa;
    public String giroEmpresa;
    public double totalVentas;
    public double montoVentas;
    public double montoIVA;
    public double utilidades;
    
    //constructor de la clase con parametros de entrada.
    public DatosFactura(String nombreCliente, String apellidosCliente, int edadCliente, String rutCliente, String nombreEmpresa, String rutEmpresa, String giroEmpresa, double totalVentas, double montoVentas) {
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.edadCliente = edadCliente;
        this.rutCliente = rutCliente;
        this.nombreEmpresa = nombreEmpresa;
        this.rutEmpresa = rutEmpresa;
        this.giroEmpresa = giroEmpresa;
        this.totalVentas = totalVentas;
        this.montoVentas = montoVentas;
    }

    private void calcularIVA() {
        // Cálculo del IVA sobre el monto de ventas
        montoIVA = montoVentas * 0.19; // Suponemos una tasa de IVA del 19%
    }

    private void calcularUtilidades() {
        // Cálculo de las utilidades de la empresa
        utilidades = totalVentas - montoIVA;
    }

    // Getters para acceder a los datos calculados
    public double getMontoIVA() {
        calcularIVA();
        return montoIVA;
    }
    //devuelve la propiedad utilidades despues de hacer el calculo.
    public double getUtilidades() {
        calcularUtilidades();
        return utilidades;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public String getGiroEmpresa() {
        return giroEmpresa;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public double getMontoVentas() {
        return montoVentas;
    }
}
