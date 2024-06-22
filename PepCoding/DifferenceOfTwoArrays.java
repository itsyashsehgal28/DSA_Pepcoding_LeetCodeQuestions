// video

import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }


        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }

        // int max = (n>m)?n:m;
        int[] diff = new int[m];
        
        int i = arr.length-1;
        int j = arr2.length-1;
        int k = diff.length-1;
        int carry=0;

        while(k>=0){
            int digit=0;
            int a1val = i>=0?arr[i]:0;

            if(arr2[j] + carry >= a1val){
                digit = carry + arr2[j] - a1val;
                carry=0;
            }
            else{
                digit = carry+ 10 + arr2[j] - a1val;
                carry=-1;
            }

            diff[k]=digit;

            i--;
            j--;
            k--;


        }
        
        int idx = 0;
        while(idx <diff.length){
            if(diff[idx]==0){
                idx++;
            }
            else{
                break;
            }
        }

         while(idx < diff.length){
            System.out.print(diff[idx]);
            idx++;
        }

        sc.close();
    }
}
