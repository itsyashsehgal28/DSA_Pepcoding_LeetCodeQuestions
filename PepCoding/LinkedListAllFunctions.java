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
    
    void llsize(){
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
        }
        else if(size==1){
            System.out.print("removing :" + head.data);
            size--;
            head = tail = null;
        }
        else{
            System.out.print("removing :" + head.data);
            head = head.next;
            size--;
        }
        
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
        else if(idx<0 || idx>=size){
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
        else if(idx<0 || idx>=size){
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
        else if(idx<0 || idx>=size){
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

public class LinkedListAllFunctions {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLast(30);
        ll.addLast(20);
        ll.addLast(10);
        ll.llsize();
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