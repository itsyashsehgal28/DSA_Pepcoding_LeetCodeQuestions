// video 59
// permutation and combination question

// nCk+1 = (nCk .(n-k))/k+1    -----> iCj+1 = (iCj .(i-j))/j+1
// first value will always be 1 since nC0 is always 1 and nCn is also 1
// we will use first value to calculate the next value 

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = 1;
            for(int j=0;j<=i;j++){
                System.out.print(val +"\t");
                int valPlus1 = (val * (i-j)) / (j+1);
                val = valPlus1 ; 
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
5
1
1       1
1       2       1
1       3       3       1
1       4       6       4       1
 */
