// video 15

import java.util.Scanner;

public class FibonacciTillN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();

        int a = 0;
        int b = 1 ;

        for(int i=0 ; i<end;i++){
           System.out.println(a);
           int c = a + b;
           a = b;
           b = c;

        }
        sc.close();
    }
}
