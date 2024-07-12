// video 45

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = 3;
        int space = 1;

        for(int i=0;i<n;i++){
            for(int j=star; j>=1;j--){
                System.out.print("*\t");
            }

            for(int k=space;k>=1;k--){
                System.out.print("\t");
            }

            for(int j=star; j>=1;j--){
                System.out.print("*\t");
            }

            if(i < n/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }

            System.out.println();
        }
        sc.close();
    }
}


/*
5
*       *       *               *       *       *
*       *                               *       *
*                                               *
*       *                               *       *
*       *       *               *       *       *
 */