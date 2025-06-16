class Solution {
    public int maxVowels(String s, int k) {
        int winVow = 0 ;
        int maxVow  = 0 ;
        HashSet <Character> vowels = new HashSet <>();
        vowels.add('a') ;vowels.add('e');vowels.add('i');vowels.add('o');vowels.add('u')  ;
        
       
        for(int i = 0 ; i < k ; i++){
            if(vowels.contains(s.charAt(i))){
                winVow++ ;
                maxVow  = winVow ;
            }
        }
        for(int i = k ; i < s.length() ; i++){
            if(vowels.contains(s.charAt(i - k))){
                winVow-- ;
            }
             if(vowels.contains(s.charAt(i))){
                winVow++ ;
             }
             maxVow = Math.max(maxVow , winVow);
        }
      return maxVow ;  
    }
}