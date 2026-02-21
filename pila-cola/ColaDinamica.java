import java.util.ArrayList;
public class ColaDinamica {
    private ArrayList<String> colaNombres;


    public ColaDinamica(){
        colaNombres = new ArrayList<>();
    }

    public void insertar(String nombre){
        colaNombres.add(nombre);
    }

    public String remover(){
        if(colaNombres.isEmpty()){
            System.out.println("La cola esta vacia");
        }
        return colaNombres.removeFirst();
    }

    public String verFrente(){
    if(colaNombres.isEmpty()){
        System.out.println("La cola esta vacia");
    }
    return colaNombres.getFirst();
    }

    
}
