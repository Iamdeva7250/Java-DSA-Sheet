import java.util.*;
import java.io.*;

public class StackinJavaCollection {
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
    
}