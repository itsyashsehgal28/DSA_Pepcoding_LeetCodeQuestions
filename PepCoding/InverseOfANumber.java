// video 23

import java.util.Scanner;

public class InverseOfANumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int inverse = 0;
        int count = 0;
        while(temp!=0){
            int a = temp % 10;
            count++;
            inverse = inverse + (count *(int)Math.pow(10, a-1));
            temp = temp / 10;
        }
        System.out.println(inverse);
    }
}
