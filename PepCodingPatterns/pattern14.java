// video 61 
// printing table for the number entered 

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.print(n + "\tx\t" + i + "\t=\t" + (n*i));
            System.out.println();
        }
        sc.close();
    }
}

/*
5
5       x       1       =       5
5       x       2       =       10
5       x       3       =       15
5       x       4       =       20
5       x       5       =       25
5       x       6       =       30
5       x       7       =       35
5       x       8       =       40
5       x       9       =       45
5       x       10      =       50
 */