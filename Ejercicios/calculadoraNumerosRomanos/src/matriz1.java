import java.util.Scanner;

public class matriz1 {
    public static void main(String[] args) {

        Double[][] matrix = new Double[4][4];
        Scanner scanner = new Scanner(System.in);
        Double suma = 0.0;
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {

                System.out.println("Ingresa la nota del alumnos: " + (f+1));
                matrix[f][c] = scanner.nextDouble();
                suma += matrix[f][c];
            }

            matrix[f][3] = suma / 3;
            suma = 0.0;

        }

        for (int f = 0; f < 4; f++) {
            System.out.println(" las notas del alumnos numero: " + (f + 1 )+ " : " + "  son:");


            for (int c = 0; c < c; c++) {
                System.out.println("Nota numero " + (c + 1) + " " + matrix[f][c]);
            }

            System.out.println(" el promedio de las notas es: "  + matrix[f][3]);
        }


    }
}