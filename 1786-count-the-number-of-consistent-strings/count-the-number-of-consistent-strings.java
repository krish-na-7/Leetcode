class Solution {

    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean flag = false;
            for (int j = 0; j < words[i].length(); j++) {
                if (allowed.indexOf(words[i].charAt(j)) == -1) {
                    flag = !flag;
                    break;
                }
            }
            if (!flag) {
                count++;
            }
        }
        return count;
    }
}
