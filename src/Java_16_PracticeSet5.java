public class Java_16_PracticeSet5 {
    static void main(String[] args) {
        //Question 1
//        for(int i = 4; i >= 1; i--){
//            for(int j = i; j >= 1; j--){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        //Question 2
//        int n = 20;
//        int i = 0;
//        int sum = 0;
//        while(i <= n){
//            if(i%2 == 0){
//                System.out.println(i);
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println("Sum is " + sum);

        //Question 3
//        int n = 5;
//        for(int i = 1; i <= 10; i++){
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }

        //Question 4
//        int n = 10;
//        for(int i = 10; i >= 1; i--){
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }

        //Question 5
//        int n = 6;
//        int factorial = 1;
//        for(int i = n; i >= 1; i--){
//            factorial = factorial * i;
//        }
//        System.out.println(factorial);

        //Question 6
//        int n = 5;
//        int factorial = 1;
//        int i = n;
//        while(i >= 1){
//            factorial = factorial * i;
//            i--;
//        }
//        System.out.println(factorial);

        //Question 7
//        int i = 4;
//        while(i >= 1){
//            int j = i;
//            while(j >= 1){
//                System.out.print("*");
//                j--;
//            }
//            System.out.println(" ");
//            i--;
//        }

        //Question 8
        //True

        //Question 9
//        int n = 8;
//        int value = 0;
//        int sum = 0;
//        for(int i = 1; i <= 10; i++){
//            value = n * i;
//            sum += value;
//            System.out.println(n + " x " + i + " = " + value);
//        }
//        System.out.println("Sum of numbers occurring: " + sum);

        //Question 10
        //At least once

        //Question 11
        int n = 20;
        int sum = 0;
        for(int i = 0; i <= n; i++){
            if(i%2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
