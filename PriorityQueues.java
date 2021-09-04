
package My project;
class Pqueue{
    int rear  =0 ;
    int front =0 ;
    int [] arr = new int [30];
public void Enqueue(int value){       
            int i;
            int k;
            for( i=0;i<=rear;i++){
                if(value < arr[i]){
                    break;
                }
            }
            for(  k=rear;k>i;k--){
                arr[k]=arr[k-1];
            }
            arr[k]=value;
            rear++;
}
public int Dequeue(){
        return arr[front++];
}
public int peek(){
        return arr[front];
}
public void display(){
        for(int i= front; i<rear; i++){
            System.out.print(arr[i]+"  ");
        }
}
}
public class PriorityQueues {
    public static void main(String[] args) {
        Pqueue pq= new Pqueue();
        pq.Enqueue(20);
        pq.Enqueue(22);
        pq.Enqueue(11);
        pq.Enqueue(94);
        pq.Enqueue(81);
        pq.Enqueue(17);
        pq.Enqueue(25);
        pq.Enqueue(20);
        pq.Enqueue(0);
        pq.display();
    }
}
