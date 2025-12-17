import java.util.Random;
import java.util.Scanner;

class GuessTheNumberGame{
    private int noOfGuesses;
    private int userInput;
    private int computerNo;

    public GuessTheNumberGame(){
        Random random = new Random();
        computerNo = random.nextInt(200);
    }

    public void setNoOfGuesses(int n){
        noOfGuesses = n;
    }

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void takeUserInput(){
        System.out.println("**************");
        System.out.println("Guess a number");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }

    public boolean isCorrectNumber(){
        while(computerNo != userInput){
            if(computerNo > userInput){
                System.out.println("Guess greater number");
            }
            else {
                System.out.println("Guess smaller number");
            }
            return false;
        }
        return true;
    }
}

public class Java_28_Exercise3_GuessTheNumber {
    static void main(String[] args) {
        GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
        guessTheNumberGame.takeUserInput();
        int score = 1;
        while (!guessTheNumberGame.isCorrectNumber()){
            System.out.println("Try again!");
            guessTheNumberGame.takeUserInput();
            score++;
            guessTheNumberGame.setNoOfGuesses(score);
        }
        System.out.println("You won with " + guessTheNumberGame.getNoOfGuesses() + " score");
    }
}
