class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c++;
            } else {
                if (max < c) {
                    max = c;
                }
                c = 0;
            }
        }
        return max < c ? c : max;

        // int c = 0, max = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 1) {
        //         c++;
        //     } else {
        //         c = 0;
        //     }
        //    max = max < c ? c : max;
        // }
        // return max;
    }
}
