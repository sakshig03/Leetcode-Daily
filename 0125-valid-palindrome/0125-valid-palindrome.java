class Solution {
    public boolean isPalindrome(String s) {
        // //first approach
        if(s.equals(" ")){
            return true;
        }
        // s = s.toLowerCase();

        // String s1=s.replaceAll("[^a-zA-Z0-9]","");
        // String reversed=new StringBuilder(s1).reverse().toString();
        // if(s1.equals(reversed)){
        //     return true;
        // }
        // return false;

        //second approach
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
        
    }
}