public class FabricaWidgets {
    public Widget crearWidget(String tipo) {
        if (tipo.equals("boton")) {
            System.out.println("\nSe creo un botón");
            return new Boton();
        } else if (tipo.equals("panel")) {
            System.out.println("Se creo un panel");
            return new Panel();
        } else if (tipo.equals("campoTexto")) {
            System.out.println("Se creo un campo de texto\n");
            return new CampoTexto();
        } else {
            return null;
        }
    }
}

