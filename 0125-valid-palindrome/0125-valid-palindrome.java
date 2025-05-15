class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" ")){
            return true;
        }
        s = s.toLowerCase();

        String s1=s.replaceAll("[^a-zA-Z0-9]","");
        String reversed=new StringBuilder(s1).reverse().toString();
        if(s1.equals(reversed)){
            return true;
        }
        return false;
        
    }
}