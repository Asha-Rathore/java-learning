public class Java_18_PracticeSet6 {
    static void main(String[] args) {
        //Question 1
//        float[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 19};
//        float sum = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum += arr[i];
//        }
//        System.out.println("The sum is " + sum);

        //Question 2
//        int n = 9;
//        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 19};
//        for(int i = 0; i < arr.length; i++){
//            if(n == arr[i]){
//                System.out.println("The given integer is present in the array");
//            }
//        }

        //Question 3
//        int[] physicsMarks = {80, 90, 85, 67, 93, 88};
//        int sum = 0;
//        for(int element: physicsMarks){
//            sum += element;
//        }
//        System.out.println("The average is " + sum/physicsMarks.length);

        //Question 4
        int[][] mat1 = {
                {1,2,3},
                {4,5,6}
        };

        int[][] mat2 = {
                {7,8,9},
                {1,3,6}
        };
        int[][] sum = new int[2][3];

        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[i].length; j++){
                int sumVal = mat1[i][j] + mat2[i][j];
                sum[i][j] = sumVal;
            }
        }

        for(int i = 0; i < sum.length; i++){
            for(int j = 0; j < sum[i].length; j++){
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }

        //Question 5
//        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 19};
//        for (int i = arr.length - 1; i >= 0; i--){
//            System.out.println(arr[i]);
//        }

        //Question 6
//        int[] arr = {10, 30, 55, 67, 91, 20, 13, 15, 19};
//        int maxValue = arr[0];
//        for(int i = 1; i < arr.length - 1; i++){
//            if(maxValue < arr[i]){
//                maxValue = arr[i];
//            }
//        }
//        System.out.println("Max element is " + maxValue);

        //Question 7
//        int[] arr = {10, 30, 55, 67, 91, 20, 13, 15, 19};
//        int minValue = arr[0];
//        for(int i = 1; i < arr.length - 1; i++){
//            if(minValue > arr[i]){
//                minValue = arr[i];
//            }
//        }
//        System.out.println("Min element is " + minValue);

        //Question 8
//        int[] arr = {10, 30, 55, 67, 91, 20, 13, 15, 19};
//        boolean isSorted = true;
//        for(int i = 1; i < arr.length - 1; i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//            }
//        }
//        System.out.println("The array is sorted? " + isSorted);
    }
}
