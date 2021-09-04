package My project;
class nodeQ {
 
    public char value;
    public nodeQ next;

    nodeQ(char value) {
        this.value = value;
    }
}

class LinkedQ {

    public nodeQ head=null;
    public nodeQ last=null;

    public void addList(char value) {
        nodeQ newNode = new nodeQ(value);

        if (head == null) 
        {
            head = newNode; 
        } else {
            last.next = newNode; 
        }
        last = newNode;

    }

    public nodeQ deleteFirst() {
        nodeQ temp = head;
        head = head.next;
        return temp;

    }

    public void display() {
        nodeQ i = head;

        while (i != null) {
            System.out.print(i.value + "  ");
            i = i.next;
        }
        System.out.println("\n");
    }

}

public class LinkedQueue {

    public static void main(String[] args) {
        LinkedQ l = new LinkedQ();
        l.addList('a');
        l.addList('h');
        l.addList('m');
        l.addList('e');
        l.addList('d');

        l.display();

        l.deleteFirst();
        l.deleteFirst();
        l.display();

    }

}

