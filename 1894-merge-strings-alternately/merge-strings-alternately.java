class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int str1 = word1.length();
        int str2 = word2.length();
        int maxStr = Math.max(str1 ,str2 );
        for(int i = 0 ; i <= maxStr ;i++){
            if(i< str1){
                result.append(word1.charAt(i));

            }if(i < str2){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}