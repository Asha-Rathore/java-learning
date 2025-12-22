import java.util.*;
import java.lang.reflect.Array;

public class Java_40_ArrayList {
    static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.addAll(2, l2);
        int[] arr = new int[l1.size()];
        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");

            arr[i] = l1.get(i);
        }
        Arrays.sort(arr);
        System.out.println(" ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
    }
}
