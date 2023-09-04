public abstract class Personaje {

    private String nombre;
    private int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
//
    }
    public void mostrarInfoPersonaje() {
        System.out.println("\nNombre: " + nombre + " nivel: " + nivel);

    }

}
