

public class MergeSort{
    
    public static int[] ms(int[]arr , int low , int high){
        
        if(low == high){
            // base case
            int ba[] = new int[1];
            // ba means base array which will only contain 1 element
            ba[0] = arr[low];
            // ba[0] = arr[high] doesnt matter as there is only 1 element hence low and high are same
            return ba;
        }

        int mid=(low+high)/2;
        int[] fsh = ms(arr , low , mid);                // first sorted half
        int[] ssh = ms(arr , mid+1 , high);             // second sorted half
        int[] fsa = mergeTwoSortedArrays(fsh, ssh);     // full sorted array
        return fsa;
    }

    public static int[] mergeTwoSortedArrays(int[]a , int[]b){
        int[]res = new int[a.length + b.length];
        int i=0,j=0 ,k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k] = a[i];
                i++;
                k++;
            }
            else if(a[i]>b[j]){
                res[k] = b[j];
                j++;
                k++;
            }
        }

        while(i<a.length){
            res[k] = a[i];
                i++;
                k++;
        }

        while(j<b.length){
            res[k] = b[j];
                j++;
                k++;
        }

        return res;

    }

    public static void print(int[] a){
            for(int i=0;i<a.length;i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
    }


    public static void main(String[] args){
        int[]arr = {1,8,7,5,4,2,3,6};
        int[]sa = ms(arr,0,arr.length-1);

        print(sa);        
    }

    
}