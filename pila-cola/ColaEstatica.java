public class ColaEstatica {
    private final String[] colaNombres;
    private int fin;
    private int frente;
    private int cantidad;

    ColaEstatica(int tamanio){
        colaNombres = new String[tamanio];
        fin = -1;
        frente = 0;
        cantidad = 0;
    }

    private boolean estaVacia(){
        return cantidad == 0;
    }

    private boolean estaLlena(){
        return cantidad == colaNombres.length;
    }

    public void insertar(String nombre){
    if(estaLlena()){
        System.out.println("La cola esta llena");
        return;
    }
    if(fin == colaNombres.length-1){
        fin = -1;
    }
    colaNombres[++fin] = nombre; 
    cantidad++;
    }
    
    public String remover(){
    if(estaVacia()){
        System.out.println("La cola esta vacia");
        return null;
    }
    String temp = colaNombres[frente++];
    if(frente == colaNombres.length){
        frente = 0;
    }
    return temp;
    }

    public String verFrente(){
        if(estaVacia()){
            System.out.println("La cola esta vacia");
            return null;
        }
        return colaNombres[frente];
    }
}
