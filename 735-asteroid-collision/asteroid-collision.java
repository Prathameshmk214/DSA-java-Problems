import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < asteroids.length; i++) {
            int asteroid = asteroids[i];
            boolean destroyed = false;
            
            // Collision check
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.peek();
                if (Math.abs(asteroid) > top) {
                    stack.pop(); // top asteroid destroyed
                    continue;
                } else if (Math.abs(asteroid) == top) {
                    stack.pop(); // both destroyed
                }
                destroyed = true; // current asteroid destroyed
                break;
            }
            
            if (!destroyed) {
                stack.push(asteroid);
            }
        }
        
        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}
