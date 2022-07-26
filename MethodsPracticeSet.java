public class MethodsPracticeSet {
// problem 1
        //    static void table(int n){
//
//        for (int i=1;i<=10;i++){
//
//           // System.out.printf("%d * %d =%d\n",n,i,n*i );
//            System.out.println(n+" * "+i+" = "+n*i);
//        }
//        }
    // problem 2
//    static void pattern(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=i;j<=(2*i-1);j++){
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    // pronlem 3
//    static int sumRec(int n){
//        if(n==1){
//            return 1;
//        }
//        else {
//            return n+sumRec(n-1);
//        }
//    }
    // problem 4 revers pattern
static void Revpattern(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j<=(2*i-1);j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n) {
        /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fahrenheit(int c){
        return c* 9/5 + 32;
    }
    public static void main(String[] args) {
        // problem no 1
//        int n=2;
//        table(6);
//         problem no 2
//          pattern(6);

//        //problem n0 3
//        System.out.println(sumRec(3));

        //problem no 4 revers pattern
      //  Revpattern(5);


        // Problem 4
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
     //   int result = fib(7);
      //   System.out.println(result);

        pattern1_rec(5);
        int n=45;
        System.out.printf("%d Celsius is =  %d fahrenheit",n,fahrenheit(n));


    }
}
