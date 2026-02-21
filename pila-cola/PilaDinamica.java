import java.util.ArrayList;
public class PilaDinamica{

    private ArrayList<String> pilaNombres;

    public PilaDinamica(){
        pilaNombres = new ArrayList<>();
    }

    public void push(String nombre){
        pilaNombres.add(nombre);
    }

    public String pop(){
    if(pilaNombres.isEmpty()){
        System.out.println("La pila esta vacia");
        return null;
    }
    return pilaNombres.removeLast();
    }

    public String peek(){
    if(pilaNombres.isEmpty()){
        System.out.println("La pila esta vacia");
        return null;
    }
    return pilaNombres.getLast();
    }

    

}