public class BreakAndContinue {
    public static void main(String[] args) {

        // Break statement : is used to break/end the loop irrespective of whether the condition is true/false

        for (int i=0; i<=5;i++) {
            if (i == 2) {
                break;  // break the loop while i==2
            }
                System.out.println("How are you"+i);
        }
        System.out.println("loop breaked");


        // Continue Statement is used to skip the statement
        for (int i=0; i<=5;i++) {
            if (i == 2) {
              continue;  //continue skips the rest statement while i==2
            }
            System.out.println("How are you"+i);
        }
    }
}
