// video 41

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            int star = i ; 
            int space = n-i;

            while(space!=0){
                System.out.print(" \t");
                space--;
            }

            while(star !=0){
                System.out.print("*\t");
                star--;
            }

            System.out.println();

        }


/*
5
*       *       *       *       *
        *       *       *       *
                *       *       *
                        *       *
                                *
*/








        sc.close();
    }
}
