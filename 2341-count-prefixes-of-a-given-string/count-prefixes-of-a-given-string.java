class Solution {
    public int countPrefixes(String[] words, String s) {
       // int c = 0;
        // for(int i = 0; i < words.length ; i++){
        //     if(words[i].length() <= s.length() && s.substring(0,words[i].length()).equals(words[i])){
        //         c++;
        //     }
        // }
        // return c;

        int count = 0;
        for (String i : words)
            if (s.startsWith(i)) count++;
        return count;

        // return (int) Arrays.stream(words).filter(s::startsWith).count();  
    }
}