public class Java_19_Methods {
    static void change(int x){
        x = 1;
    }

    static void change(int[] arr){
        arr[0] = 1;
    }

    static int logic(int x, int y){
        int z;
        if(x > y){
            z = x+y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }

    static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = logic(a,b);

        int a1 = 9;
        int b1 = 7;
        int c1 = logic(a1,b1);

        System.out.println(c);
        System.out.println(c1);

        //changing integer value using method
        change(a);
        System.out.println("Value of a after calling change method " + a);

        //change array value
        int[] marks = {12, 14, 16, 18 , 10};
        change(marks);
        System.out.println("Value of marks after calling change method " + marks[0]);
        //array value will change because marks contains address of the array (reference of the array)
    }
}
