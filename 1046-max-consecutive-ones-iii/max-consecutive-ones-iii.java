class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerros = 0 ;
        int start = 0 ;
         int maxCou = 0 ;
         for(int end = 0 ; end < nums.length ; end++){
            if(nums[end] == 0 ){
                zerros++;
            }
            while(zerros > k ){
              if(  nums[start] == 0){ 
                zerros--;
                
              }
              start++;
            }
            maxCou = Math.max( maxCou , end - start + 1);
         }
           return maxCou ;
    }
}