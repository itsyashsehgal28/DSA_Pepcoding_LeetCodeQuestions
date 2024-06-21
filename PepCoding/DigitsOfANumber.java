// video 19

import java.util.*;

public class DigitsOfANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count=0;
        while(temp!=0){
            count ++ ;
            temp = temp/10;
        }

        int div = (int)Math.pow(10, count-1);

        while(div!=0){
            int a = n / div ;
            System.out.println(a);
            n= n % div;
            div = div/10;
        }
        sc.close();
    }
}
