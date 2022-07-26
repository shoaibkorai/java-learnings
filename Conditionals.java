import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
       int  age= 68 ;
   //  int  ms=1, gender=2;

        /*
        Scanner in = new Scanner(System.in);
       System.out.print("Enter your age : ");
       age = in.nextInt();
       */


       if(age>20)
       {
           System.out.println("you are eligible to drive !");
       }
       else if (age > 23)
       {
               System.out.println("You are going to get a job!");
       } else if (age>40)
       {

           System.out.println("you are aged one");
       } else
       {
               System.out.println("Enjoy Your life");

       }
    }

}
