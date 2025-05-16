class Solution {
    public static String sortString(String str){
        char chars[]=str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        String s1=sortString(s);
        String t1=sortString(t);
        if(s1.equals(t1)){
            return true;
        }
        return false;

        
    }
}