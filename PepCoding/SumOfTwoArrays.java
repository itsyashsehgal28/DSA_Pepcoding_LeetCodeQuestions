// video 100

import java.util.Scanner;

public class SumOfTwoArrays {
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
        int[] sum = new int[n>m?n:m];
        
        int i = arr.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;
        int carry=0;

        while(k>=0){
            int digit = carry;

            if(i>=0){
                digit = digit + arr[i];
            }

             if(j>=0){
                digit = digit + arr2[j];
            }

            carry = digit / 10 ;
            digit = digit % 10 ; 

            sum[k] = digit;

            i--;
            j--;
            k--;


        }
        if(carry != 0){
            System.out.print(carry);
        }

        for(int val:sum){
            System.out.print(val);
        }

        sc.close();
    }
}
