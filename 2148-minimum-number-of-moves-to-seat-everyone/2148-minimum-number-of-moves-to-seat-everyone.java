import java.util.Arrays;
import java.util.*;
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves=0;
        int j=0;
        for(int i=0;i<seats.length;i++){
            if(Math.abs(seats[i]-students[j])>0){
                moves+=Math.abs(seats[i]-students[j]);

            }
            j++;
            
        }
        return moves;


        
    }
}