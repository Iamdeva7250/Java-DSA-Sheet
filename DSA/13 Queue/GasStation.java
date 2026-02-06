import java.util.*;
import java.io.*;

public class GasStation {
    
    // Your code here
     public int startStation(int[] gas, int[] cost) {
        // code here
        
        int n = gas.length;
        int start = 0;
        int balance = 0;
        int deficit = 0;
        
        
        for(int i = 0; i < n; i++){
            balance += gas[i] - cost[i];
            
            
            if(balance < 0){
                deficit += balance;
                start = i + 1;
                balance = 0;
            }
        }
        return (balance + deficit >= 0) ? start : -1;
    }


    public static void main(String[] args) {
        GasStation gs = new GasStation();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int startIndex = gs.startStation(gas, cost);
        System.out.println("Starting gas station index: " + startIndex);
    }
    
}