
        class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuffer a = new StringBuffer(s);
        for (int i = 0; i < spaces.length; i++)
        {
            a.insert(spaces[i] + i, " ");
        }
        return a.toString();
    }
}
        
    