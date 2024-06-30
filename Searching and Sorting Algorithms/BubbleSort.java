public class BubbleSort {
    public static void main(String[] args){
    int[] arr = {5,9,2,8,1};

    for(int i=1;i<=arr.length-1;i++){
        for(int j=0;j<arr.length-i;j++){
            if(arr[j+1]<arr[j]){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}

}
