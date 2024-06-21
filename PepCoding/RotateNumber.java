// video 25

import java.util.Scanner;
public class RotateNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        System.out.println("how many times to be rotated: ");
        int rotate = sc.nextInt();
        int count=0 , temp=n;
        while(temp!=0){
            count ++ ;
            temp=temp/10;
        }

        rotate = rotate % count; //this will give the exact value of rotations 
        if(rotate < 0){
            rotate = count + rotate;
        }  

        int newNumber = 0;
        newNumber = ((n%(int)Math.pow(10, rotate))* (int)Math.pow(10, count-rotate)) + (n/(int)Math.pow(10, rotate));
        System.out.println(newNumber);

        sc.close();


    }
}
