class Solution {
    public int lengthOfLastWord(String s) {
        String m[]=s.split(" ");
        String l=m[m.length-1];
        int f=l.length();
        return f;
    }
}