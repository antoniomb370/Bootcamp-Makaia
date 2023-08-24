public class Mamifero extends  Animal{
    private String tipoPelo;
    private boolean esCarnivero;


    public Mamifero(String nombre, int edad, String tipoPelo, boolean esCarnivero) {
        super(nombre, edad);
        this.tipoPelo = tipoPelo;
        this.esCarnivero = esCarnivero;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public boolean isEsCarnivero() {
        return esCarnivero;
    }

    public boolean esCarnivero() {
        return esCarnivero;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy un mamifero y hago sondio especifico");
    }

    public void correr(){

        System.out.println("El mamifero " + getNombre() + " esta corriendo");

    }
}
