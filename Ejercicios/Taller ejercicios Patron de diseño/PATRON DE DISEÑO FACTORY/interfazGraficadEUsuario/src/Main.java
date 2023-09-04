public class Main {
    public static void main(String[] args) {

        //Instanciando FabricaWidgets

        FabricaWidgets fabricaWidgets = new FabricaWidgets();

        Widget boton = fabricaWidgets.crearWidget("boton");
        Widget panel = fabricaWidgets.crearWidget("panel");
        Widget campoTexto = fabricaWidgets.crearWidget("campoTexto");

        System.out.println("Raealizando acciones con los widgets\n");
        campoTexto.click();
        campoTexto.draw();
        boton.click();
        boton.draw();
        panel.click();
        panel.draw();

    }
}