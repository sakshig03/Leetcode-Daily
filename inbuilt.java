import java.util.Arrays;
import java.util.*;
import java.util.Collections;
public class inbuilt {
    public static void printArr(Integer arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);

    }
}
