public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int data = 40;
        int flag=0;

        for(int i=0;i<arr.length;i++){
            if(data == arr[i]){
                System.out.println("Found at: " + (i+1));
                flag=1;
                break;
            }
        }

        if(flag==0){
            System.out.println("not found");
        }


     }
}
