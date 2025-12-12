import java.util.Scanner;

public class Java_12_Conditionals {
    static void main(String[] args) {
//        int age = 6;
//        if(age > 18){
//            System.out.println("Yes! you can drive a car.");
//        }
//        else {
//            System.out.println("NO! you cannot drive a car");
//        }

        int age;
        System.out.println("Enter you age");
        Scanner s = new Scanner(System.in);
        age = s.nextInt();

        switch (age){
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life!");
                break;
        }
    }
}
