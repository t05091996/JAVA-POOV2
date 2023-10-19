/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.epe2_tamara_benaldo;

/**
 *
 
 */
public class ventas {
   public double montoVenta;
    public String fechaVenta;
    public String descripcionVenta;
    public int cantidadProductos;
    public String numeroFactura;
    public String metodoPago;
    public String estadoVenta;
    
    public ventas(String fechaVenta, String descripcionVenta, int cantidadProductos, String numeroFactura, String metodoPago, String estadoVenta) {
        this.fechaVenta = fechaVenta;
        this.descripcionVenta = descripcionVenta;
        this.cantidadProductos = cantidadProductos;
        this.numeroFactura = numeroFactura;
        this.metodoPago = metodoPago;
        this.estadoVenta = estadoVenta;
    }

    // Getters y setters para acceder y modificar las propiedades
    public double getMontoVenta() {
        return montoVenta;
    }
    
    public void setMontoVenta(double montoVenta) {
        if (montoVenta != 0.0) {
            this.montoVenta = montoVenta;            
        } else {
            System.out.println("el valor no puede ser menor a 1.0...");
        }        
    } 
}
