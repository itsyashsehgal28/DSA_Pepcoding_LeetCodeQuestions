// video 49

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print("\t");
            }

            System.out.print("*");
            System.out.println();
        }

        sc.close();
    }
}

/*
5
                                *
                        *
                *
        *
*
 */