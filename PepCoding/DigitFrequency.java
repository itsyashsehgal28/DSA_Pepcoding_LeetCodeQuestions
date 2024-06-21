// video 77

import java.util.Scanner;

        
public class DigitFrequency {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;

        count = DigitCount(n, d);
        System.out.println(count);
        sc.close();
    }


    public static int DigitCount(int n , int d){
    int c = 0;
    while(n!=0){
        if(n%10 == d){
            c++;
        }
        n = n/10;
    }
    return(c);
}

    
}

