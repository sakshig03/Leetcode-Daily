//print primes in a range
public class problem1 {
    public static boolean isprime(int n) {

        if (n == 2) {
            return true;
        }
        // brute force
        // for(int i=2;i<=n-1;i++){
        // if(n%i==0){
        // return false;
        // }
        // }
        // optimized approach
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)==true){
                System.out.print(i+" ");

            }
        }
    }

    public static void main(String[] args) {
        primesInRange(100);

    }
}