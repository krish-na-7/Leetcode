class Solution {

    public int countNegatives(int[][] grid) {
        // int count = 0;
        // for (int i = 0; i < grid.length; i++) {
        //     for (int j = 0; j < grid[i].length; j++) {
        //         if (grid[i][j] < 0) {
        //             count++;
        //         }
        //     }
        // }
        // return count;

        int rows = grid.length, cols = grid[0].length;
        int res = 0, lastNeg = cols - 1;
        for (int row = 0; row < rows; row++) {
            //check edge cases - if first element is < 0 - all elements in row are negative
            if (grid[row][0] < 0) {
                res += cols;
                continue;
            }
            //if last element is positive - it means there are no negative numbers in a row
            if (grid[row][cols - 1] > 0) continue;
            //there is a mix of negative and positive ones, need to find the border. starting
            //binary search
            int l = 0, r = lastNeg;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (grid[row][m] < 0) {
                    r = m - 1;
                } else l = m + 1;
            }
            //l points to the first negative element, which means cols - l is a number of
            //such elements
            res += (cols - l);
            lastNeg = l;
        }
        return res;
    }
}
