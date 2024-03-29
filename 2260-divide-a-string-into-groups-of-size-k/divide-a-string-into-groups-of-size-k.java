class Solution {
    public String[] divideString(String s, int k, char fill) {
        //  int len=s.length(),size=0,rem=0;
        // if(len%k==0){
        //     size=len/k;
        // }else{
        //     rem=k-(len%k);
        //     size=len/k +1;
        // }
        // for(int i=0;i<rem;i++){
        //     s+=fill;
        // }
        // int start=0,end=k;
        // String[] ans=new String[size];
        // for(int i=0;i<size;i++){
        //     String temp=s.substring(start,end);
        //     ans[i]=temp;
        //     start=end;
        //     end+=k;
        // }
        // return ans;

          List<String> ans = new ArrayList<>();
        for(int i=0; i<s.length(); i+=k){
            StringBuilder as = new StringBuilder("");
            if(i+k<=s.length()) as.append(s.substring(i, i+k));
            else as.append(s.substring(i));
            if(as.length()!=k){
                for(int j=as.length(); j<k; j++) as.append(fill);
            }
            ans.add(as.toString());
        }
        int n = ans.size();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}