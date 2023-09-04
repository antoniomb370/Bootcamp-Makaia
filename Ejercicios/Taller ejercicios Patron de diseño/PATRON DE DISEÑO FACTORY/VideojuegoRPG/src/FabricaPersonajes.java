public class FabricaPersonajes {

      public static Personaje crearPersonaje(String tipo, String nombre, int nivel, Habilidad habilidad){
         Personaje personaje = null;
         switch(tipo){
             case "Guerrero":
                  personaje = new Guerrero(nombre, nivel);
                  System.out.println("\nSe creo el guerrero \n");
                  break;
               case "Mago":
                  personaje = new Mago(nombre, nivel);
                  System.out.println("Se creo un mago  \n");
                  break;
               case "Arquero":
                  personaje = new Arquero(nombre, nivel);
                  System.out.println("Se creo un arquero \n" );
                  break;

                  default:
                  System.out.println("No existe el tipo de personaje " + tipo);
         }
         return personaje;
      }
}
