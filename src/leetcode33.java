import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetcode33 {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        System.out.println(solution33.uniqueOccurrences( new int[]{-3,0,1,-3,1,1,1,-3,10,0} ));
    }
}

class Solution33 {
    public boolean uniqueOccurrencesNotWorking(int[] arr) {


        int[] counts = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            counts[arr[i]] = counts[arr[i]]++; // what if array value is negative??

        }
        for (int i = 0; i < counts.length - 1; i++) {
            if (counts[i] == counts[i + 1]) {
                return false;
            }
            return true;
        }
        return true;
    }
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (int key : map.keySet()) {
            if (!set.add(map.get(key))) return false; // because sets take unique numbers only no repetitive numbers so we are checking, if it is possible to add a number to the set then its not repeptive otherwise return false because it is repetivie
        }
        return true;
    }
}


