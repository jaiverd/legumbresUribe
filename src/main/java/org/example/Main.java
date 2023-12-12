package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     String nombreProducto;
     String distribuidor;
     double costoLote;
     double costoVentaPublico;
     double totalCompra;
     int cantidadCompraProducto;

     //PROCESO


     Scanner leerDato = new Scanner(System.in);
     System.out.println("***********************");
     System.out.println("Bienvenido a Frugal SAS");
     System.out.println("***********************");
     System.out.println("ingresa el nombre del producto que ingresa a bodega");
     nombreProducto = leerDato.nextLine();
     System.out.println("ingresa el nombre del distribuidor de la mercancia");
     distribuidor = leerDato.nextLine();
     System.out.println("cuanto cuesta el lote que ingreso");
     costoLote = leerDato.nextDouble();

     System.out.println("********************************");
     System.out.println("resumen ingreso mercancia");
     System.out.println("lote que entra:" + nombreProducto);
     System.out.println("costo total $" + costoLote);
     System.out.println("entregado por" + distribuidor);
     System.out.println("*******************************");

     System.out.println("\n+++venta al detal++++\n");
     costoVentaPublico = 5000;

     System.out.println("apreciado usuario el costo unitario " + nombreProducto + "es de $" + costoVentaPublico);

     System.out.println("digita la cantidad" + nombreProducto+"que quieres comprar");
     cantidadCompraProducto = leerDato.nextInt();

     // calculando el valor de una variable
     totalCompra = costoVentaPublico * cantidadCompraProducto;
     System.out.println("el valor de su compra es $" + totalCompra);


    }


}