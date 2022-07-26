public class VarArgs {



    static int add1(int x,int ...arg){
      int   result=0;
        for (int num:arg) {
            result+=num;
        }
        return result;
    }

    static int  add(int ...arg){
        int result=0;
        for (int sum:arg) {
            result+=sum;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println("sum of 5 and 6 is "+ add(5,6,5,6,5,6,5,6));
        System.out.println("sum of 5 and 6 is "+ add1(5,6,5,6,5,6,5,6));

    }
}

