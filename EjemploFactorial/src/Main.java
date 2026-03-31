public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorialRec(4));
    }

    public static int factorial(int n){
        int res = 1;
        for(int i = 2; i<= n; i++) res *=i;
        return res;
    }

    public static int factorialRec(int n){
        if(n == 1)return 1;
        return n * factorialRec(n-1);
    }
}
