class Solution {
    public int xorOperation(int n, int start) {
        int a = start + 2 * 0;
        for(int i = 1 ; i < n ; i++){
            a = a ^ (start + 2 * i);
        }
        return a;
    }
}