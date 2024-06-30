public class QuickSort {
    public static int Partition(int arr[] , int low , int high){
        int pivot = arr[low];
        int start=low;
        int end = high;

        while(start<end){

            while(arr[start] <= pivot && start<=high){
                start++;
            }

            while(arr[end] > pivot){
                end--;
            }

            if(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            } 
        }

        int temp = arr[low];
        arr[low] = arr[end];
        arr[end] = temp;

        return end;
    }

    public static void Qs(int arr[], int lb ,int ub)
    {
        if(lb<ub){
            int loc = Partition(arr, lb, ub);
            Qs(arr , lb , loc-1);
            Qs(arr , loc + 1 , ub);
        }
    }

    public static void print(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args){
        int[] arr = {9,5,7,6,3,4,2,1,8};
        Qs(arr , 0 , arr.length -1);
        print(arr);
    }
}
