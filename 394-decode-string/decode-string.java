class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String curr = "";
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');   // build multi-digit number
            } else if (ch == '[') {
                numStack.push(num);
                strStack.push(curr);
                num = 0;
                curr = "";
            } else if (ch == ']') {
                int repeat = numStack.pop();
                String prev = strStack.pop();
                StringBuilder sb = new StringBuilder(prev);
                for (int r = 0; r < repeat; r++) sb.append(curr);
                curr = sb.toString();
            } else {
                curr += ch;   // append letter
            }
        }
        return curr;
    }
}
