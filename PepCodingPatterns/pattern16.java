import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=1;
        int space=2*n-3;

        for(int i=1;i<=n;i++){
            int count=1;
            for(int j=1;j<=star;j++){
                System.out.print(count + "\t");
                count++;
            }

            for(int k=1;k<=space;k++){
                System.out.print("\t");
            }

            if(star == n){
                star--;
                count--;
            }
            for(int j=1;j<=star;j++){
                count--;
                System.out.print(count + "\t");
            }

            star++;
            space-=2;
            System.out.println();
        }
        sc.close();
    }
}

/*
4
1                                               1
1       2                               2       1
1       2       3               3       2       1
1       2       3       4       3       2       1
 */
