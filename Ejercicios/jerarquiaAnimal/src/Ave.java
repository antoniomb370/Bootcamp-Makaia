public class Ave  extends  Animal implements  Cualidad{
    private String tipoPlumaje;
    private boolean vuela;

    public Ave(String nombre, int edad, String tipoPlumaje, boolean vuela) {
        super(nombre, edad);
        this.tipoPlumaje = tipoPlumaje;
        this.vuela = vuela;
    }

    public String getTipoPlumaje() {
        return tipoPlumaje;
    }

    public boolean isVuela() {
        return vuela;
    }

    @Override
    public void hacerSonido() {
        System.out.println("soy un ave y emito algun sonido caracteristico");
    }

    public void volar() {
        if (vuela) {

            System.out.println(" El ave "+ getNombre() + " vuela ");

        }else {

            System.out.println(" El ave "+ getNombre() + "No vuela");
        }
    }

    @Override
    public void correr() {

    }

    @Override
    public void valar() {

    }
}
