import java.util.*;
import java.io.*;

public class ModularInverse {
    
    // Your code here
      public int modInverse(int a, int m)
    {
      //Your code here
     for( int i = 1; i<m; i++){
         if((a*i)%m ==1)
         return i;
     }
     return -1;
    }


    public static void main(String[] args) {
        ModularInverse obj = new ModularInverse();
        int a = 3;
        int m = 11;
        int result = obj.modInverse(a, m);
        System.out.println(result);
    }
}