class Solution {
    public boolean checkString(String s) {
        boolean flag = false;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'a' && flag){
                return false;
            }else if(s.charAt(i) == 'b'){
                flag = true;
            }
        }
        return true;
    }
}