// video 27

import java.util.*;

public class GCDandLCM {
    
    public static void LCM_GCD_MySolve(int x , int y){
        int small = x>y?y:x;
        int GCD = 1;
        int LCM = 1;
        for(int i=small;i>=2;i--){
            if((x%i==0) && (y%i==0)){
                GCD = i;
                break;
            }
        }

        LCM = (x/GCD)*(y/GCD)*(GCD);
        System.out.println(GCD);
        System.out.println(LCM);
    }

    public static void PepSolve(int x , int y){
        int n1 = x;
        int n2 = y;
        while(n1%n2 !=0){
            int rem = n1 % n2; 
            n1 = n2;
            n2 = rem;

        }

        int gcd = n2;
        int lcm = (x*y)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);


    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // LCM_GCD_MySolve(num1, num2);
        PepSolve(num1 , num2);
        sc.close();
    }
}