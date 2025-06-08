class Solution {
    public boolean Vowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!Vowel(arr[start])) {
                start++;
                continue;  // Skip to next iteration
            }
            if (!Vowel(arr[end])) {
                end--;
                continue;  // Skip to next iteration
            }

            // Both are vowels, swap them
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }
}
