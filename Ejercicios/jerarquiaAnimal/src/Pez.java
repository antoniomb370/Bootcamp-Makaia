public class Pez extends Animal {

    private String tipoEscamas;
    private boolean viveEnAgua;

    public Pez(String nombre, int edad, String tipoEscamas, boolean viveEnAgua) {
        super(nombre, edad);
        this.tipoEscamas = tipoEscamas;
        this.viveEnAgua = viveEnAgua;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public boolean getViveEnAgua() {
        return viveEnAgua;
    }

    public boolean ViveEnAgua() {
        return viveEnAgua;
    }

    public void tipoEscamas() {

    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy un pez y hago sondio especifico (bluu, bluue)");
    }

    public void nadar(){
        if(viveEnAgua){
            System.out.println("El pez nada");
        }else{
            System.out.println("el pez esta fuera del agua");
        }
    }
}
