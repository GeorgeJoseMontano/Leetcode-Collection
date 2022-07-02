import java.util.HashMap;

public class leetcode {
    public static void main(String args[]){
        String string = "abcabcasdada";
        int x = longestSubstring(string);
        System.out.println(x);


        
    }

    int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");    
    }

   // create a method that will find the length of the longest substring without repeating characters
    public static int longestSubstring(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }
            map.put(c, end);
            max = Math.max(max, end - start + 1);
            end++;
        }
        return max;
    }
}
