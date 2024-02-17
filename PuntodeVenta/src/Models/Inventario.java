package Models;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> listaProductos;

    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Producto obtener(int x) {
        return listaProductos.get(x);
    }

    public int setTamaño() {
        return listaProductos.size();
    }

    public void añadir(Producto apoyoProducto) {
        listaProductos.add(apoyoProducto);
    }

    public void add(Producto nuevoProducto) {
        // TODO: Implementar la lógica para agregar un nuevo producto al inventario
    }
}