// video 53

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int outerSpace = n/2;
        int innerSpace = -1;
        for(int i=1;i<=n;i++){

            for(int k=1;k<=outerSpace;k++){
                System.out.print("\t");
            }

            System.out.print("*\t");
    
            for(int k=1;k<=innerSpace;k++){
                System.out.print("\t");
            } 
            
            if(innerSpace > 0){
                System.out.print("*\t");
            }
            
            if(i<=(n/2)){
                outerSpace--;
                innerSpace+=2;
            }
            else{
                outerSpace++;
                innerSpace-=2;
            }
        
            System.out.println();
        }

        sc.close();
    }
}

/*
5
                *
        *               *
*                               *
        *               *
                *
 */
