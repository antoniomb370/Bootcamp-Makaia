import java.util.Scanner;

public class Yate extends Embarcacion {

    private int cantidadDeCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslara, int cantidadDeCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslara);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }

    public void comprar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Desea comprar el yate? (S/N): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("S")) {
            System.out.println("Yate vendido.");
        } else if (respuesta.equalsIgnoreCase("N")) {
            System.out.println("No se vendió el yate.");
        } else {
            System.out.println("Respuesta no válida.");
        }

        scanner.close();
    }

    public String esLujoso() {

        if (cantidadDeCamarotes > 7) {
            return " Es lujoso";
        } else {
            return " No es lujoso";
        }

    }

}
