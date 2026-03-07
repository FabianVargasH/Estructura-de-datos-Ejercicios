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
            System.out.println(raizTemp.getLlave() + " ");
            enOrden(raizTemp.getDerecho());
        }
    }

    public void preOrden(NodoABB raizTemp){
        if(raizTemp != null){
            System.out.println(raizTemp.getLlave() + " ");
            preOrden(raizTemp.getIzquierdo());
            preOrden(raizTemp.getDerecho());
        }
    }

    public void postOrden(NodoABB raizTemp){
        if(raizTemp != null){
            postOrden(raizTemp.getIzquierdo());
            postOrden(raizTemp.getDerecho());
            System.out.println(raizTemp.getLlave() + " ");
        }
    }
}
