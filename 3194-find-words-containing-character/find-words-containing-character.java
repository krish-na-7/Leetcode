class Solution {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                r.add(i);
            }
        }
        return r;
    }
}
