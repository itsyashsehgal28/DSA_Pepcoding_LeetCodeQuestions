// video 11

import java.util.Scanner;
public class AllPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to enter:");
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){

            int a = sc.nextInt();
            int count=0;

            for(int k=2; k*k<=a ; k++){
                if(a%k==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }

        }

        sc.close();

    }
}
