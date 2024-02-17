import Models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner key =  new Scanner(System.in);
    private static Caja caja=new Caja();
    private static RegistrodeVentas contador=new RegistrodeVentas();
    private static Inventario inventar=new Inventario();


    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Bienvenido al sistema de punto de venta");
            System.out.println("Por favor, selecciona tu rol:");
            System.out.println("1. Administrador");
            System.out.println("2. Cajero");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = key.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste Administrador. ¿Qué acción deseas realizar?");
                    System.out.println("1. Realizar apertura de caja");
                    System.out.println("2. Realizar arqueo de caja");
                    int opcionAdministrador = key.nextInt();
                    switch (opcionAdministrador) {
                        case 1:
                            realizarAperturaCaja();
                            break;
                        case 2:
                            realizarArqueoCaja();
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Seleccionaste Cajero. ¿Qué acción deseas realizar?");
                    System.out.println("1. Registrar venta");
                    System.out.println("2. Alta de producto");
                    int opcionCajero = key.nextInt();
                    Cajero cajero = new Cajero();
                    switch (opcionCajero) {
                        case 1:
                            registrarVenta();
                            break;
                        case 2:
                            altaProducto();
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 3);
    }
    public static void realizarAperturaCaja(){

        int monto;
        System.out.println("¿Cuanto dinero desea ingresar");
        monto= key.nextInt();
        caja.setCantidadDineroInicial(monto);

    }
    public static void realizarArqueoCaja(){
        RegistrodeVentas registros=new RegistrodeVentas();
        ArrayList<Ventas> registro=registros.getVentas();
        int controlador;
        for (int i =0;i<registro.size();i++){
            Ventas objetoVenta= registro.get(i);
            int cantidad = objetoVenta.getCantidadproducto();
            int precio = objetoVenta.getPrecioproducto();
            String nombre=objetoVenta.getNombreproducto();
            System.out.println("En venta " + (i+1) + "Se vendio "+cantidad+"de"+nombre);
            caja.setCantidadDineroInicial(cantidad*precio);
        }
        System.out.println("La cantidad de dinero inicial es"+caja.getCantidadDineroInicial());
        System.out.println("La cantidad de dinero final es"+caja.getCantidadDeDinero());

    }
    public static void registrarVenta(){
        int cantidadPago = 0;
        Ventas venta=new Ventas();
        key.nextLine();
        System.out.println("Ingresa el nombre del producto");
        String nombre=key.nextLine();
        System.out.println("Ingresame el precio del producto");
        int precio=key.nextInt();
        System.out.println("Ingresame la cantidad");
        int cantidad= key.nextInt();
        venta.setNombreproducto(nombre);
        venta.setPrecioproducto(precio);
        venta.setCantidadproducto(cantidad);
        venta.setCantidadPago(cantidad*precio);
        cantidadPago = venta.getCantidadPago();
        System.out.println("El monto a pagar es "+venta.getCantidadPago());
        caja.setCantidadDeDinero(cantidadPago);
        contador.añadirVenta(venta);
        for (int i=0;inventar.setTamaño()<i;i++){
            Producto verProducto= inventar.obtener(i);
            if (verProducto.getNombre()==nombre){
                verProducto.setCantidadComprado(cantidad);
            }
        }
    }
    public static void altaProducto(){
        Producto nuevoProducto=new Producto();
        key.nextLine();
        System.out.println("Ingresa el nombre del producto");
        String nombre= key.nextLine();
        System.out.println("Ingresa el precio del producto");
        int precio= key.nextInt();
        System.out.println("Ingresame el id del producto");
        int id= key.nextInt();
        System.out.println("Ingresame la cantidad del producto");
        int cantida= key.nextInt();
        nuevoProducto.setId(id);
        nuevoProducto.setNombre(nombre);
        nuevoProducto.setPrecio(precio);
        nuevoProducto.setCantidad(cantida);
        inventar.add(nuevoProducto);



    }
}
