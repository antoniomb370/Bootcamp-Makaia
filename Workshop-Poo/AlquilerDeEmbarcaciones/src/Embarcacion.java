import java.util.Date;

public class Embarcacion {

    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private double eslara;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslara) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslara = eslara;
    }

    public double calcularAlquiler() {
        double alquiler = precioBase;
        if (anioFabricacion > 2020) {
            alquiler += valorAdicional;
        }
        return alquiler;
    }
}

