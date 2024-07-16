// sorting , dsa basics done 
// queue , linked list all operations and main basic programs done palindrome left 



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
        if(top>max-1){
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
        if(size == max){
            System.out.println("queue overflow");
            return;
        }
        else if(size == 0){
            arr[++rear] = data;
            System.out.println("added " + data);
            front++;
        }
        else{
            arr[++rear] = data;
            System.out.println("added " + data);
        }

        size++;
    }
    
    void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]  + " ");
        }
    }
    
    void DeQueue(){
        if(size==0){
            System.out.println("underflow");
            return;
        }
        else if(size == 1){
            System.out.println("deleted value is " + arr[front]);  // rear or front doesnt matter , since pointing at same place
            rear = front = -1;
        }
        else {
            System.out.println("deleted value is :" + arr[front]);
            front++;
        }

        size++;
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




import java.util.*;

class Node{
    int data;
    Node next;
}

class LinkedList {
    Node head= null;
    Node tail= null;
    int size=0; 
    
    void addLast(int n){
            Node temp = new Node();
            temp.data = n;
            temp.next = null;
        if(size==0){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    
    void size(){
        System.out.println(size);
    }
    
    void display(){
        if(size==0){
            System.out.println("empty list");
            return;
        }
        Node temp = head ; 
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    void removeFirst(){
        if(size==0){
            System.out.println("empty list");
            System.out.println();
            return;
        }
        else if(size==1){
            System.out.print("removing :" + head.data);
            head = tail = null;
        }
        else{
            System.out.print("removing :" + head.data);
            head = head.next;
            }
            
        size--;
        System.out.println();
    }
    
    void getFirst(){
        if(size==0){
            System.out.println("empty list");
        }
        else{
            System.out.println("getting first node : " + head.data);
        }
    }
    
    void getLast(){
        if(size==0){
            System.out.println("empty list");
        }
        else{
            System.out.println("getting last node : " + tail.data); 
        }
    }
    
    void getAt(int idx){
        if(size==0){
            System.out.println("empty list");
            return;
        }
        else if(idx<0 || idx>size-1){
            System.out.println("invalid arguement");
            return;
        }
        else {
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp = temp.next;
            }
            
            System.out.println("data at idx "+ idx + " is : " + temp.data);
        }
    }
    
    void addFirst(int n){
        Node temp = new Node();
        temp.data = n;
        if(size==0){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    
    void addAtIndex(int idx , int val){
        if(idx==0){
            addFirst(val);
        }
        else if(idx<0 || idx>size){
            System.out.println("invalid arguement");
        }
        else if(idx == size){
            addLast(val);
        }
        else{
            Node nn = new Node();
            Node temp = head;
            nn.data = val;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
            size ++ ;
        }
    }
    
    void removeLast(){
        if(size==0){
            System.out.println("empty list");
        }
        else{
            System.out.println("data to be removed is : " + tail.data);
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
    void removeAtIndex(int idx){
        if(idx==0){
            removeFirst();
        }
        else if(idx<0 || idx>size){
            System.out.println("invalid arguement");
        }
        else if(idx == size-1){
            removeLast();
        }
        else{
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            
        }
    }
}

public class CustomLinkedList {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(30);
        ll.addLast(20);
        ll.addLast(10);
        ll.size();
        ll.display();
        ll.removeFirst();
        ll.display();
        ll.getFirst();
        ll.getLast();
        ll.addLast(5);
        ll.addLast(0);
        ll.getAt(3);
        ll.display();
        ll.addFirst(15);
        ll.display();
        ll.addAtIndex(3 , 500);
        ll.display();
        ll.removeLast();
        ll.removeAtIndex(1);
        ll.display();
        
    }
}
*/

// 370 fer 494 fer 503 505

