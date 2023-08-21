import java.util.ArrayList;

public class CursoPresencial extends Curso {

    private String horario;

    public CursoPresencial(String nombreCurso, Profesor profesor, ArrayList<Estudiante> estudiantes, String horario) {
        super(nombreCurso, profesor, estudiantes);
        this.horario = horario;
    }

    public double CalcularAsistenciaPromedio(){
        return 0;
    }
}
