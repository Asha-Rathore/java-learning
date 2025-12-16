public class Java_22_FibonacciSequence {
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, …
    static int fibonacciSequence(int n){
        if(n <= 1){
            return 1;
        }
        return fibonacciSequence(n-1) + fibonacciSequence(n-2);
    }

    static void main(String[] args) {
        System.out.println("Fibonacci Sequence");
        int count = 10;
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacciSequence(i) + " ");
        }
    }
}
