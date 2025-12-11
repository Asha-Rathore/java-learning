import java.util.Scanner;

public class Java_03_UserInput {
    static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = scanner.nextInt();
//        System.out.println("Enter number 2");
//        int b = scanner.nextInt();
//        int sum = a + b;
//        System.out.println("The sum of these numbers is " + sum);
//        boolean b1 = scanner.hasNextInt();
//        System.out.println(b1);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Name is " + name);
    }
}
