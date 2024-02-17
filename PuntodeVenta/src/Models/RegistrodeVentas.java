package Models;

import java.util.ArrayList;

public class RegistrodeVentas {
    private ArrayList<Ventas> registro;

    public RegistrodeVentas() {
        registro = new ArrayList<>();
    }

    public void añadirVenta(Ventas venta) {
        registro.add(venta);
    }

    public ArrayList<Ventas> getVentas() {
        return registro;
    }

    public void agregarVenta(Ventas ventasApoyo) {
        registro.add(ventasApoyo);
    }
}