public class Recursion {
    // Recursion method
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    //for loop method
    static int nfactorial(int n) {
        int fac = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 1; i <=n; i++) {
                fac *= i;
            }
            return fac;
        }
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println("factorial of n is "+nfactorial(n));
        System.out.println("Rescurion Method \nfactorial of n is "+factorial(n));
    }
}
