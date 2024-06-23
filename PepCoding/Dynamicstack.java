// video 139

class HiStack{
    int max = 5;
    int[] arr = new int[max];
    int top ;

    HiStack(){
        top = -1;
    }

    void isEmpty(){
        if(top == -1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    void push (int x){
        if(top == max-1){
            int[] narr= new int[2*max];
            for(int i=0;i<max;i++){
                narr[i] = arr[i];
            }
            arr = narr;
            arr[++top] = x;
            System.out.println("pushed : " + x);

        }
        else{
            arr[++top] = x ; 
            System.out.println("pushed : " + x);
        }
    }


    void pop (){
        if(top == -1){
            System.out.println("underflow");
        }
        else{
            int x = arr[top] ; 
            top--;
            System.out.println("popped : " + x);
        }
    }

    void size(){
        System.out.println(top+1);
    }

    void peek(){
        if(top == -1){
            System.out.println("underflow");
        }
        else{
            int x = arr[top];
            System.out.println(x);
        }
    }

    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}



public class Dynamicstack {
  public static void main (String args[])
  {
    HiStack stk = new HiStack();
      stk.push (20);
      stk.push (40);
      stk.push (60);
      stk.push(80);
      stk.push(100);
      stk.push(120);
      stk.display();
      stk.pop();
      stk.display();
      stk.size();
      stk.peek();

  }
}
