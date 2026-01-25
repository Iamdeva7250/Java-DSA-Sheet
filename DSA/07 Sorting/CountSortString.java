public class CountSortString {
  
    public static String countSort(String s) {
        int n = s.length();

        int[] count = new int[256]; 

        
        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
        }

        
        StringBuilder sorted = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            while (count[i]-- > 0) {
                sorted.append((char) i);
            }
        }

        return sorted.toString();
    }

    
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(countSort(s));  
    }
}

  

