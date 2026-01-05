import java.util.*;
import java.io.*;

public class AsteroidCollision {
    
    // Your code here
     public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && stack.peek() > 0 && a < 0) {
                if (stack.peek() < -a) {
                    stack.pop(); // top asteroid destroyed
                    continue;
                } else if (stack.peek() == -a) {
                    stack.pop(); // both destroyed
                }
                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(a);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
    public static void main(String[] args) {
        AsteroidCollision solution = new AsteroidCollision();
        int[] asteroids = {5, 10, -5};
        int[] result = solution.asteroidCollision(asteroids);
        System.out.println(Arrays.toString(result)); 
    }
}
    
