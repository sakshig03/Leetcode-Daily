public class CoutingSort {
    public static void counting(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
                
            }
        }

    }
    public static void main(String[] args) {
        //counting sort is used when the numbers are small in range ex:marks of students
        int arr[]={1,4,1,3,2,4,3,7};
        counting(arr);
        //print arrays
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
 
        
    }
    
}
