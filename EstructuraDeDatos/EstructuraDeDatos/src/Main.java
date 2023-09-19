public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.agregarHead(5);
        linkedList.agregarHead(3);
        linkedList.agregarHead(0);
        linkedList.agregarTail(10);
        System.out.println("Datos de la lista");
        linkedList.mostrarTodos();
        linkedList.agregarPorPosicion(2, 99);
        System.out.println("Se agrego un nodo en la posicion 2");
        linkedList.mostrarTodos();
        System.out.println("Se elimino el Head");
        linkedList.eliminarHead();
        linkedList.mostrarTodos();
        System.out.println("Se elimino el Tail");
        linkedList.eliminarTail();
        linkedList.mostrarTodos();
        linkedList.reemplarPorPosicion(2, 100);
        System.out.println("Se reemplazo el nodo en la posicion 2");
        linkedList.mostrarTodos();

        //[3]->[5]->[10]
        // [0] -> [3] -> [5] -> [10]
    }
}