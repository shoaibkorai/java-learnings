import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        System.out.println("Enter Two numbers ");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int  a = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of two numbers is");
        System.out.println(sum);

    }
}
