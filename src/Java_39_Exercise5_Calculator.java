import java.util.Scanner;

class InvalidInputException extends Exception{

    public String toString() {
        return "InvalidInputException, enter a valid operator";
    }
}

class MaxInputException extends Exception{

    public String toString() {
        return "MaxInputException, enter a valid exception";
    }
}

class MaxMultiException extends Exception{

    public String toString() {
        return "MaxMultiException, enter a valid exception";
    }
}

class DivideByZeroException extends Exception{

    public String toString() {
        return "DivideByZeroException, enter a valid exception";
    }
}

public class Java_39_Exercise5_Calculator {

    public static void main(String[] args) throws MaxMultiException, InvalidInputException, DivideByZeroException, MaxInputException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a:");
        int a= sc.nextInt();
        System.out.println("Enter value b:");
        int b= sc.nextInt();
        System.out.print("Enter value of operator:(+, -, *, /):");
        char operator = sc.next().charAt(0);

        if(operator != '+' && operator != '-' && operator != '*' && operator != '/' ) {
            throw new InvalidInputException();
        }

        else if(b==0 && operator== '/') {
            throw new DivideByZeroException();
        }

        else if(a>100000 || b> 100000) {
            throw new MaxInputException();
        }

        else if((a * b)>7000 ) {
            throw new MaxMultiException();
        }

        else {
            switch(operator) {
                case '+': System.out.println(a + b); break;
                case '-': System.out.println(a - b); break;
                case '*': System.out.println(a * b); break;
                case '/': System.out.println(a / b); break;
                default: System.out.println("Default Case");
            }
            System.out.println("Execution Completed!");



        }



    }

}