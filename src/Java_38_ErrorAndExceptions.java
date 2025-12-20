import java.util.Scanner;

public class Java_38_ErrorAndExceptions {
    static void main(String[] args) {
        //Problem 1

        //Syntax Error - int a = 7
        int age = 70;

        //Logical Error
        int yearBorn = 2000-70;
//        System.out.println(6/0);

        //Problem 2
        try{
            int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("Haha");
        }
        catch (ArithmeticException e){
            System.out.println("Hehe");
        }

        //Problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 2;
        marks[2] = 6;
        Scanner scanner = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 5){
            try{
                index = scanner.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i >= 5){
            System.out.println("Error");
        }
    }
}
