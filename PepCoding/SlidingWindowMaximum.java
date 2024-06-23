// video 115

import java.util.Scanner;

public class SlidingWindowMaximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int ws = sc.nextInt();
        int[] ra = new int[n];

        int max = 0 ; 
        for(int i=0; i <= (arr.length-ws+1);i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        ra[i] = max;
    }
}
