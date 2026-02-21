import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListaEnlazada {

    private Nodo primero;

    public ListaEnlazada(){
        primero = null;
    }
    public Nodo getPrimero(){
        return primero;
    }
    public void setPrimero(Nodo nuevoPrimero){
        primero = nuevoPrimero;
    }
    public String toString(){
        return "Primer nodo: " + primero;
    }
    //Operaciones
    public void insertarNodoInicio(String nombre, String sigla, byte creditos){
        Nodo nodoInsertar = new Nodo(nombre, sigla, creditos);//Aparece un nuevo nodo
        nodoInsertar.setSiguiente(primero);//Al nuevo nodo se le pone como siguiente el que esta de primero para no perder la secuencia
        setPrimero(nodoInsertar);//El nuevo nodo, ya conectado con los contenidos previos de la lista, se declara como nuevo primero
    }
    private boolean estaVacia(){
        return primero == null;
    }


    public void insertarNodoFinal(String nombre, String sigla, byte creditos){
        Nodo nodoInsertar = new Nodo(nombre, sigla, creditos);
        if(estaVacia()){
            setPrimero(nodoInsertar);
            return;
        }
        Nodo temp = primero;
        while(temp.getSiguiente()!=null){
            temp = temp.getSiguiente();
        }
        temp.setSiguiente(nodoInsertar);
    }

    public Nodo buscar(String sigla){
        if(estaVacia()){
            System.out.println("La lista esta vacia");
            return null;
        }
        Nodo temp = primero;
        while(temp!= null && !temp.getSigla().equals(sigla)){
            temp = temp.getSiguiente();
        }
        if(temp==null){
            System.out.println("La sigla no se encontró en la lista");
        }else{
            System.out.println("La sigla se encontro en la lista");
        }
        return temp;
    }

    public Nodo eliminar(String sigla){
        if(estaVacia()){
            System.out.println("La lista esta vacia");
            return null;
        }
        Nodo temp = primero;
        Nodo anteriorTemp = temp;
        while(temp!= null && !temp.getSigla().equals(sigla)){
            anteriorTemp = temp;
            temp = temp.getSiguiente();
        }
        if(temp==null){
            System.out.println("La sigla no se encontró en la lista");
        }else{
            System.out.println("La sigla se encontro en la lista");
            anteriorTemp.setSiguiente(temp.getSiguiente());
        }
        return temp;
    }

    //MostrarLista() -> recorrer la lista imprimiendo cada uno de sus nodos
    //Modifiar() -> recibe los datos pertenencientes al nodo y los actualiza
    // La modificacion puede recibir desde parentesis los datos que uitilizara o bien pedirlos internamente

    public void mostrarLista(){
        if(estaVacia()){
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo temp = primero;
        int contador = 1;
        while(temp != null){
            System.out.println("Nodo " + contador + ":");
            System.out.println(" Nombre: " + temp.getNombre());
            System.out.println(" Sigla: " + temp.getSigla());
            System.out.println(" Creditos: " + temp.getCreditos());
            System.out.println();

            temp = temp.getSiguiente();
            contador++;
        }
    }

    public void modificar() throws IOException{
        if(estaVacia()){
            System.out.println("La lista esta vacia");
            return;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("- - Modificar lista - -");
        mostrarLista();

        System.out.print("\n Ingrese la sigla del nodo que quiere modificar:");
        String siglaBuscar = reader.readLine();

        Nodo nodoModificar = buscar(siglaBuscar);
        if(nodoModificar != null){
            System.out.println("Estos son los datos actuales que tiene el nodo:");
            System.out.println("Nombre: " + nodoModificar.getNombre());
            System.out.println("Sigla: " + nodoModificar.getSigla());
            System.out.println("Creditos: " + nodoModificar.getCreditos());

            System.out.println("Ingrese los datos nuevos:");
            System.out.print("Nuevo nombre deseado:");
            String nuevoNombre = reader.readLine();
            nodoModificar.setNombre(nuevoNombre);

            System.out.print("Nueva sigla deseada: ");
            String nuevaSigla = reader.readLine();
            nodoModificar.setSigla(nuevaSigla);

            System.out.print("Nuevos creditos deseados: ");
            String nuevoCreditos = reader.readLine();
            byte nuevosCreditos = Byte.parseByte(nuevoCreditos);
            if(nuevosCreditos > 0){
                nodoModificar.setCreditos(nuevosCreditos);
            }else{
                System.out.println("Los creditos deben ser mayores a 0, se mantienen los anteriores");
            }
        System.out.println("\n====Nodos modificados exitosamente====");
        System.out.println("Datos actualizados:");
        System.out.println("  Nombre: " + nodoModificar.getNombre());
        System.out.println("  Sigla: " + nodoModificar.getSigla());
        System.out.println("  Créditos: " + nodoModificar.getCreditos());
        }
    }
}
