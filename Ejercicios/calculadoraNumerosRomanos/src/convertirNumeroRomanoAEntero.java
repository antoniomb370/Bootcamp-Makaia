import java.util.Scanner;


public class convertirNumeroRomanoAEntero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor a convertir");
        String letrasRomanos = scanner.nextLine();
        String numeroRomano = letrasRomanos.toUpperCase();
        System.out.println("roman: " + numeroRomano);
        int integerNumber = romanoAentero(numeroRomano); // Llama a la función para convertir a número entero
        System.out.println("Romano: " + numeroRomano + " entero: " + integerNumber);
    }

    public static int romanoAentero(String letras) {
        int resultado = 0;
        int valorAnterior = 0;

        for (int i = letras.length() - 1; i >= 0; i--) { // Recorre las letras romanas de derecha a izquierda
            char cararterRomano = letras.charAt(i); // Obtiene el carácter romano actual
            int valorActual = 0; // Valor numérico correspondiente al carácter

            // Asigna valores numéricos basados en el carácter romano
            switch (cararterRomano) {
                case 'I':
                    valorActual = 1;
                    break;
                case 'V':
                    valorActual = 5;
                    break;
                case 'X':
                    valorActual = 10;
                    break;
                case 'L':
                    valorActual = 50;
                    break;
                case 'C':
                    valorActual = 100;
                    break;
                case 'D':
                    valorActual = 500;
                    break;
                case 'M':
                    valorActual = 1000;
                    break;
            }


            if (valorActual == 0) {
                System.out.println("numero romano invalido: " + cararterRomano);
                return -1; // retorna -1 para que entre en el error
            }


            if (valorActual < valorAnterior) {
                resultado -= valorActual;
            } else {
                resultado += valorActual;
            }
            valorAnterior = valorActual;
        }

        return resultado; // Devuelve el resultado final de la conversión
    }
}
