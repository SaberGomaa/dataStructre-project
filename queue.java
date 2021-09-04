package My project;
class Queue
{
 
    int rear =-1;
    int front=0;
    int []arr = new int[30];
public void Enqueue (int value){
        if (rear==30-1)
        {
            rear=-1;
        }
        arr[++rear]=value;
}
public int Dequeue (){
        if (front==30-1)
        {
            front=0;
        }
        return arr[front++];
}
public boolean Isfull(){
        return rear==30;
}
public boolean IsEmpty(){
        return rear==-1;
}
public int peek(){
        return arr[front];
}
public void display(){
        for(int i=front ; i<=rear ;i++)
            System.out.print(arr[i]+" ");
            System.out.println();
}
}
public class queue {
    public static void main(String[] args) {
        Queue q = new  Queue();
        q.Enqueue(0);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        q.Enqueue(6);
        q.Enqueue(7);
        q.display();
        q.Dequeue();
        q.Dequeue();
        q.display();
    }
}
