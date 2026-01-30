import java.util.*;

public class SortCharByFreq {
    
    static class Solution {
        public String frequencySort(String s) {
            // Count frequency of each character
            Map<Character, Integer> freqMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
            
            // Create a list of map entries and sort
            List<Map.Entry<Character, Integer>> entries = new ArrayList<>(freqMap.entrySet());
            
            // Sort by frequency descending, then by character ascending
            Collections.sort(entries, (a, b) -> {
                int freqCompare = b.getValue().compareTo(a.getValue());
                if (freqCompare != 0) {
                    return freqCompare;
                }
                return a.getKey().compareTo(b.getKey());
            });
            
            // Build result string
            StringBuilder result = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : entries) {
                char c = entry.getKey();
                int freq = entry.getValue();
                for (int i = 0; i < freq; i++) {
                    result.append(c);
                }
            }
            
            return result.toString();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println("Testing Frequency Sort:");
        System.out.println("tree -> " + solution.frequencySort("tree"));       // "eert" or "eetr"
        System.out.println("cccaaa -> " + solution.frequencySort("cccaaa"));   // "cccaaa" or "aaaccc"
        System.out.println("Aabb -> " + solution.frequencySort("Aabb"));       // "bbAa" or "bbaA"
        
        // Additional test cases
        System.out.println("Test 1: " + solution.frequencySort("loveleetcode")); 
        System.out.println("Test 2: " + solution.frequencySort("abcABC")); 
        System.out.println("Test 3: " + solution.frequencySort("123321")); 
    }
}