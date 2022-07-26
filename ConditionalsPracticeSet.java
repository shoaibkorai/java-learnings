import java.util.Scanner;

public class ConditionalsPracticeSet {
    public static void main (String[]args){


        //QNO : 1
        /*
        int a=11;

        if (a=11) // error you can not assigan a vale in if condition
        {
            System.out.println("i am 10");
        }
        else
        {
            System.out.println("i am 11");
        }

         */

        // QNO : 2
     /* byte s1,s2,s3;
      Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks in English");
        s1 = input.nextByte();
        System.out.println("Enter Your Marks in English");
        s2 = input.nextByte();
        System.out.println("Enter Your Marks in English");
        s3 = input.nextByte();

        float avg = (s1+s2+s3)/3.0f;
        System.out.println("Your Over All Percentage is : %"+avg);
        if(avg>=40 && s1>=33 && s2>=33 && s3>=33)
        {
            System.out.println("Congratulations ! you are promoted");
        }
        else {
            System.out.println("Sorry ! You are not promoted ");
        }


    }*/
        //QNO 3
        /*
        float in,tax=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Income");
        in = input.nextLong();
        if (in<=250000)
        {
            System.out.println(" Your income is below then the criteria of tax ");
        }

        else if (in>250000&&in<=500000)
        {
            tax = tax + 0.05f * (in-250000);
        }

        else if (in>500000&&in<=1000000)

        {
            tax = tax + 0.05f * (500000-250000);
            tax = tax + 0.20f * (in - 500000);
        }
        else if (in>100000)
        {
            tax = tax + 0.05f * (500000-250000);
            tax = tax + 0.20f * (100000- 500000);
            tax = tax + 0.30f * (in-1000000);
        }
        System.out.println("Your Tax is : "+tax);
*/



        // Q4 check  if the wabsite is organizational , commercial, or pakistani by reading .org , .pk , .com

        Scanner in= new Scanner(System.in);
        System.out.println("Please Enter The Wabsite : ");
        String wabsite = in.next();


        if(wabsite.endsWith(".com"))
        {
            System.out.println("This is  a Commercial Wabsite");
        }
        else if(wabsite.endsWith(".org"))
        {
            System.out.println("This is  a Organization Wabsite");
        }
        else if(wabsite.endsWith(".pk"))
        {
            System.out.println("This is  a Pakistani  Wabsite");
        }









}
}