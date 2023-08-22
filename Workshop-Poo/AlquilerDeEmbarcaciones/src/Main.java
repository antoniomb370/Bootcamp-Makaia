public class Main {
    public static void main(String[] args) {
        // Crear instancias de capitanes, veleros y yates
        Capitan capitan_1 = new Capitan("Carlos", "Ruiz Zapata", "Cap1232");
        Capitan capitan_2 = new Capitan("Juan", "Zapata", "Cap0012");
        Velero velero_1 = new Velero(capitan_1, 1000000, 200000, 2019, 15, 5);
        Yate yate_1 = new Yate(capitan_2, 5000000, 500000, 2022, 40, 8);
        Velero velero_2 = new Velero(capitan_1, 2000000, 400000, 2023, 17, 8);
        Yate yate_2 = new Yate(capitan_2, 10000000, 1000000, 2007, 70, 16);

        // Calcular valores y tamaños de embarcaciones
        double valorAlquilerVelero_1 = velero_1.calcularAlquiler();
        String tamanioVelero_1 = velero_1.evaluarTamanio();
        String nivelLujoYate_1 = yate_1.esLujoso();

        // Imprimir información sobre las embarcaciones
        System.out.println(" -----------Bienvenido a MAKAI alquiler de embarcaciones-------------- " + " \n");
        System.out.println("Valor del alquiler del velero 1: $" + valorAlquilerVelero_1 + " \n");
        System.out.println("¿ El velero es agrande ?  " + tamanioVelero_1 + " \n");
        System.out.println("Valor del alquiler Yate 1: $" + valorAlquilerVelero_1 + " \n");
        System.out.println("¿ El Yate es lujoso ?  " + nivelLujoYate_1 + " \n");

        // Opcion de comprar Yate
        yate_1.comprar();
    }
}