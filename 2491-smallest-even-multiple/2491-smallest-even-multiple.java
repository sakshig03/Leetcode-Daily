class Solution {
    public int smallestEvenMultiple(int n) {
        
        // if(n%2==0){
        //     return n;
        // }
        // if(n%2!=0){
        //     return n*2;
        // }
        // return -1;
        return n << (n & 1);
    }
}