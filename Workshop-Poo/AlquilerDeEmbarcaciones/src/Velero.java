public class Velero extends Embarcacion {

   private int cantidaDeMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslara, int cantidaDeMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslara);
        this.cantidaDeMastiles = cantidaDeMastiles;
    }

    public boolean evaluarTamanio() {

        return cantidaDeMastiles > 4;
    }
}
