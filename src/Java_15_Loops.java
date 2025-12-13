public class Java_15_Loops {
    static void main(String[] args) {
        //while loop
        int i = 100;
        while (i <= 200){
            System.out.println(i);
            i++;
        }

        //Do while loop
        //Run at least once with checking condition in first iteration
        int a = 1;
        do{
            System.out.println(a);
            a++;
        } while (a <= 6);

        //for loop
        System.out.println("Odd numbers");
        for(int j = 1; j <= 100; j++){
            if ((j%2)!=0){
                System.out.println(j);
            }
        }
        //decrement lopp
        for(int j = 40; j != 0; j--){
            System.out.println(j);

        }
    }
}