import java.util.Scanner;

public class Java_04_Exercise1 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Maths marks");
        double math = s.nextDouble();
        System.out.println("Enter Chemistry marks");
        double chemistry = s.nextDouble();
        System.out.println("Enter Biology marks");
        double biology = s.nextDouble();
        System.out.println("Enter Physics marks");
        double physics = s.nextDouble();
        System.out.println("Enter English marks");
        double english = s.nextDouble();
        double sum = math + chemistry + biology + physics + english;
        double percent = (sum/500) * 100;
        System.out.println("The percentage is " + percent + "%");
    }
}
