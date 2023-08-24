
/**
 * clsase parqueadero
 * */
public class Parqueadero {


    private Carro[][] matrizEstacionamiento;


    private int filas;


    private int columnas;
    private double tariafaPorHora;

    public Parqueadero( int filas, int columnas, double tariafaPorHora) {
        this.matrizEstacionamiento = new Carro[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
        this.tariafaPorHora = tariafaPorHora;
    }

    /***
     *
     * @author Antonio Marroquin
     * @param filas
     * @param columnas
     * @Type boolean
     * @
     */

    public boolean parquearCarro(Carro carro, int filas, int columnas) {
        if (filas >= 0 && filas < matrizEstacionamiento.length && columnas >= 0 && columnas < matrizEstacionamiento[0].length) {
            if (matrizEstacionamiento[filas][columnas] == null) {
                matrizEstacionamiento[filas][columnas] = carro;
                return true;


            }
        }
        return false;
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        return horas * tariafaPorHora;
    }

    public void mostrarEstadoParqueadero() {
        for (int fila = 0; fila < matrizEstacionamiento.length; fila++) {
            for (int columna = 0; columna < matrizEstacionamiento[fila].length; columna++) {
                if (matrizEstacionamiento[fila][columna] != null) {
                    System.out.print(" | X | ");
                } else {
                    System.out.print("| 0 |");
                }
            }
            System.out.println();
        }
    }

}



