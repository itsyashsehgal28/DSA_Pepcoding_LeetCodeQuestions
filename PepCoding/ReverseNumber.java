// video 21

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n!=0){
            int a = n%10;
            System.out.println(a);
            n=n/10;
        }

        sc.close();
    }
}
