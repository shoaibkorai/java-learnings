import java.util.Scanner;

public class CalculatingMarks {
    public static void main(String[] args) {
        int total=500;
        System.out.println("Enter The Marks Of The Student");
        Scanner input= new  Scanner(System.in);
        System.out.println("Enter The Marks Of GK");
        float gk= input.nextFloat();
        System.out.println("Enter The Marks Of chemistry");
        float che= input.nextFloat();
        System.out.println("Enter The Marks Of English");
        float eng= input.nextFloat();
        System.out.println("Enter The Marks Of Physics");
        float phy= input.nextFloat();
        System.out.println("Enter The Marks of Maths");
        float math= input.nextFloat();
        float sum=gk+che+eng+phy+math;
        float per=sum/total*100;
       System.out.println("Total percentage Of The student is ");
       System.out.println(per);
       if(per>=80)
       {
           System.out.println("GRADE IS : A");
       } else if (per>=70) {
           System.out.println("GRADE IS B");

       } else if (per>=60) {
           System.out.println("GRADE IS C");
       } else if (per>=50) {
           System.out.println("GRADE IS D");
       }
       else {
           System.out.println("FAIL");
       }
    }

}
