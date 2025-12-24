import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap_Patterns {
    static void main(String[] args) {
        //Pattern 1: Frequency Counting
        String s = "leetcode";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            System.out.println(c + ":" + freq.get(c));
        }

        // freq now contains: l:1, e:3, t:1, c:1, o:1, d:1

        //Pattern 2: First Unique Character
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1){
                index = i;
                break;
            }
        }
        System.out.println("The first Unique letter is " + s.charAt(index) + " at index " + index);

        //Pattern 3: Index Tracking
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] indexOfSum = {};
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                indexOfSum = new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        for (int i = 0; i < indexOfSum.length; i++){
            System.out.println(indexOfSum[i]);
        }

        //Pattern 4: Grouping
        String[] words = {"a","to","be","tea"};
        HashMap<Integer, List<String>> map1 = new HashMap<>();

        for (String w : words) {
            int len = w.length();
            map1.putIfAbsent(len, new ArrayList<>());
            map1.get(len).add(w);
        }
        // 🔹 Printing the map
        for (Map.Entry<Integer, List<String>> entry : map1.entrySet()) {
            System.out.println("Length " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
