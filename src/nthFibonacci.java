public class nthFibonacci {



    static long [] fibonacciCache = new long[];
    static long mod = (long)1e9+7;
    public static long nthFibonacci(long n){
        if(n==0 || n== 1){
            return n;
        }

        if(fibonacciCache[(int)n] != 0){
            return fibonacciCache[(int)n];
        }
        fibonacciCache[(int)n] = (nthFibonacci(n-1) + nthFibonacci(n-2))%mod;

        return fibonacciCache[(int)n];

    }


    public static void main(String[] args) {

    }
}
