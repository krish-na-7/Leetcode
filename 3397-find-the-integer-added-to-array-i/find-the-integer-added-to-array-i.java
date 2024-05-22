class Solution {

    public int addedInteger(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        // return nums2[0] - nums1[0];

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums1.length; i++) {
            if (min1 > nums1[i]) {
                min1 = nums1[i];
            }

            if (min2 > nums2[i]) {
                min2 = nums2[i];
            }
        }

        return min2 - min1;
    }
}
