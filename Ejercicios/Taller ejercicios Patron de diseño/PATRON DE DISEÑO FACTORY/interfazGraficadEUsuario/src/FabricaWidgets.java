public class FabricaWidgets {
    public Widget crearWidget(String tipo) {
        if (tipo.equals("boton")) {
            return new Boton();
        } else if (tipo.equals("panel")) {
            return new Panel();
        } else if (tipo.equals("campoTexto")) {
            return new CampoTexto();
        } else {
            return null;
        }
    }
}

