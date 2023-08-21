import java.util.ArrayList;

public class Profesor extends Persona {

    private String titulo;

    public Profesor(String nombre, int edad, String genero, String titulo, ArrayList<String> materias) {
        super(nombre, edad, genero);
        this.titulo = titulo;
        this.materias = materias;
    }

    private  ArrayList<String> materias;
}
