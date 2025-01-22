public class bubbleSort {
    public static void bubble(int arr[]) {
        int n=arr.length;
        int swap=0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                int temp;
                if(arr[j+1]<arr[j]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap++;
                }

            }

        }
        System.out.println(swap);
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

    }

    public static void main(String[] args) {
        // In a bubble sort,larger element or larger bubble moved to the end of the
        // array.
        // turns requried in bubble sort in n-1

        int arr[] = { 5, 4, 1, 3, 2 };
        bubble(arr);
        

    }

}
