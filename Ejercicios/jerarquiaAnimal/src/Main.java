public class Main {
    public static void main(String[] args) {

        Animal perro= new Mamifero("coqui",2,"largo",true);
        Animal loro = new Ave("pepe",3,"multi color",true);
        Animal pez = new Pez("pez",3,"duras",true);

        System.out.println("Nombre del perro " + perro.getNombre());
        System.out.println("Edad del perro " + perro.getEdad());
        ((Mamifero)perro).hacerSonido();
        perro.comer();
        ((Mamifero)perro).correr();

        System.out.println("****************************************************************");

        System.out.println("Nombre del loro " + loro.getNombre());
        System.out.println("Edad del loro " + loro.getEdad());
        ((Ave)loro).hacerSonido();
       loro.comer();
        ((Ave)loro).volar();

        System.out.println("****************************************************************");

        System.out.println("Nombre del pez payaso " + pez.getNombre());
        System.out.println("Edad del loro " + pez.getEdad());
        ((Pez)pez).hacerSonido();
        loro.comer();
        ((Pez)pez).nadar();

    }


}