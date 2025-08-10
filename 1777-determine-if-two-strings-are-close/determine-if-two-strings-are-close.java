import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        // Step 1: If lengths differ → impossible
        if (word1.length() != word2.length()) return false;

        int[] freq1 = new int[26]; // for word1
        int[] freq2 = new int[26]; // for word2

        // Step 2: Count frequency for word1
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            freq1[c - 'a']++;
        }

        // Step 3: Count frequency for word2
        for (int i = 0; i < word2.length(); i++) {
            char c = word2.charAt(i);
            freq2[c - 'a']++;
        }

        // Step 4: Check if they have the same set of characters
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || 
                (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }

        // Step 5: Sort frequencies so we can compare counts
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        // Step 6: Compare sorted frequencies
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}
