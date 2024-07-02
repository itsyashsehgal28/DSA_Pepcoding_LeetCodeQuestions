// video 35

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){
            int j = i;
            while(j>0){
                System.out.print("* ");
                j--;
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
5
*
* *
* * *
* * * *
* * * * *
 */
