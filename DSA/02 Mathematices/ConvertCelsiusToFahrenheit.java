import java.util.*;
import java.io.*;

public class ConvertCelsiusToFahrenheit {
    
    // Your code here
      public double cToF(int C)
    {
        return(C*1.8)+32;
    }

    public static void main(String[] args) {
        ConvertCelsiusToFahrenheit obj = new ConvertCelsiusToFahrenheit();
        int C = 25;
        double result = obj.cToF(C);
        System.out.println(result);
    }
    
}