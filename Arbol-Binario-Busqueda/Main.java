

public class Main {
    public static void main(String[] args) {
        
        ABB arbolPersonas = new ABB();
        arbolPersonas.insertar("50", "A");
        arbolPersonas.insertar("30", "B");
        arbolPersonas.insertar("60", "C");
        arbolPersonas.insertar("20", "D");
        arbolPersonas.insertar("40", "E");
        arbolPersonas.insertar("70", "F");
        arbolPersonas.preOrden(arbolPersonas.getRaiz());
        System.out.println("- - - - -");
        arbolPersonas.postOrden(arbolPersonas.getRaiz());
        System.out.println("- - - - - -");
        arbolPersonas.preOrden(arbolPersonas.getRaiz());

/*      arbolPersonas.insertar("d11", "Fabian");
        arbolPersonas.insertar("d11", "Fabian");
        arbolPersonas.insertar("d11", "Fabian"); */

    }
}
