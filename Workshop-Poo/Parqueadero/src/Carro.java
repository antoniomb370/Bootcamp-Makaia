
public class Carro {

    private String placa;
    private String marca;
    private String modelo;



    public Carro(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;

    }
    //Create a function to perform a sum


    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

   public String mostrarDatosCarro(){

        String datos =   " Placa: " + placa + " Marca: " + marca + " Modelo: " + modelo;

        return datos;

   }


}
