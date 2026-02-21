public class Main {
    public static void main(String[] args) {

/*      PilaEstatica pilaCiudades = new PilaEstatica(5); 
        PilaDinamica pilaCiudades = new PilaDinamica();

        System.out.println(pilaCiudades.peek());

        pilaCiudades.push("Londres");
        pilaCiudades.push("Hong Kong");
        pilaCiudades.push("Paris");

       System.out.println(pilaCiudades.peek()); //Imprimir Paris

        pilaCiudades.push("Nueva York");
        pilaCiudades.push("Heredia");

        pilaCiudades.pop();
        pilaCiudades.pop();

        System.out.println(pilaCiudades.peek()); Imprimir Paris
        pilaCiudades.pop();
        System.out.println(pilaCiudades.peek()); Imprimir Hong kong */

        /* ColaEstatica colaFichas = new ColaEstatica(5); */
        ColaDinamica colaFichas = new ColaDinamica();
        colaFichas.insertar("C1");
        colaFichas.insertar("C2");
        colaFichas.insertar("C3");
        colaFichas.insertar("C4");
        colaFichas.insertar("C5");
        colaFichas.insertar("C6"); //Cola llena en Estatica

        colaFichas.remover();
        colaFichas.remover();
        colaFichas.remover();
        colaFichas.remover();

        System.out.println(colaFichas.verFrente());
    }
}