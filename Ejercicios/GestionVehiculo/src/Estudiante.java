public class Estudiante extends Persona implements Estadisticas {

    private String carnet;
    private double[] notas;

    public Estudiante(String nombre, int edad, String genero, String carnet, double[] notas) {
        super(nombre, edad, genero);
        this.carnet = carnet;
        this.notas = notas;
    }

    @Override
    public double calcularPromedio() {
        return 0;
    }

    @Override
    public double calcularMaximo() {
        return 0;
    }

    @Override
    public double calcularMinimo() {
        return 0;
    }
}
