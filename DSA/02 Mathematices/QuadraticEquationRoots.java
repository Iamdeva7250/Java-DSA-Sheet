import java.util.*;
import java.io.*;

public class QuadraticEquationRoots {
    
    // Your code here

     public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> r = new ArrayList<Integer>();
        int D = (b * b) - (4*a*c);
        if(D<0){
            r.add(-1);
            return r;
        }
        double squareD = Math.sqrt(D);
        int root1 = (int) Math.floor((-b + squareD) / (2*a));
        int root2 = (int) Math.floor((-b - squareD) / (2*a));
        r.add(Math.max(root1, root2));
        r.add(Math.min(root1, root2));
        
        return r;
        
    }

    public static void main(String[] args) {
        QuadraticEquationRoots obj = new QuadraticEquationRoots();
        int a = 1, b = -3, c = 2;
        ArrayList<Integer> result = obj.quadraticRoots(a, b, c);
        System.out.println(result);
    }
    
}