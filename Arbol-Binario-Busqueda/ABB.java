public class ABB {
    private NodoABB raiz;

    public ABB(){
        raiz = null;
    }

    public NodoABB getRaiz(){
        return raiz;
    }

    public void setRaiz(NodoABB raiz){
        this.raiz = raiz;
    }
    private boolean estaVacia(){
        return raiz == null;
    }

    public NodoABB buscar(String llave){
        if(estaVacia()){
            System.out.println("El arbol esta vacia");
            return null;
        }
        NodoABB temp = raiz;
        while(!temp.getLlave().equals(llave)){
            if(temp.getLlave().compareTo(llave) > 0){
                temp = temp.getIzquierdo();
            }else{
                temp = temp.getDerecho();
            }
            if(temp ==null){
                System.out.println("La llave no esta en el arbol ");
                return null;
            }
        }
        return temp;
    }

    public void insertar(String llave, String nombre){
        NodoABB nodo = new NodoABB(llave, nombre);
        
        if(estaVacia()){
            raiz = nodo;
            return;
        }
        NodoABB temp = raiz;
        NodoABB padreTemp;
        while(true) {
            padreTemp = temp;
            if(temp.getLlave().compareTo(llave)>0){
                temp = temp.getIzquierdo();
                if(temp == null){
                    padreTemp.setIzquierdo(nodo);
                    return;
                }
            }else if(temp.getLlave().compareTo(llave)<0){
                temp = temp.getDerecho();
                if(temp == null){
                    padreTemp.setDerecho(nodo);
                    return;
                }
            }else{
                System.out.println("La llave ya esta en el arbol");
                return;
            }
        }
    }

    public void enOrden(NodoABB raizTemp){
        if(raizTemp != null){
            enOrden(raizTemp.getIzquierdo());
            System.out.print(raizTemp.getLlave() + " ");
            enOrden(raizTemp.getDerecho());
        }
    }

    public void preOrden(NodoABB raizTemp){
        if(raizTemp != null){
            System.out.print(raizTemp.getLlave() + " ");
            preOrden(raizTemp.getIzquierdo());
            preOrden(raizTemp.getDerecho());
        }
    }

    public void postOrden(NodoABB raizTemp){
        if(raizTemp != null){
            postOrden(raizTemp.getIzquierdo());
            postOrden(raizTemp.getDerecho());
            System.out.print(raizTemp.getLlave() + " ");
        }
    }

    private NodoABB getSucesor(NodoABB nodo){
        NodoABB padreSucesor = nodo;
        NodoABB sucesor = nodo;
        NodoABB temp = nodo.getDerecho();
        while(temp!=null){
            padreSucesor = sucesor;
            sucesor = temp;
            temp = temp.getIzquierdo();
        }
        if(sucesor != nodo.getDerecho()){
            padreSucesor.setIzquierdo(sucesor.getDerecho());
            sucesor.setDerecho(nodo.getDerecho());
        }
        return sucesor;
    }

    private NodoABB getPadre(String llave){
        NodoABB padreTemp = raiz;
        NodoABB temp = raiz;
        while(!temp.getLlave().equals(llave)){
            padreTemp = temp;
            if(temp.getLlave().compareTo(llave) > 0){
                temp = temp.getIzquierdo();
            }else{
                temp = temp.getDerecho();
            }
        }
        return padreTemp;
    }

    public NodoABB eliminar(String llave) {
        if (estaVacia()) {
            System.out.println("El árbol está vacío.\n");
            return null;
        }
        NodoABB nodo = buscar(llave);
        if (nodo == null) return null;
        if (nodo == raiz) {
            if (nodo.getDerecho() == null && nodo.getIzquierdo() == null) raiz = null;
            else if (nodo.getDerecho() == null) raiz = raiz.getIzquierdo();
            else if (nodo.getIzquierdo() == null) raiz = raiz.getDerecho();
            else {
                NodoABB sucesor = getSucesor(raiz);
                sucesor.setIzquierdo(raiz.getIzquierdo());
                raiz = sucesor;
            }
            return nodo;
        }
        NodoABB padreNodo = getPadre(llave);
        if (nodo.getDerecho() == null && nodo.getIzquierdo() == null) {
            if (nodo == padreNodo.getIzquierdo()) padreNodo.setIzquierdo(null);
            else padreNodo.setDerecho(null);
        } else if (nodo.getDerecho() == null) {
            if (nodo == padreNodo.getIzquierdo()) padreNodo.setIzquierdo(nodo.getIzquierdo());
            else padreNodo.setDerecho(nodo.getIzquierdo());
        } else if (nodo.getIzquierdo() == null) {
            if (nodo == padreNodo.getIzquierdo()) padreNodo.setIzquierdo(nodo.getDerecho());
            else padreNodo.setDerecho(nodo.getDerecho());
        } else {
            NodoABB sucesor = getSucesor(nodo);
            sucesor.setIzquierdo(nodo.getIzquierdo());
            if (nodo == padreNodo.getIzquierdo()) padreNodo.setIzquierdo(sucesor);
            else padreNodo.setDerecho(sucesor);
        }
        return nodo;
    }
}
