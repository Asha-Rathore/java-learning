import java.util.Scanner;
import java.util.Random;

public class Java_14_Exercise2_Rock_Paper_Scissor_Game {
    static void main(String[] args) {
        System.out.println("Type\n\"0\": for Rock\n\"1\": for Paper\n\"2\": for Scissors\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Player 1: Enter \"0\", \"1\", \"2\"");
        int p1 = s.nextInt();

        Random random = new Random();
//        System.out.println("Player 2: Enter \"r\", \"p\", \"s\"");
        int p2 = random.nextInt(3);

        if(p1 == p2){
            System.out.println("It's a tie");
        }
        else if(p1 == 0 && p2 == 2 || p1 == 1  && p2 == 0 || p1 == 2 && p2 == 1){
            System.out.println("Rock beats Scissors");
            System.out.println("You Win!");
        }
        else{
            System.out.println("Computer Win!");
        }
        System.out.println("Computer choice: " + p2);
        if(p2 == 0){
            System.out.println("Computer choice: Rock");
        }
        if(p2 == 1){
            System.out.println("Computer choice: Paper");
        }
        if(p2 == 2){
            System.out.println("Computer choice: Scissors");
        }
    }
}
