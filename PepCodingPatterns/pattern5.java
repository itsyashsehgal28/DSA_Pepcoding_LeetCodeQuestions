// video 43

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = (int)5/2;
        int star = 1;
        for(int i=1;i<=n;i++){
            
            for(int j=space ; j>0;j--){
                System.out.print("\t");
            }

            for(int k=star ; k>0;k--){
                System.out.print("*\t");
            }

            if(i<= n/2){
                space--;
                star+=2;
            }
            else {
                space++;
                star-=2;
            }

            System.out.println();



           
            

        }
    }
}
