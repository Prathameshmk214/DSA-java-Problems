class Solution {
    public String removeStars(String s) {
       StringBuilder sb = new StringBuilder();
       for(int i = 0 ; i< s.length() ; i++){
        char arr = s.charAt(i);
        if(arr == '*'){
            sb.deleteCharAt(sb.length() - 1);
        }
        else{
            sb.append(arr);
        }
       } 
       return sb.toString();
    }
}