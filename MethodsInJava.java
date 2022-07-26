public class MethodsInJava {
    static void telljoke(){
        System.out.println("pehle se araaam he han bhae ");
    }
    static void change(int x){
        int a=98;
    }
    static void change1(int[]arr){
        arr[0]=98;
    }
   // int add(int x, int y) {  // method for adding two numbers object creation
       static int add(int x, int y) {  // method for adding two numbers object creation

            int z;
        z = x + y;
        return z;
    }
        public static void main(String[] args) {
            //telljoke();
        /*   int a=10;
            int b=10;
            MethodsInJava obj = new MethodsInJava();
            int c=obj.add(a,b);
            System.out.println(c);
            */
            // method invocation static method ;
            int a1=10;
            int b1=10;

            int c1=add(a1,b1);
            System.out.println(c1);

            int []marks={100,90,80,70,60};

            // case 1 changing the integer
            int x=50;
            change(x);
            System.out.println(x);

            // case 2 changing the array

            int []marks1={100,70,80,94};
            change1(marks1);
            System.out.println("after change "+marks1[0]);
        }
    }

