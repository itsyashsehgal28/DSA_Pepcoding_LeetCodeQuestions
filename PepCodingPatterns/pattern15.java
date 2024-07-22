// video 63

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star=1 , space = 2 , val=1 ;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            
            int cval = val;
            for(int j=1; j<=star;j++){
                System.out.print(cval +"\t");

                if(j<=star/2){
                    cval++;
                }else{
                    cval--;
                }
            }

            if(i<=n/2){
                space--;
                star+=2;
                val++;
            }
            else{
                space++;
                star-=2;
                val--;
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
5
                1
        2       3       2
3       4       5       4       3
        2       3       2
                1
 */