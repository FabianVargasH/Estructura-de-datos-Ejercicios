public class PilaEstatica{
    private final String[] pilaNombres;
    private int top;

    //Contructor
    public PilaEstatica(int tamanio){
        pilaNombres = new String[tamanio];
        top = -1;
    }

    private boolean estaVacia(){
        return top == -1;
    }

    private boolean estaLlena(){
        return top == pilaNombres.length -1;
    }

    public void push(String nombre){
        if(estaLlena()){
            System.out.println("La pila esta llena");
            return;
        }
        pilaNombres[++top] = nombre; //++i incrementará el valor de iy luego devolverá el valor incrementado.
    }
    public String pop(){
        if(estaVacia()){
            System.out.println("La pila esta vacia");
            return null;
        }
        return pilaNombres[top--];
    }
    public String peek(){
    if(estaVacia()){
        System.out.println("La pila esta vacia");
        return null;
    }
    return pilaNombres[top];
    }

}