import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public  static void main (String[] args){
        int user ,comp ,i=0;

        Random rn = new Random();
        Scanner user_in = new Scanner(System.in);
        System.out.println("\t\tROCK PAPER SCISSORS ");
        while (i!=5) {
           i++;
           System.out.print("Your Turn \t >Rock (1)\t>Paper (2)\t>Scissors (3) :  ");
           user = user_in.nextByte();
           comp = rn.nextInt(1, 4);
           if (user == 1 && comp == 1) {
               System.out.println("Tie");
           } else if (user == 1 && comp == 2) {
               System.out.println("You Lose");
           } else if (user == 1 && comp == 3) {
               System.out.println("You won");
           } else if (user == 2 && comp == 1) {
               System.out.println("You won");
           } else if (user == 2 && comp == 2) {
               System.out.println("Tie");
           } else if (user == 2 && comp == 3) {
               System.out.println("You Lose");
           } else if (user == 3 && comp == 1) {
               System.out.println("You Lose");
           } else if (user == 3 && comp == 2) {
               System.out.println("You Won");
           } else if (user == 3 && comp == 3) {
               System.out.println("Tie");

           }
       }
    }
}
