public class ImprovedNaiveDistinctpattern {


  public void PatternSearch(String text, String pattern) {
    int n = text.length();
    int m = pattern.length();

    for(int i = 0; i <= n - m; ) {
      int j;
      for (j = 0; j < m; j++) {
        if (text.charAt(i + j) != pattern.charAt(j)) {
          break;
        }
      }
      if (j == m) {
        System.out.println("Pattern found at index: " + i);
        i += m; // Shift the pattern by its length if a match is found
      } else if (j == 0) {
        i++; // Shift by one if no characters matched
      } else {
        i += j; // Shift by the number of matched characters
      }
    }
  
  }
  public static void main(String[] args) {
    ImprovedNaiveDistinctpattern inps = new ImprovedNaiveDistinctpattern();
    String text = "ABABDABACDABABCABAB";
    String pattern = "ABABCABAB";
    inps.PatternSearch(text, pattern);
  }
  
}
