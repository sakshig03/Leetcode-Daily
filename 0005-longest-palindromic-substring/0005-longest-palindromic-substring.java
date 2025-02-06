class Solution {
    public String longestPalindrome(String s) {
        char[] str=s.toCharArray();
        
        if(s.length()<2){
            return s;
        }
    int maxLen=0;
    int low=0;
    int high=0;
        for(int i=1;i<str.length;i++){
            int sIndex=i-1;
        int eIndex=i+1;
            while(sIndex>=0 && eIndex<str.length && str[sIndex]==str[eIndex]){
                sIndex--;
                eIndex++;
            }
            sIndex++;
            eIndex--;
            if(maxLen<(eIndex-sIndex+1)){
                low=sIndex;
                high=eIndex;
                maxLen=eIndex-sIndex+1;
            }
            sIndex = i - 1;
            eIndex = i;
            while (sIndex >= 0 && eIndex < str.length && str[sIndex] == str[eIndex]) {
                sIndex--;
                eIndex++;
            }
            sIndex++; eIndex--;
            if (maxLen < (eIndex - sIndex + 1)) {
                low = sIndex;
                high = eIndex;
                maxLen = eIndex - sIndex + 1;
            }
        }
        return s.substring(low,high+1);

    }
}