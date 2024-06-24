// video 152 

import java.util.*;
import java.io.*;


public class LinkedListAllFunctions {
    public static void main(String[] args){
        
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
                System.out.print("removing first value : " + val);
                head = head.next;
                size--;
            }
        }

        int getFirst(){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }
            else{
                return(head.data);
            }
        }

        int getLast(){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }
            else{
                return(tail.data);
            }
        }

        int getAtIndex(int idx){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }
            else if(idx < 0 || idx >= size){
                System.out.println("Invalid Arguements");
                return -1;
            }
            else{
                Node temp = head;
                for(int i=0;i<idx;i++){
                    temp = temp.next;
                }
                return temp.data;
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
