class Solution {
    public String longestPalindrome(String s) {
        String answer ="";

        for(int i=0;i < s.length();i++){
            for(int j=i;j<s.length();j++){
                String str=s.substring(i,j+1);
                if(isPalindrome(str)){
                    if(str.length()>answer.length()){
                        answer = str;
                    }
                }
            }
        }
        return answer;
        
    }
    public boolean isPalindrome(String str){
        int left =0;
        int right = str.length()-1;
        while(left <right ){
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}