
import java.util.Scanner;
 public class       EnhancedSwichCase {
    public static void main(String[] args) {

        float n1,n2;

        char op;

        Scanner in= new Scanner(System.in);

        System.out.println("Enter 1st Number ");
        n1 = in.nextFloat();
        System.out.println("Enter 2nd Number");
        n2 = in.nextFloat();
        System.out.println("Enter opperation \'+\'  \'-\'  \'*\'  \'/\' ");
        op = in.next().charAt(0);
        switch (op) {
            case '+' -> System.out.println(" result : " + (n1 + n2));
            case '-' -> System.out.println("result :  " + (n1 - n2));
            case '*' -> System.out.println("result : " + (n1 * n2));
            case '/' -> System.out.println("result : " + (n1 / n2));
            default -> System.out.println("Inavlid Opperator");
        }
    }
}

