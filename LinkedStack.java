package My project;
class nod
   
{
    public char value;
    public nod next;
public nod(char value) {
        this.value = value;
}
}
class LinkedSt{
   public nod head=null;
public void insertFirst(char value){
       nod newN = new nod(value);
       newN.next=head;
       head=newN;
}    
public nod deleteFirst(){
     nod temp = head;
     head=head.next;
     return temp;
}    
public void display(){
        nod i = head;
        while(i!=null){
            System.out.print(i.value+" ");
            i=i.next;
        }
        System.out.println();
}    
}
public class LinkedStack {
    public static void main(String[] args) {
       LinkedSt l = new LinkedSt();
        l.insertFirst('a');
        l.insertFirst('h');
        l.insertFirst('m');
        l.insertFirst('e');
        l.insertFirst('d');
        l.display();
        l.deleteFirst();
        l.display();
    }
}
