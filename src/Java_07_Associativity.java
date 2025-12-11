public class Java_07_Associativity {
    static void main(String[] args) {
        //Precedence & Associativity
//        int a = 6 * 5 - 34 / 2;
        /*
        Precedence
        Highest precedence goes to * and /. They are then
        evaluated on the basis of left to right associativity
        =30-34/2
        =30-17
        =13
         */
//        int b = 60/5-34*2;
        /*
        Associativity
        =12-34*2
        =12-68
        =-56
         */
//        System.out.println(a);
//        System.out.println(b);

        //Quick Quiz
        int x = 5;
        int y = 4;
        int a = 5;
        int b = 1;
        int c = 4;
        int k = x * y/2;
        System.out.println(k);

        //quadratic eq
        int q = (b * b) - 4 * a * c/(2 * a);
        System.out.println(q);
    }
}
