class Solution {

    public int commonFactors(int a, int b) {
        // int n = a < b ? a : b, count = 1;
        // for(int i = 2; i <= n ; i++){
        //     if(a % i == 0 && b % i == 0){
        //         count++;
        //     }
        // }
        // return count++;

        int small;
        int count = 1;
        if (a > b) {
            small = b;
        } else {
            small = a;
        }
        for (int i = 2; i <= small; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}
