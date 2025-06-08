import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        // Trim the string and split it by one or more spaces using regex
        String[] words = s.trim().split("\\s+");

        Stack<String> stack = new Stack<>();

        // Push all words onto the stack
        for (String word : words) {
            stack.push(word);
        }

        // Pop from stack to reverse order
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            if (!stack.isEmpty()) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
