import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        System.out.println("--------------------------------ejercicio_1---------------------------- ");
        Scanner numeroCliente = new Scanner(System.in);
        System.out.println("Ingrese el numero de cliente");
        int numero = numeroCliente.nextInt();

        if (numero == 1000) {
            System.out.println("ganaste un premio ");
        } else {
            System.out.println("sigue participando");

        }

        System.out.println("--------------------------------ejercicio_2---------------------------- ");
        Scanner numeroMayor = new Scanner(System.in);
        System.out.println("Ingrese dos numeros ");

        int num_1 = numeroMayor.nextInt();
        int num_2 = numeroMayor.nextInt();

        if (num_1 < num_2) {
            System.out.println("el numero mayor es:" + num_2);

        } else if (num_1 > num_2) {
            System.out.println("el numero mayor es:" + num_1);
        } else if (num_1 == num_2) {
            System.out.println("los numeros " + num_1 + " y " + num_2 + " son iguales: ");
        }

        System.out.println("--------------------------------ejercicio_3---------------------------- ");


        if (numero % 2 == 0) {

            System.out.println("el numero " + numero + " es par");

        } else {

            System.out.println("el numero " + numero + " no es par");
        }

        System.out.println("--------------------------------ejercicio_4---------------------------- ");

        int contador = 0;

        for (int i = 0; i < 100; i++) {
            contador++;

        }
        System.out.println("contador " + contador);


        System.out.println("--------------------------------ejercicio_5---------------------------- ");

        int suma = 0;

        for (int i = 100; i < 200; i++) {
            suma += i;
            System.out.println("suma " + suma);
        }


        System.out.println("--------------------------------ejercicio_6---------------------------- ");

        int numeroAlReves = 10;
        for (int i = 1; i < 10; i++) {
            numeroAlReves -= 1;
            System.out.println("numeroAlReves " + numeroAlReves);
        }

        System.out.println("--------------------------------ejercicio_7---------------------------- ");
        Scanner numEdad = new Scanner(System.in);
        System.out.println("Ingrese su edad ");
        int edad = numEdad.nextInt();
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();
        System.out.println("fecha " + anioActual);

        anioActual -= edad + 1;
        System.out.println("anio " + edad);

        for (int i = 1; i < edad + 1; i++) {

            anioActual += 1;
            System.out.println("los años que ha cumplido " + anioActual);
        }
        System.out.println("--------------------------------ejercicio_7---------------------------- ");

        Scanner sillas = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de sillas ");
        int cantidadSillas = sillas.nextInt();

        int precio = 40000 * cantidadSillas;
        System.out.println("precio " + precio);
        double descuento = 0;

        if (cantidadSillas > 5 && cantidadSillas <= 12) {
            descuento = precio * 0.10;
            System.out.println("descuento " + descuento);
            precio -= descuento;
            System.out.println("el valor a pagar aplicando el descuento es: " + precio);
        } else if (cantidadSillas > 12 && cantidadSillas <= 40) {

            descuento = precio * 0.20;
            System.out.println("descuento " + descuento);
            precio -= descuento;
            System.out.println("el valor a pagar aplicando el descuento es: " + precio);
        } else if (cantidadSillas > 40) {

            descuento = precio * 0.30;
            System.out.println("descuento " + descuento);
            precio -= descuento;
            System.out.println("el valor a pagar aplicando el descuento es: " + precio);
        }


    }


}

//. solicitar al usuario un número de cliente. si el número es el 1000, imprimir
//       “ganaste un premio” de lo contrario imprimir “sigue participando”.
