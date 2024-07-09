import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // benjamin bulbs will be all of the perfect squares because they have 2n+1 factors instead of 2n hence odd factors 
        // which will turn them on

        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }

        sc.close();
    }
}
