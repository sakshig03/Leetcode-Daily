class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> list=new ArrayList<>();
         ArrayList<Integer> charList=new ArrayList<>();

        //find the occurences of c in String S
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                charList.add(i);
            }
        }
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=c){
                int minDiff=Integer.MAX_VALUE;
                for (int num : charList) {
                 int diff = Math.abs(i - num); 
                 if (diff < minDiff) {
                minDiff = diff;     
            }
        }
        list.add(minDiff);
        }
            else{
                list.add(0);
            }
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}