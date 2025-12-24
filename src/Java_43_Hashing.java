import java.util.HashSet;
import java.util.HashMap;

public class Java_43_Hashing {
    static void main(String[] args) {
//        HashSet<Integer> myHashSet = new HashSet<>(10, 0.5f);
//        myHashSet.add(39);
//        myHashSet.add(33);
//        myHashSet.add(21);
//        myHashSet.add(66);
//
//        System.out.println(myHashSet);



        HashMap<String, Integer> map = new HashMap<>();

// 1️⃣ Insert
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Pineapple", 4);
        map.put("Strawberry", 5);

// 2️⃣ Update
        map.put("Apple", map.get("Apple") + 1);
        //Here, if "apple" is not in the map, it treats its value as 0 and then adds 1.
        map.put("apple", map.getOrDefault("apple", 0) + 1);


// 3️⃣ Get value
        int value = map.get("Apple");
        System.out.println(value);

// 4️⃣ Check existence
//        if (map.containsKey("banana")) { ... }

// 5️⃣ Remove
//        map.remove("orange");

// 6️⃣ Iterate
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        System.out.println(map.containsValue(5));

    }
}
