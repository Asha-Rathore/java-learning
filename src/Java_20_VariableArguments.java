public class Java_20_VariableArguments {
//    static int sum(int a , int b){
//        return a + b;
//    }
//    static int sum(int a , int b, int c){
//        return a + b;
//    }

    static int sum(int x, int ...arr){
        //Available as int[] arr;
        int result = x;
        for(int a: arr){
            result +=a;
        }
        return result;
    }

    static void main(String[] args) {
        System.out.println("Variable Arguments");
        System.out.println("The sum of nothing is " + sum(3));
        System.out.println("The sum of 4 and 5 is " + sum(4,5));
        System.out.println("The sum of 4, 3 and 5 is " + sum(4, 3, 5));
        System.out.println("The sum of 4, 3, 6 and 5 is " + sum(4, 3, 6, 5));

    }
}
