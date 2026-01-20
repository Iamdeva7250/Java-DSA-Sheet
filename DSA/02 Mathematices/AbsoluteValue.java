import java.util.*;
import java.io.*;

public class AbsoluteValue {
    
    // Your code here
     public int absolute(int I) {
        
    if(I > 0){
        return I;
    }
    return -I;
    
    
    /* return Math.abs(I); */
    }

    public static void main(String[] args) {
        AbsoluteValue obj = new AbsoluteValue();
        int I = -10;
        int result = obj.absolute(I);
        System.out.println(result); 
    }
}