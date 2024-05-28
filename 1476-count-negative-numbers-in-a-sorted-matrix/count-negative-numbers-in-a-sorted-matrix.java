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

        int rows = grid.length;
        int cols = grid[0].length;
        int row = 0;
        int col = grid[0].length - 1;
        int count = 0;
        while (row < rows && col >= 0) {
            if (grid[row][col] >= 0) {
                row++;
            } else {
                count += rows - row;
                col--;
            }
        }
        return count;
    }
}
