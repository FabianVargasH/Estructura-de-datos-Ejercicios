import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        ListaEnlazada lista = new ListaEnlazada();
        
        // algunos nodos de ejemplo
        lista.insertarNodoInicio("POO", "PROG1", (byte) 4);
        lista.insertarNodoFinal("Bases de Datos", "BD", (byte) 3);
        lista.insertarNodoFinal("Estructuras de Datos", "ED", (byte) 4);
        lista.insertarNodoInicio("Matemáticas", "MAT", (byte) 3);
        
        // Mostrar lista inicial
        lista.mostrarLista();
        
        // Buscar un nodo
        Nodo nodoBuscado = lista.buscar("ED");
        if (nodoBuscado != null) {
            System.out.println("Nodo encontrado: " + nodoBuscado.getNombre());
        }
        
        // Modificar un nodo (interactivo)
        lista.modificar();
        
        // Mostrar lista después de modificar
        lista.mostrarLista();
        
        // Eliminar un nodo
        Nodo nodoEliminado = lista.eliminar("PROG1");
        if (nodoEliminado != null) {
            System.out.println("Nodo eliminado: " + nodoEliminado.getNombre());
        }

        //Lista final
        lista.mostrarLista();
    }
}
