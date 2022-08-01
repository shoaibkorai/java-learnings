import java.util.Random;
import java.util.Scanner;

class Game{
public  int number ;
public int userInput;
public int noOfGuesses;
     // method to setNoOfGuesses
public int setNoOfGuesses(int noOfGuesses){    return this.noOfGuesses = noOfGuesses ;}
    // method to getNoOfGuesses
public int getNoOfGuesses(){    return noOfGuesses ; }
    // Constructor of class game to generate a random  number while the object is created
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    // method to takeUserInput
    public void  takeUserInput(){
        System.out.println("Guess the number ");
        Scanner input = new Scanner(System.in);
        userInput = input.nextInt();

    }
    // method to change whether the guessed number  is correct
   boolean isCorrectNumber() {
        noOfGuesses++;
       if (userInput == number) {
           System.out.printf("You Guessed it right ! number was : %d \n  In  %d  Attempts  ",number,noOfGuesses);
           return true;
       } else if (userInput > number) {
           System.out.println("Number is too High...");

       } else if (userInput < number) {
           System.out.println("Number is too Low....");

       }

           return false;
   }

}

public class GuessTheNumberGame {
    public static void main(String[] args) {


        /*
                         Game should have the following methods:
                       Constructor to generate the random number
                       takeUserInput() to take a user input of number
                       isCorrectNumber() to detect whether the number entered by the user is true
                       getter and setter for noOfGuesses
                       Use properties such as noOfGuesses(int), etc to get this task done!
         */
        char  op;
        Scanner input = new Scanner(System.in);
        do {
            Game player = new Game();

            boolean b = false;
            while (!b) {
                player.takeUserInput();
                b = player.isCorrectNumber();
            }
            System.out.println("\npress Y to continue playing ");

            op = input.next().charAt(0);
        }while (op== 'y');

    }
}
