// video 57

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int a = 0 , b=1 , sum =0;
        

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a + " ");
                sum = a+b;
                a=b;
                b=sum;
            }

            System.out.println();
        }

        sc.close();

    }
}

/*
5
0
1 1
2 3 5
8 13 21 34
55 89 144 233 377
 */
