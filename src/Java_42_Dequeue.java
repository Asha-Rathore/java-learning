import java.util.ArrayDeque;

public class Java_42_Dequeue {
    static void main(String[] args) {
        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        d1.add(10);
        d1.add(20);
        d1.add(30);
        d1.add(40);
        d1.add(50);
        d1.add(60);
        d1.add(70);
        d1.add(80);
        d1.add(90);
        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());
    }
}
