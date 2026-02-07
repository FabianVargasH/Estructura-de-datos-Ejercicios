public class Nodo {
    //Atributos
    private String nombre;
    private String sigla;
    private byte creditos;
    private Nodo siguiente; //Este atributo es el que establece la conexion entre un nodo y el siguiente

    //Metodos
    //Constructor
    public Nodo(String pNombre, String pSigla, byte pCreditos){
        nombre = pNombre;
        sigla = pSigla;
        creditos = pCreditos;
        siguiente = null;//Siguiente nace por defecto en null para indicar que cuando el objeto es creado todavia no tienen un objeto aislado
    }

    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getSigla(){
        return sigla;
    }
    public byte getCreditos(){
        return creditos;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }

    //Setters
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    public void setSigla(String nuevaSigla){
        sigla = nuevaSigla;
    }
    public void setCreditos(byte nuevoCreditos){
        creditos = nuevoCreditos;
    }
    public void setSiguiente(Nodo nuevoSiguiente){
        siguiente = nuevoSiguiente;
    }
    
    //toString(): Permite imprimir la informacion de un objeto
    public String toString(){
        return  "\nNombre: " + nombre +
                "\nSigla: " + sigla +
                "\nCreditos: " + creditos;
    }

}
