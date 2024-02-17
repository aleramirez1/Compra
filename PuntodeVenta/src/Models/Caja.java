package Models;

public class Caja {

    private int cantidadDineroInicial;
    private int cantidadDeDinero;

    public void setCantidadDineroInicial(int cantidadDineroInicial) {
        this.cantidadDineroInicial = cantidadDineroInicial;
    }
    private void setCantidadDeDinero(){
        cantidadDeDinero=cantidadDineroInicial;
    }
    public void setCantidadDeDinero(int monto){
        cantidadDeDinero=cantidadDineroInicial-monto;
    }

    public int getCantidadDineroInicial() {
        return cantidadDineroInicial;
    }

    public int getCantidadDeDinero() {
        return cantidadDeDinero;
    }
}