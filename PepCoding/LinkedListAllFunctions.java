// video 152 

public class LinkedListAllFunctions {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.display();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.display();
        ll.size();
        ll.removeFirst();
        ll.getFirst();
        ll.getLast();
        ll.removeLast();
        ll.display();
        ll.addFirst(40);
        ll.addFirst(20);
        ll.addFirst(50);
        ll.addAtIndex(3, 90);
        ll.display();
    }

    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null ;

            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next=temp;
                tail = temp;
            }
            size++;
        }

        void size (){
            System.out.println(size);
        } 

        void display(){
             if (size ==0){
                System.out.println("empty list");
                return;
            }
            Node temp = head;
            while(temp != null){
                int data = temp.data; 
                System.out.print(data + "=>");
                temp = temp.next;
            }
            System.out.println();
        }

        void removeFirst(){

            if (size ==0){
                System.out.println("empty list");
                return;
            }
            else if(size == 1){
                head = tail = null;
                size--;
                return;
            }
            else{
                int val = head.data;
                System.out.println("removing first value : " + val);
                head = head.next;
                size--;
            }
        }

        void getFirst(){
            if(size==0){
                System.out.println("List is empty");
                return ;
            }
            else{
                System.out.println(head.data);
            }
        }

        void getLast(){
            if(size==0){
                System.out.println("List is empty");
                return;
            }
            else{
                System.out.println(tail.data);
            }
        }

        void getAtIndex(int idx){
            if(size==0){
                System.out.println("List is empty");
                return;
            }
            else if(idx < 0 || idx >= size){
                System.out.println("Invalid Arguements");
                return;
            }
            else{
                Node temp = head;
                for(int i=0;i<idx;i++){
                    temp = temp.next;
                }
                System.out.println(temp.data);
            }  
        }

        void addFirst(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if(size==0){
                tail = temp;
            }
            size++;
        }

        void addAtIndex(int idx , int val){
            if(idx < 0 || idx >= size){
                System.out.println("invalid arguement");
            }
            else if(idx==0){
                addFirst(val);
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
                size++;
            }
        }

        void removeLast(){
            if(size==0){
                System.out.println("List is empty");
                return;
            }
            else if(size == 1){
                head = tail = null;
                size = 0;
            }
            else{
                Node temp = head;
                while(temp.next != tail){
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
                size--;
            }
        }

        void removeAtIndex(int idx){
             if(idx==0){
                removeFirst();
            }
            else if(idx == size- 1){
                removeLast();
            }
            else if(idx < 0 || idx >= size){
                System.out.println("invalid arguement");
            }
            else{
                Node temp = head;
                for(int i=0;i<idx-1;i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
            
        }
    }
}
