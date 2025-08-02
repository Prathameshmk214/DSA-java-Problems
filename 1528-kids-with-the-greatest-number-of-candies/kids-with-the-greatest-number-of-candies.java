class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max = 0 ;
        for (int i = 0 ; i<= candies.length -1 ;i++){
            if(max <= candies[i]){
                max = candies[i] ;
            }
        }
        for(int i = 0 ; i <= candies.length-1 ;i++){
            result.add(candies[i]+ extraCandies >= max);
            
        

        }
        return result;
    }
    

}