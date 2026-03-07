public class NodoABB{

    private final String llave;
    private NodoABB izquierdo;
    private NodoABB derecho;
    private String nombre;

    public NodoABB(String llave, String nombre){
        this.llave = llave;
        this.izquierdo = null;
        this.derecho = null;
        this.nombre = nombre;
    }
    
    public String getLlave(){
        return llave;
    }
    public NodoABB getIzquierdo(){
        return izquierdo;
    }
    public NodoABB getDerecho(){
        return derecho;
    }
    public String getNombre(){
        return nombre;
    }
    public void setIzquierdo(NodoABB izquierdo){
        this.izquierdo = izquierdo;
    }
    public void setDerecho(NodoABB derecho){
        this.derecho = derecho;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String toString(){
        return "Llave: " + this.llave + "\nNombre: " + nombre;
    }

}