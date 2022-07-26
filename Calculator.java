import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float num1, num2, ans;
        char op;
        Scanner get = new Scanner(System.in);
        do {

            System.out.println("Enter 1st Number  ");
            num1 = get.nextFloat();
            System.out.println("Enter 2nd Number  ");
            num2 = get.nextFloat();
            System.out.println("ENTER OPPERATION '+' '-' '*' '/'");
            op = get.next().charAt(0);
            if (op == '+') {
                ans = num1 + num2;
                System.out.print(ans);
            } else if (op == '-') {
                ans = num1 - num2;
                System.out.println(ans);
            } else if (op == '*') {
                ans = num1 * num2;
                System.out.println(ans);

            } else if (op == '/') {
                ans = num1 / num2;
                System.out.println(ans);
            } else {
                System.out.println("invalid opperator");
            }

          System.out.println("Enter 'Y' to conitinue 'N' to end " );
         op = get.next().charAt(0);
    }
            while (op =='y'|| op=='Y');

    }
}