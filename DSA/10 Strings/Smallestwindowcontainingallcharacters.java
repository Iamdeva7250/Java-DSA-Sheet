import java.util.*;
import java.io.*;

public class Smallestwindowcontainingallcharacters {
    
    // Your code here
     public static String smallestWindow(String s, String p) {
        // code here
        if(s.length() < p.length()) return "";
        
        int [] freqp = new int [256];
        int [] freqs = new int [256];
        
        for(int i = 0; i< p.length(); i++){
            freqp[p.charAt(i)]++;
        }
        
        int start = 0, startindex = -1;
        int minlen = Integer.MAX_VALUE;
        int count = 0;
        
        for(int end = 0; end < s.length(); end++){
            char ch = s.charAt(end);
            freqs[ch]++;
            
            if(freqp[ch] != 0 && freqs[ch] <= freqp[ch]){
                count++;
            }
            
            if(count == p.length()){
                
                while(freqs[s.charAt(start)] > freqp[s.charAt(start)] || freqp[s.charAt(start)] == 0){
                    
                    if(freqs[s.charAt(start)] > freqp[s.charAt(start)]){
                        freqs[s.charAt(start)]--;
                    }
                    start++;
                }
                
                int windowlen = end - start +1;
                if(windowlen < minlen){
                    minlen = windowlen;
                    startindex = start;
                }
            } 
        }
        
        if(startindex == -1) return "";
        return s.substring(startindex, startindex + minlen);    
        
    }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        String s = sc.nextLine();
        
        System.out.print("Enter the pattern string: ");
        String p = sc.nextLine();
        
        String result = smallestWindow(s, p);
        
        if(result.isEmpty()) {
            System.out.println("No such window exists.");
        } else {
            System.out.println("Smallest window containing all characters of pattern: " + result);
        }
        
        sc.close();
  }
    
}