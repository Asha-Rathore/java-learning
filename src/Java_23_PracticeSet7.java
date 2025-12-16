public class Java_23_PracticeSet7 {
    //Question 1
    static void multiplication(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    //Question 2
    static void pattern1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //Question 3
    static int sum(int n){
        if(n <= 0){
            return 0;
        }
        return n + sum(n-1);
    }

    //Question 4
    static void pattern2(int n){
        for(int i = n; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //Question 5
    static int fibonacciSequence(int n){
        if(n <= 1){
            return 1;
        }
        return fibonacciSequence(n-1) + fibonacciSequence(n-2);
    }

    //Question 6
    static int average(int ...arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum/ arr.length;
    }

    //Question 7
    // Helper function to print a single row of stars
    public static void printRow(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("* ");
        printRow(n - 1);
    }

    // Main function to print the triangle pattern recursively
    public static void recursionPattern2(int n) {
        if (n == 0) { // Base condition: stop when n becomes 0
            return;
        }
        printRow(n); // Print the current row with n stars
        System.out.println(); // Move to the next line
        recursionPattern2(n - 1); // Recursive call for the next smaller row
    }

    //Question 8
    public static void recursionPattern1(int n) {
        if (n == 0) { // Base condition: stop when n becomes 0
            return;
        }
        recursionPattern1(n - 1); // Recursive call for the next smaller row
        printRow(n); // Print the current row with n stars
        System.out.println(); // Move to the next line
    }

    //Question 9
    static float celsiusToFahrenheit(float celcius){
        return (celcius * 1.8f) + 32;
    }
    //Question 10
    static int iterativeSum(int n){
        int result = 0;
        for (int i = 0; i <= n; i++){
            result += i;
        }
        return result;
    }

    static void main() {
        //Question 1
//        System.out.println("Multiplication");
//        multiplication(4);

        //Question 2
//        System.out.println("Pattern 1");
//        pattern1(4);

        //Question 3
        System.out.println("Sum of n natural numbers is " + sum(4));

        //Question 4
//        System.out.println("Pattern 2");
//        pattern2(4);

        //Question 5
//        System.out.println("Fibonacci Sequence");
//        int count = 10;
//        for (int i = 0; i < count; i++) {
//            System.out.print(fibonacciSequence(i) + " ");
//        }

        //Question 6
//        System.out.println("The average is " + average(1,2,4,5));

        //Question 7
//        recursionPattern2(4);

        //Question 8
//        recursionPattern1(4);

        //Question 9
//        float celsius = 25;
//        System.out.println(celsius + "C to F is " + celsiusToFahrenheit(celsius));

        //Question 10
//        System.out.println("Sum of n natural numbers is " + iterativeSum(4));
    }
}
