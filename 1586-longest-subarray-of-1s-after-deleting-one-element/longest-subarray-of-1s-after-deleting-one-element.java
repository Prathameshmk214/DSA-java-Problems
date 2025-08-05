class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0 ;
        int maxLen = 0 ;
        int zerros = 0 ;
        for(int right = 0 ; right < nums.length ; right++){
            if(nums[right] == 0 ){
                zerros++;
            }
            while (zerros > 1){
              if ( nums[left] == 0){
                zerros-- ;
              }
              left++;
            }
            maxLen = Math.max(maxLen , right-left);
        }
        return maxLen ;
    }
}