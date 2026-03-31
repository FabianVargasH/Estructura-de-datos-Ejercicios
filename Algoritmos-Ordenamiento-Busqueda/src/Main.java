import java.util.Arrays;

public class Main {
   public static void main(String[] args) {

       //selectionSort
        int[]numeros = {64,34,25,12,22,11,90};
       selectionSort(numeros);
       System.out.println(Arrays.toString(numeros));
       //- - - -
       //InsertSort
       int[]numeros2 = {23,54,75,17,15,8,2,1,5,15,64};
       insertionSort(numeros2);
       System.out.println(Arrays.toString(numeros2));

       //bubbleSort
       int[]numeros3 = {26,14,45,57,75,32,21,15,52,55,64};
       bubbleSort(numeros3);
       System.out.println(Arrays.toString(numeros3));

       //binarySearch
       System.out.println(binarySearch(numeros3,45));

    }
    public static void selectionSort(int[] numeros){
        int n = numeros.length;
        int minimo;
        int temp;

        for (int i = 0; i< n -1; i++){
            minimo = i;
            for (int j = i +1; j<n;j++){
                if(numeros[j]<numeros[minimo]) minimo = j;
            }
            temp = numeros[i]; //
            numeros[i] = numeros[minimo];
            numeros[minimo]  = temp;
        }
    }

    public static void insertionSort(int[] numeros) {
        int n = numeros.length;
        int[] nuevo = new int[n];
        int posicion = 0;
        int insertados = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                nuevo[i] = numeros[i];
            } else {
                for (int j = 0; j <= insertados; j++) {
                    if (numeros[i] <= nuevo[j]) {
                        posicion = j;
                        break;
                    }
                    posicion = insertados;
                }
                for (int k = insertados; k > posicion; k--) {
                    nuevo[k] = nuevo[k - 1];
                }
                nuevo[posicion] = numeros[i];
            }
            posicion = 0;
            insertados++;
        }
        for(int c = 0; c < n; c++){
            numeros[c] = nuevo[c];
        }
    }

    public static void bubbleSort(int[] numeros){
       int n = numeros.length;
        int temp = 0;
        boolean desordenado;
        for (int i = 0; i<n; i++){
            desordenado = false;
            for (int j = 0; j<n-1-i;j++){
                if(numeros[j]>numeros[j+1]){
                    temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] =  temp;
                    desordenado = true;
                }
            }
            if(!desordenado) break;
        }
    }

    public static int binarySearch(int[] numeros, int numeroBuscar){
       int izquierdo = 0;
       int derecho = numeros.length -1;
       int pivote = (izquierdo + derecho)/2;
       while(numeros[pivote] != numeroBuscar){
           if(numeros[pivote]<numeroBuscar){
               izquierdo = pivote +1;
           }else{
               derecho = pivote -1;
           }
           if(izquierdo>derecho){
               return -1;
           }
           pivote = (izquierdo + derecho)/2;
       }
        return pivote;
    }
}