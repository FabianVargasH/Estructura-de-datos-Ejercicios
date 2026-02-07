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
    public void insertarNodoFinal(String nombre, String sigla, byte creditos){
        Nodo nodoInsertar = new Nodo(nombre, sigla, creditos);
        if(primero == null){
            setPrimero(nodoInsertar);
            return;
        }
        Nodo temp = primero;
        while(temp.getSiguiente()!=null){
            temp = temp.getSiguiente();
        }
        temp.setSiguiente(nodoInsertar);
        
    }
}
