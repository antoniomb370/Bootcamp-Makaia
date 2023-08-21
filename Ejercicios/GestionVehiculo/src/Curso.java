import java.util.ArrayList;

public abstract class  Curso {

  private String nombreCurso;
  private Profesor profesor;
  private ArrayList<Estudiante> estudiantes;

    public Curso(String nombreCurso, Profesor profesor, ArrayList<Estudiante> estudiantes) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }


}
