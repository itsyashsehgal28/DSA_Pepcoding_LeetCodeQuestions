// video 146


class CustomQueue {
    int front, rear, max , size;
    int queue[];

    CustomQueue(int n)
    {
        front = rear = size = 0;
        max = n;
        queue = new int[max];
    }

    
    void Enqueue(int data)
    {
        // check queue is full or not
        if (max == size) {
            System.out.printf("\nQueue is full\n");
            return;
        }

        // insert element at the rear
        else {
            queue[rear] = data;
            rear = (rear+1) % max;
            size++;
        }
        return;
    }

   
    void Dequeue()
    {

        if (size==0) {
            System.out.printf("\nQueue is empty\n");
            return;
        }
        else {
            int val = queue[front];
            front = (front+1) % max;
            size--;
            System.out.println(val + " was removed ");
        }
        return;
    }

    // print queue elements
    void Display()
    {
        if (size==0) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        // traverse front to rear and print elements
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print(queue[idx]);
        }
        System.out.println();
        return;
    }

    // print front of queue
    void Front()
    {
        if (size==0) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d",
                          queue[front]);
        return;
    }
}

public class CircularQueueinjava {

    // Driver code
    public static void main(String[] args)
    {
        // Create a queue of capacity 4
        CustomQueue q = new CustomQueue(4);
        
        
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        q.Display();
        q.Enqueue(60);
        q.Display();
        q.Dequeue();
        q.Dequeue();

        System.out.println("\n\nafter two node deletion\n\n");
        q.Display();
        q.Front();
    }
}
