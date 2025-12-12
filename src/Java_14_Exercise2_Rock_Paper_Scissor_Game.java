import java.util.Scanner;

public class Java_14_Exercise2_Rock_Paper_Scissor_Game {
    static void main(String[] args) {
        System.out.println("Type\n\"r\": for Rock\n\"p\": for Paper\n\"s\": for Scissors\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Player 1: Enter \"r\", \"p\", \"s\"");
        String p1 = s.nextLine();
        System.out.println("Player 2: Enter \"r\", \"p\", \"s\"");
        String p2 = s.nextLine();
        int p1Score = 0;
        int p2Score = 0;

        if((p1 == "r") && (p2 == "s")){
            System.out.println("Rock beats Scissors");
            p1Score = p1Score + 1;
        }
        else if((p1 == "s") && (p2 == "p")){
            System.out.println("Scissors beats Paper");
            p1Score = p1Score + 1;
        }
        else if((p1 == "p") && (p2 == "r")){
            System.out.println("Paper beats Rock");
            p1Score = p1Score + 1;
        }
        else if((p2 == "r") && (p1 == "s")){
            System.out.println("Rock beats Scissors");
            p2Score = p2Score + 1;
        }
        else if((p2 == "s") && (p1 == "p")){
            System.out.println("Scissors beats Paper");
            p2Score = p2Score + 1;
        }
        else if((p2 == "p") && (p1 == "r")){
            System.out.println("Paper beats Rock");
            p2Score = p2Score + 1;
        }
        else if(p1 == p2){
            System.out.println("It's a tie");
        }

        System.out.println("Player 1 score: " + p1Score);
        System.out.println("Player 2 score: " + p2Score);
        if(p1Score > p2Score){
            System.out.println("Player 1 wins");
        }
        else{
            System.out.println("Player 2 wins");
        }
    }
}
