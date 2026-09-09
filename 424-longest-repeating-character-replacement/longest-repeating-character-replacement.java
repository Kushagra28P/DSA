class Solution {
    public int characterReplacement(String s, int k) {
        int l =0;  
        int maxLength =0;
        int maxFreq =0;
        int[] freq = new int[26];

        for(int r =0;r<s.length();r++){
            int i = s.charAt(r)-'A';
            freq[i]++;
            maxFreq = Math.max(maxFreq,freq[i]);
            int replace = (r-l+1)-maxFreq;
            while(replace>k){
                int index = s.charAt(l)-'A';
                freq[index]--;
                l++;
                replace= (r-l+1)-maxFreq;
            }
            maxLength =Math.max(maxLength,r-l+1);
        }
        return maxLength;
    }
}