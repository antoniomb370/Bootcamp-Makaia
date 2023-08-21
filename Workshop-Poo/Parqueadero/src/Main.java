public class Main {
    public static void main(String[] args) {

        //Creando parqueadero

        Parqueadero parqueadero = new Parqueadero(10, 10, 4000);

        //Creando Carros

        Carro carro_1 = new Carro("543we", "Toyota", "sumo");
        Carro carro_2 = new Carro("234wt", "Fort", "Ranger");
        Carro carro_3 = new Carro("det23e", "Nissan", "Frontier");
        Carro carro_4 = new Carro("del40w", "Nissan", "Frontier");

        System.out.println(" \n-------------------- vienvenido al Estacionamiento Makaia ---------------- \n ");

        System.out.println("-------------------- Estacionando Vehiculo ---------------- \n");

        boolean estacionarCarro_1 = parqueadero.parquearCarro(carro_1, 1, 1);
        if (estacionarCarro_1) {
            System.out.println("Carro 1 estacionado con éxito. \n");

        } else {
            System.out.println("Carro 1 no se puede parquear, parqueadero invalido intente en otro lugar. \n");

        }

        boolean estacionarCarro_2 = parqueadero.parquearCarro(carro_2, 10, 1);
        if (estacionarCarro_2) {
            System.out.println("Carro 2 estacionado con éxito. \n");

        } else {
            System.out.println("Carro 2 no se puede parquear, parqueadero invalido intente en otro lugar. \n");

        }

        boolean estacionarCarro_3 = parqueadero.parquearCarro(carro_3, 4, 1);
        if (estacionarCarro_3) {
            System.out.println("Carro 3 estacionado con éxito. \n");

        } else {
            System.out.println("Carro 3 no se puede parquear, parqueadero invalido intente en otro lugar. \n");

        }

        boolean estacionarCarro_4 = parqueadero.parquearCarro(carro_4, 3, 1);
        if (estacionarCarro_4) {
            System.out.println("Carro 4 estacionado con éxito. \n");

        } else {
            System.out.println("Carro 4 no se puede parquear, parqueadero invalido intente en otro lugar. \n");

        }


        double costoCarro_1 = parqueadero.cobrarPorTiempo(carro_1, 10);
        String datosCarro_1 = carro_1.mostrarDatosCarro();

        double costoCarro_2 = parqueadero.cobrarPorTiempo(carro_2, 3);
        String datosCarro_2 = carro_2.mostrarDatosCarro();

        double costoCarro_3 = parqueadero.cobrarPorTiempo(carro_3, 24);
        String datosCarro_3 = carro_3.mostrarDatosCarro();


        System.out.println("Costo de estacionamiento para el carro 1 " + "con los datos: " + datosCarro_1 + " Costo $ " + costoCarro_1 + "\n");
        System.out.println("Costo de estacionamiento para el carro 2 " + "con los datos: " + datosCarro_2 + " Costo $ " + costoCarro_1 + "\n");
        System.out.println("Costo de estacionamiento para el carro 3 " + "con los datos: " + datosCarro_3 + " Costo $ " + costoCarro_1 + "\n");

        System.out.println("Estado actual del parqueadero:\n " +
                " los espacios ocupados se indican con una X \n " +
                " los espacios desocupados se indican con una O \n ");
        parqueadero.mostrarEstadoParqueadero();

    }


}