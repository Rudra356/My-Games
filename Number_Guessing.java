import java.util.*;

class guessGame {
    int noOfGusses=0;
    // This variable is for storing random number between 0 - 100
    Random rand = new Random();
    private int number = rand.nextInt(100) ;
    // For storing the input from the user
    public int userInput;

    // Method for getting the input from the user and updatde it in UserInput
    // variable
    public void getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 - 100");
        userInput = sc.nextInt();
        // sc.close();
    }

    void smaller() {
        System.out.println("You've entered a smaller number.");
    }

    void bigger() {
        System.out.println("You've entered a bigger number.");
    }

    void congo() {
        System.out.println("You've entered a correct number.");
    }
    void att(){
        System.out.println();
    }

    void playGame() {
        while (true) {
            noOfGusses++;
            getUserInput();
            if (userInput != number) {
                if (userInput > number) {
                    bigger();
                } else if (userInput < number) {
                    smaller();
                }else{
                    return;
                }
            } else {
               System.out.println("Your total number of guesses is :"+noOfGusses);
               return;
            }
        } 
    }
   
    
}
public class Number_Guessing {
    public static void main(String[] args) {
        guessGame player1 = new guessGame();
        player1.playGame();
        player1.att();
    }
}