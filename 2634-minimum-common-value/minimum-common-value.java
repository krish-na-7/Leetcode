class Solution {

    public int getCommon(int[] nums1, int[] nums2) {
        // HashSet<Integer> set = new HashSet<>();
        // for (int num : nums1) {
        //     set.add(num);
        // }
        // for (int num : nums2) {
        //     if (set.contains(num)) {
        //         return num;
        //     }
        // }
        // return -1;

        
        int i = 0, j = 0, l1 = nums1.length, l2 = nums2.length;
        // For faster solution
        if (nums1[l1 - 1] < nums2[0] || nums2[l2 - 1] < nums1[0]) return -1;
        // Two pointer approach
        while (i < l1 && j < l2) {
            if (nums1[i] == nums2[j]) return nums1[i]; else if (nums1[i] > nums2[j]) j++; else i++;
        }
        return -1;
    }
}
