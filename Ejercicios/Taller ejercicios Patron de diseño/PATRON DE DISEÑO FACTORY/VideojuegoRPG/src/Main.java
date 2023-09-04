public class Main {
    public static void main(String[] args) {

        //instanciando la fabrica de personajes
        FabricaPersonajes fabrica = new FabricaPersonajes();
        // creando habilidades
        Habilidad habilidadGuerrero = new AtaqueEspada();
        DispararFlecha habilidadArquero = new DispararFlecha();
        LanzarHechizo habilidadMago = new LanzarHechizo();

        // Crear Personajes
        Personaje guerrero = fabrica.crearPersonaje("Guerrero", "Zoro", 20, habilidadGuerrero);
        Personaje arquero = fabrica.crearPersonaje("Arquero", "Legolas", 50, habilidadArquero);
        Personaje mago = fabrica.crearPersonaje("Mago", "Potter", 30, habilidadMago);
        Personaje mago_1 = fabrica.crearPersonaje("Mago", "Harry", 40, habilidadMago);


        System.out.println("Información personajes Creados");
        guerrero.mostrarInfoPersonaje();
        habilidadGuerrero.usarHabilidad();
        arquero.mostrarInfoPersonaje();
        habilidadArquero.usarHabilidad();
        mago.mostrarInfoPersonaje();
        habilidadMago.usarHabilidad();
        mago_1.mostrarInfoPersonaje();
        habilidadMago.usarHabilidad();


    }

}