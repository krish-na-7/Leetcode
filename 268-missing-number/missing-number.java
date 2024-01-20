class Solution {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            if ((nums[i]) != i) {
                return i;
            }
        }
        return n;
    }
}
