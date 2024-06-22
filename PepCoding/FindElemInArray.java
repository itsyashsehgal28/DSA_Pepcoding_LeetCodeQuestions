// video 95

import java.util.Scanner;

public class FindElemInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int find = sc.nextInt();
        int flag=0;

        for(int j=0;j<arr.length;j++){
            if(arr[j]==find)
            {
                System.out.println("found at position:" + (j+1));
                flag=1;
                break;
            }
        }

        if(flag==0){
            System.out.println("not found");
        }

        sc.close();

    }
}
