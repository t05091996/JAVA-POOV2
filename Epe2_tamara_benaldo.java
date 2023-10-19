/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.epe2_tamara_benaldo; //Es nuestra carpeta contenedora de la aplicacion,donde agregamos recursos o las clases.

import java.util.Scanner;

/**
 *
 * 
 */
public class Epe2_tamara_benaldo {

    public static void main(String[] args) {

        // variables iniciales e instanciacion de la clase scanner para poder leer los datos ingresados
        Scanner scanner = new Scanner(System.in);
        String nombreEmpresa = "Farolito";
        String rutEmpresa = "70.809.010-0";
        String giroEmpresa = "Comida Rapida";
        
        // Solicito los datos al usuario
        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = scanner.nextLine();
        System.out.println("Ingrese el apellido del cliente:");
        String apellidosCliente = scanner.nextLine();
        System.out.println("Ingrese la Edad del cliente:");
        int edadCliente = scanner.nextInt();
        System.out.println("Ingrese el Run del cliente:");
        String rutCliente = scanner.nextLine();
        double totalVentas=0;
        System.out.println("Ingrese la fecha de atencion:");
        String fechaVenta=scanner.next();
        System.out.println("Ingrese la descripcion de la venta");
        String descripcionVenta=scanner.next();
        System.out.println("Ingrese la cantidad de productos:");
        int cantidadProductos=scanner.nextInt();
        System.out.println("Ingrese el numero de factura:");
        String numeroFactura=scanner.next();
        System.out.println("Ingrese el metodo de pago:");
        String metodoPago=scanner.next();
        System.out.println("Ingrese el total del pedido del cliente:");
        double montoVentas = scanner.nextDouble();
        String estadoVenta="";
        //validaciones para poder ingresar los datos recibidos.
        if(montoVentas !=0.0 && cantidadProductos <0){
            System.out.println("debe Volver a ingresar todo nuevamente!");
        }else{
            estadoVenta="completada";
        }
        
        // Crea una instancia de DatosFactura
        DatosFactura factura = new DatosFactura(
                nombreCliente, apellidosCliente, edadCliente, rutCliente,
                nombreEmpresa, rutEmpresa, giroEmpresa, totalVentas, montoVentas
        );
        ventas venta=new ventas(fechaVenta, descripcionVenta, cantidadProductos, numeroFactura, metodoPago, estadoVenta);
        // Acceder a los datos calculados
        double iva = factura.getMontoIVA();
        double utilidades = factura.getUtilidades();

        // imprimo los resultados como si fuera una boleta u orden de trabajo.
        System.out.println(rutEmpresa+" "+nombreEmpresa+" "+giroEmpresa+" n° factura:" +numeroFactura);
        System.out.println("se ha realizado una venta a: "+nombreCliente+" "+apellidosCliente+" RUN "+rutCliente+" de "+edadCliente+" años.");
        System.out.println(cantidadProductos+" "+descripcionVenta+": $"+montoVentas+".- "+metodoPago+" - estado:" +estadoVenta);
        System.out.println("IVA: "+iva);
        System.out.println("Utilidades: "+utilidades);
        System.out.println("Fecha Venta: "+fechaVenta);
    }
    }

