import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int biggest = ((n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3));
        // System.out.println(biggest);

        if(biggest == n1){
            // if(n1*n1 == (n2*n2)+ (n3*n3)){
            //     System.out.println("true");
            // }
            // else{
            //     System.out.println("false"); 
            // }

            boolean flag = (n1*n1 == (n2*n2)+ (n3*n3));
            System.out.println(flag);
        }
        else if(biggest == n2){
            // if(n2*n2 == (n1*n1)+ (n3*n3)){
            //     System.out.println("true");
            // }
            // else{
            //     System.out.println("false"); 
            // }

            boolean flag = (n2*n2 == (n1*n1)+ (n3*n3));
            System.out.println(flag);
        }
        else{
            // if(n3*n3 == (n1*n1)+ (n2*n2)){
            //     System.out.println("true");
            // }
            // else{
            //     System.out.println("false"); 
            // }

            boolean flag = (n3*n3 == (n1*n1)+ (n2*n2));
            System.out.println(flag);
        }
        

        sc.close();
    }
}
