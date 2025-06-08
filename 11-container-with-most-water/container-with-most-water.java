class Solution {
    public int maxArea(int[] height) {
        //creating two pointer
        int start = 0 ;
        int end = height.length -1 ;
        int maxCap = 0 ;
        while(start < end){
            int h = Math.min(height[start],height[end]);
            int widht = end - start ;
            int currCap = h * widht ;
            maxCap = Math.max(maxCap ,currCap);
            if(height[start] < height[end]){

                start++;
            }else{
                end-- ;
            }
        }
        return maxCap ;
    }
}