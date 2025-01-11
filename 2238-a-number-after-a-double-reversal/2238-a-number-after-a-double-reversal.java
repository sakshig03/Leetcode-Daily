class Solution {
    public boolean isSameAfterReversals(int num) {
        
        if(num==0){
            return true;
        }
        if(num>0){
            int lastDigit=num%10;
            if(lastDigit==0){
                return false;
            }
        }
        return true;
    }
}