class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        int i = 0;

        if (!word.contains(String.valueOf(ch))){
            return word;
        }
        else{
            while (i < word.length()) {
            char c = word.charAt(i);
            st.push(c);
            i++;

            if (c == ch) {
                break;
            }
            
            
        }
        }

        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        result.append(word.substring(i));

        return result.toString();
    }
}