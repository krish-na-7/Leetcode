class Solution {
    public int romanToInt(String s) {
        int answer = 0,number =0,prev = 0;
        for(int i = s.length()-1; i > -1  ; i--){
            switch(s.charAt(i)){
                case 'I': number = 1; break;
                case 'V': number = 5; break;
                case 'X': number = 10; break;
                case 'L': number = 50; break;
                case 'C': number = 100; break;
                case 'D': number = 500; break;
                case 'M': number = 1000; break;
            }
             if (number < prev) {
            answer = answer - number;
        }
        else {
            answer = answer + number;
        }
        prev = number;
        }
        return answer;
    }
}