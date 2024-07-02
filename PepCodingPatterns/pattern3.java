// video 39

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
                int space = n-i; 
                int star = i;
                while(space != 0){
                    System.out.print(" ");
                    space--;
                }

                while(star !=0){
                    System.out.print("*");
                    star--;
                }  
                System.out.println(); 
            }
            sc.close();
        }
}

/*
5
    *
   **
  ***
 ****
*****
 */