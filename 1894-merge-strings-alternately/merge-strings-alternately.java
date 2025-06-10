class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int maxLenght = Math.max(len1 , len2);

          for(int i = 0 ; i < maxLenght; i++){
            if (i< len1){
                result.append(word1.charAt(i));
            }
            if (i < len2){
                result.append(word2.charAt(i));
            }

          }
          return result.toString();
    }
}