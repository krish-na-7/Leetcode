class Solution {
    public int addDigits(int num) {
        int s = 0;
        while(num > 0){
            s = s + num % 10;
            num /= 10;
            if(num == 0 && s >= 10){
                num = s ;
                s = 0;
            }
        }
        return s;
    }
}