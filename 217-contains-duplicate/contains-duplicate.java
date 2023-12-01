class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int f = 0;
        // for(int i = 0 ; i < nums.length ; i++){
        //    for(int j = i + 1 ; j < nums.length ; j++){
        //        if(nums[j] == nums[i]){
        //            return true;
        //        }
        //    }
        // }
        // return false;

        Set<Integer> s = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
           if(!s.add(nums[i])){
               return true;
           }
        }
        return false;
    }
}