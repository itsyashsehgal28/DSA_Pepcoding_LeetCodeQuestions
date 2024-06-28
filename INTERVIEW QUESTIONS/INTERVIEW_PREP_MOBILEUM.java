// sorting , dsa basics , how to make a function , how array dynamic and static is declared , queue , linked list all operations 

import java.util.*;

/*


public class Prime_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
            {
                System.out.println("not prime");
                flag=1;
                break;
            }
        }

        if(flag==0){
            System.out.println("prime");
        }
        sc.close();
    }
} 





public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=0;
        int b=1;

        for(int i=0;i<n;i++){
            System.out.print(a + " ");
            int sum = a+b ;
            a=b;
            b=sum;
        }
    }
}





public class Prime_Factorization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i +" ");
                n=n/i;
            }
        }

        if(n!=1){
            System.out.print(n);
        }
    }
}




class Stack {
    int max ;
    int[] arr;
    int top;
    
    Stack(int n){
        max = n;
        arr = new int[max];
        top = -1;
    }
    
    void push (int data){
        if(top>=max-1){
            System.out.println("overflow");
            return;
        }
        
        arr[++top] = data;
        System.out.println("pushed");
    }
    
    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]  + " ");
        }
    }
    
    void pop(){
        if(top == -1){
            System.out.println("underflow");
            return;
        }
        
        System.out.println("value to be deleted is:" + arr[top]);
        top--;
        
    }
}

public class CustomStack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        Stack st = new Stack(5);
        st.push(20);
        st.push(10);
        st.push(5);
        st.pop();
        st.display();
    }
}




import java.util.Scanner;

class Queue {
    int max ;
    int size;
    int[] arr;
    int rear , front;
    
    Queue(int n){
        max = n;
        arr = new int[max];
        rear = front = -1;
        size = 0;
    }
    
    void EnQueue (int data){
        if(size >=max-1){
            System.out.println("queue overflow");
            return;
        }
        else if(size == 0){
            arr[++rear] = data;
            System.out.println("added " + data);
            front++;
            size++;
            return;
        }
        else{
            arr[++rear] = data;
            System.out.println("added " + data);
            size++;
        }
    }
    
    void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]  + " ");
        }
    }
    
    void DeQueue(){
        if(size==0){
            System.out.println("underflow");
        }
        else if(size == 1){
            System.out.println("deleted value is " + arr[rear]);
            rear = front = -1;
            size --;
        }
        else {
            System.out.println("deleted value is :" + arr[front]);
            front++;
            size--;
        }
    }
    
    void size(){
        System.out.println(size);
    }
    
}

public class CustomQueue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        Queue q = new Queue(5);
        q.EnQueue(20);
        q.EnQueue(10);
        q.EnQueue(5);
        q.display();
        q.size();
        q.DeQueue();
    }
}

*/