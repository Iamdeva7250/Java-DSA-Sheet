public class NaviePatternSearching {
  public void PatternSearch(String text, String pattern) {
    int n = text.length();
    int m = pattern.length();

    for (int i = 0; i <= n - m; i++) {
      int j;
      for (j = 0; j < m; j++) {
        if (text.charAt(i + j) != pattern.charAt(j)) {
          break;
        }
      }
      if (j == m) {
        System.out.println("Pattern found at index: " + i);
      }
    }
  }
  public static void main(String[] args) {
    NaviePatternSearching nps = new NaviePatternSearching();
    String text = "ABABDABACDABABCABAB";
    String pattern = "ABABCABAB";
    nps.PatternSearch(text, pattern); 
    
  }
}
